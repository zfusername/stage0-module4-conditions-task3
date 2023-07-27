package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
//    implement the program that will consume salary from method argument as input of an employee
//    and calculate its salary after taxes according to the following: Basic Salary <= 10000: taxes - 15%.
//            10000 < Basic Salary <= 20000: taxes - 18% Basic Salary > 20000 : taxes - 20% Basic
//    salary < 0 -> "wrong input!"
    public void calculateSalary(int salary) {
        if(salary <= 10000 && salary > 0){
            System.out.println(salary - ((salary * 15.0) / 100.0));
        } else if(salary > 10000 && salary <= 20000) {
            System.out.println(salary - ((salary * 18.0) / 100.0));
        } else if(salary > 20000){
            System.out.println(salary - ((salary * 20.0) / 100.0));
        } else if(salary < 0){
            System.out.println("wrong input!");
        }
    }
}
