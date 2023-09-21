import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countFriend = 0;

        while (countFriend <= 1) {
            System.out.println("На сколько человек разделить ваш счет?");
            countFriend = scanner.nextInt();
            if(countFriend == 1) {System.out.println("Нет смысла делить счет!");}
            else {System.out.println("Введенное число некорректно.");}
        }
        System.out.println("Выполняем код дальше");

    }
}