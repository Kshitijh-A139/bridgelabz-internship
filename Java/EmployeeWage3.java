class EmployeeWage3 {
  public static void main(String[] args) {
    System.out.println("Welcome to Employee Wage Computation Program");

    int attendance = (int) (Math.random() * 3);

    if (attendance == 1) {
      FullTimeEmployee fullTime = new FullTimeEmployee();
      fullTime.calculateWage();
    } else if (attendance == 2) {
      PartTimeEmployee partTime = new PartTimeEmployee();
      partTime.calculateWage();
    } else {
      System.out.println("Employee is absent");
    }
  }
}

class FullTimeEmployee {
  int wagePerHour = 20;
  int workingHours = 8;

  public void calculateWage() {
    int dailyWage = wagePerHour * workingHours;
    System.out.println("Employee Type: Full Time");
    System.out.println("Working hours per day: " + workingHours);
    System.out.println("Wage per hour: " + wagePerHour);
    System.out.println("Daily wage: " + dailyWage);
  }
}

class PartTimeEmployee {
  int wagePerHour = 20;
  int workingHours = 4;

  public void calculateWage() {
    int dailyWage = wagePerHour * workingHours;
    System.out.println("Employee type: Part time.");
    System.out.println("Working hours per day: " + workingHours);
    System.out.println("Wage per hour: " + wagePerHour);
    System.out.println("Daily wage: " + dailyWage);
  }
}
