package employees;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
    private double hourlyWage;

    public HourlyEmployee(String name, double wage) {
        super.setName(name);
        this.hourlyWage = wage;
    }

    @Override
    public double weeklyPay(int hoursWorked) {
        double pay = hoursWorked * hourlyWage;
        if (hoursWorked > 40)
            pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
        return pay;
    }

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new HourlyEmployee("Morgan, Harry", 30);
        staff[1] = new SalariedEmployee("Lin, Sally", 52000);
        staff[2] = new Manager("Smith, Mary", 104000, 50);

        Scanner in = new Scanner(System.in);
        for (Employee e : staff) {
            System.out.print("Hours worked by " + e.getName() + ": ");
            int hours = in.nextInt();
            System.out.println("Salary: " + e.weeklyPay(hours));
        }
    }
}
