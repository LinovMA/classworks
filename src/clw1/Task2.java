package clw1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inter time: ");
        int t = sc.nextInt();

        if (t >= 0 && t < 6) {
            System.out.println("Добрый ночи!");
        } else if (t > 6 && t < 12) {
            System.out.println("Добрый день");
        } else if (t > 12 && t <= 23) {
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Это не время");
        }
    }
}
