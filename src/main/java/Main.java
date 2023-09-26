import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        StringBuilder menu = new StringBuilder();

        System.out.println("На сколько человек разделить ваш счет?");
        countFriend(scanner);
        int processAdd;
        do {
            System.out.println("Укажите название блюда:");
            String dish = scanner.next();
            while(dish.isEmpty()) {
                System.out.println("Название блюда не должно быть пустым.");
                dish = scanner.next();
            }
            menu.append(dish).append("\n");

            System.out.println("Укажите стоимость блюда:");


            System.out.println("Блюдо добавлено в список");


            System.out.println("Желаете добавить еще одно блюдо? (Укажите \"Завершить\" для завершения процесса или введите любые символы, для продолжения)");
            processAdd = enterCommand(scanner);
        } while(processAdd == 0);

        String resultMenu = menu.toString();
        System.out.println("Ваш заказ:");
        System.out.println(resultMenu);


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

    public static int enterCommand(Scanner scanner) {
        String dishAdd = scanner.next();
        int command;
        if(dishAdd.equalsIgnoreCase("Завершить")) {
            command = 1;
        } else {
            command = 0;
        }
        return command;
    }


}

