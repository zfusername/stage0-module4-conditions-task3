package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;

            case 4: case 6: case 9: case 11:
                days = 30;
                break;

            case 2:
                days = 28; // Assuming non-leap year, change to 29 for leap years
                break;

            default:
                System.out.println("wrong number!");
                return;
        }

        System.out.println(days);
    }
    }

