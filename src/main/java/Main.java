import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек разделить ваш счет?");

        int processAdd = command(scanner);


        //System.out.println("Добавленные товары: ");
        //System.out.println("Общая сумма: ");
        //System.out.println("Количество человек: " + countFriend(scanner));
        //System.out.println("Стоимость на каждого: ");



    }

    public static int countFriend(Scanner scanner) {
        while (true) {
            if(scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if(number <= 1) {System.out.println("Укажите число больше 1.");}
                else {return number;}

            } else {
                System.out.println("Необходимо указать целое число.");
                scanner.next();
            }

        }
    }

    public static int command(Scanner scanner) {
        System.out.println("Желаете добавить еще одно блюдо? (Укажите \"Завершить\" для завершения процесса или введите любые символы, для продолжения)");
        String dishAdd = scanner.next();
        if(dishAdd.equalsIgnoreCase("Завершить")) {
            return 1;
        } else {return 0;}
    }


}

