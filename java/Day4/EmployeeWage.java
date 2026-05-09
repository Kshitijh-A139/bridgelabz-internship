package Day4;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int attendance = (int) (Math.random() * 3);

        if (attendance == 1) {

            System.out.println("Employee is Present");

            FullTimeEmployee fullTime = new FullTimeEmployee();
            fullTime.calculateWage();

        } else if (attendance == 2) {

            System.out.println("Employee is Present");

            PartTimeEmployee partTime = new PartTimeEmployee();
            partTime.calculateWage();

        } else {

            System.out.println("Employee is Absent");
        }
    }
}

class FullTimeEmployee {

    int wagePerHour = 20;
    int workingHours = 8;

    public void calculateWage() {

        int dailyWage = wagePerHour * workingHours;

        System.out.println("Employee Type : Full Time");
        System.out.println("Working Hours : " + workingHours);
        System.out.println("Daily Wage : " + dailyWage);
    }
}

class PartTimeEmployee {

    int wagePerHour = 20;
    int workingHours = 4;

    public void calculateWage() {

        int dailyWage = wagePerHour * workingHours;

        System.out.println("Employee Type : Part Time");
        System.out.println("Working Hours : " + workingHours);
        System.out.println("Daily Wage : " + dailyWage);
    }
}