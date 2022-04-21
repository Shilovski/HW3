package employees;

import java.util.Scanner;

public abstract class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public abstract double weeklyPay(int hoursWorked);

    public void setName(String employeeName) { this.name = employeeName; }


}
