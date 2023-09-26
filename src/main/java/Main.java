import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        StringBuilder menu = new StringBuilder();

        System.out.println("На сколько человек разделить ваш счет?");
        int friends = countFriend(scanner);
        int processAdd;
        double total = 0;
        do {
            System.out.println("Укажите название блюда:");
            String dish = scanner.next();
            while(dish.isEmpty()) {
                System.out.println("Название блюда не должно быть пустым.");
                dish = scanner.next();
            }
            menu.append(dish).append("\n");

            System.out.println("Укажите стоимость блюда:");
                total = total + checkPrice(scanner);


            System.out.println("Блюдо добавлено в список");


            System.out.println("Желаете добавить еще одно блюдо? (Укажите \"Завершить\" для завершения процесса или введите любые символы, для продолжения)");
            processAdd = enterCommand(scanner);
        } while(processAdd == 0);

        //Выводим калькулятор
        double calculate = total / (double)friends;
        String bill = String.format("%.2f", calculate);
        String sum = String.format("%.2f", total);

        Ruble rubleSum = new Ruble();
        Ruble rubleBill = new Ruble();
        String changeRubleSum = rubleSum.recieveRuble(total);
        String changeRubleBill = rubleBill.recieveRuble(calculate);

        String resultMenu = menu.toString();
        System.out.println("Добавленные блюда:");
        System.out.println(resultMenu);
        System.out.println("Стоимость заказа:");
        System.out.println(sum + changeRubleSum);
        System.out.println("Количество гостей:");
        System.out.println(friends);
        System.out.println("Стоимость чека на каждого:");
        System.out.println(bill + changeRubleBill);

    }

    //Обрабатываем вывод количества друзей
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

    //Обрабатываем вывод суммы
    public static double checkPrice (Scanner scanner) {
        while (true) {
            if(scanner.hasNextDouble()) {
                double price = scanner.nextDouble();
                if(price <= 0) {System.out.println("Укажите число больше 0.");}
                else {return price;}

            } else {
                System.out.println("Необходимо указать число.");
                scanner.next();
            }

        }
    }

    //Решаем, завершать ли нам добавление блюд или продолжать
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

