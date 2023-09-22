import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек разделить ваш счет?");


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


}

