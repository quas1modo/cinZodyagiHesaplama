import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Değişkenler tanımlandı
        int birthYear, zodiacSign;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Birth Year: ");
        birthYear = input.nextInt();
        System.out.print("Your Chinese Zodiac Sign: ");
        zodiacSign = birthYear % 12;

        if (zodiacSign == 0) {
            System.out.println("Monkey");
        } else if (zodiacSign == 1) {
            System.out.printf("Cockerel");
        } else if (zodiacSign == 2) {
            System.out.println("Dog");
        } else if (zodiacSign == 3) {
            System.out.println("Pig");
        } else if (zodiacSign == 4) {
            System.out.println("Mouse");
        } else if (zodiacSign == 5) {
            System.out.println("Ox");
        } else if (zodiacSign == 6) {
            System.out.println("Tiger");
        } else if (zodiacSign == 7) {
            System.out.println("Rabbit");
        } else if (zodiacSign == 8) {
            System.out.println("Dragon");
        } else if (zodiacSign == 9) {
            System.out.println("Snake");
        } else if (zodiacSign == 10) {
            System.out.println("Horse");
        } else if (zodiacSign == 11) {
            System.out.println("Sheep");
        }

    }
}

