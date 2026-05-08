package Day4;

import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {

        Random random = new Random();

        int attendance = random.nextInt(3);

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

