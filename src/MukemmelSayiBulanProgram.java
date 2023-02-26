import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, total = 0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.print(number + " Mükemmel sayıdır.");
        } else {
            System.out.print(number + " Mükemmel sayı değildir.");
        }
    }
}
