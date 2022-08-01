import java.time.LocalDate;

public class Main {

    public static void printIfYearIsLeap(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.printf("%d - не високосный год\n", year);
        } else {
            System.out.printf("%d - високосный год\n", year);
        }
    }

    public static void checkOS(int osType, int productionYear) {
        int currentYear = LocalDate.now().getYear();
        if (osType == 0) {
            if (currentYear > productionYear) {
                System.out.println("Вам нужно установить Lite-версию приложения для iOS");
            } else {
                System.out.println("Вам нужно установить версию приложения для iOS");
            }
        } else if (osType == 1) {
            if (currentYear > productionYear) {
                System.out.println("Вам нужно установить Lite-версию приложения для Android");
            } else {
                System.out.println("Вам нужно установить версию приложения для Android");
            }
        } else {
            System.out.println("Не корректная версия ОС");
        }
    }

    public static int calculateDaysForDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            System.out.println("Вы не входите в зону доставки");
            return 0;
        }
    }

    public static void main(String[] args) {

        //Задание 1
        printIfYearIsLeap(1700);

        //Задание 2
        checkOS(1, 2020);

        //Задание 3
        System.out.println("Потребуется дней: " + calculateDaysForDelivery(95));

    }
}