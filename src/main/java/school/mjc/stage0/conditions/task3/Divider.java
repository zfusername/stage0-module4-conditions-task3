package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        String result = (number == 0) ? "cannot divide by zero" :
                ((number % 5 == 0 && number % 11 == 0) ? "Dividable" : "Non-dividable");
        System.out.println(result);
    }
}
