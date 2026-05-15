import java.util.*;

interface EmpWage {
    void addCompany(String name, int wagePerHour, int fullDayHours, int partTimeHours, int workingDays, int maxHours);

    void getTotalWage(String companyName);
}

class CompanyEmpWage {
    String companyName;
    int wagePerHour;
    int fullDayHours;
    int partTimeHours;
    int workingDays;
    int maxHours;
    int totalWage;

    List<Integer> dailyWages = new ArrayList<>();

    CompanyEmpWage(String companyName, int wagePerHour, int fullDayHours, int partTimeHours, int workingDays,
            int maxHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.fullDayHours = fullDayHours;
        this.partTimeHours = partTimeHours;
        this.workingDays = workingDays;
        this.maxHours = maxHours;
    }

    void computeWage() {
        int totalHours = 0, days = 0;
        dailyWages.clear();
        totalWage = 0;

        while (days < workingDays && totalHours < maxHours) {
            days++;
            int attendance = new Random().nextInt(3);
            int hoursWorked;

            // FIX 1: Added 'break' after case 2 to prevent fall-through to default
            // (hoursWorked = 0)
            switch (attendance) {
                case 1:
                    hoursWorked = fullDayHours;
                    break;
                case 2:
                    hoursWorked = partTimeHours;
                    break; // ← was missing
                default:
                    hoursWorked = 0;
                    break;
            }

            if (totalHours + hoursWorked > maxHours) {
                hoursWorked = maxHours - totalHours;
            }

            int dailyWage = hoursWorked * wagePerHour;
            dailyWages.add(dailyWage);
            totalWage += dailyWage;
            totalHours += hoursWorked;
        }
    }

    public String toString() {
        return String.format("%-15s | Total Wage: %-8d | Daily: %s", companyName, totalWage, dailyWages);
    }
}

class EmpWageBuilder implements EmpWage {
    private List<CompanyEmpWage> companies = new ArrayList<>();

    public void addCompany(String name, int wagePerHour, int fullDayHours, int partTimeHours, int workingDays,
            int maxHours) {
        CompanyEmpWage c = new CompanyEmpWage(name, wagePerHour, fullDayHours, partTimeHours, workingDays, maxHours);
        c.computeWage();
        companies.add(c);
    }

    public int getTotalWageByCompany(String companyName) {
        return companies.stream()
                .filter(c -> c.companyName.equalsIgnoreCase(companyName)) // ← was "c c->"
                .mapToInt(c -> c.totalWage)
                .findFirst()
                .orElse(-1);
    }

    void printAll() {
        System.out.println("Company Wage Details:");
        for (CompanyEmpWage c : companies) { // ← was "CompanyWage"
            System.out.println("Company name: " + c.companyName);
            System.out.println("Total wage: " + c.totalWage);
            System.out.println("Daily wages: " + c.dailyWages);
        }
    }

    @Override
    public void getTotalWage(String companyName) {
        throw new UnsupportedOperationException("Unimplemented method 'getTotalWage'");
    }
}

public class EmployeeWage4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.print("How many companies do you want to add? ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for company " + (i + 1) + ":");
            System.out.print("Company Name: ");
            String name = scan.nextLine();
            System.out.print("Wage per Hour: ");
            int wagePerHour = scan.nextInt();
            System.out.print("Full Day Hours: ");
            int fullDayHours = scan.nextInt();
            System.out.print("Part Time Hours: ");
            int partTimeHours = scan.nextInt();
            System.out.print("Working Days: ");
            int workingDays = scan.nextInt();
            System.out.print("Max Hours per Month: ");
            int maxHours = scan.nextInt();
            scan.nextLine();

            empWageBuilder.addCompany(name, wagePerHour, fullDayHours, partTimeHours, workingDays, maxHours);
        }

        System.out.print("Enter company name to get total wage: ");
        String queryCompany = scan.nextLine();
        int wage = empWageBuilder.getTotalWageByCompany(queryCompany); // ← was "builder"

        if (wage == -1) {
            System.out.println("Company not found.");
        } else {
            System.out.println("Total wage for " + queryCompany + ": " + wage);

            empWageBuilder.printAll();
        }

        scan.close();
    }
}