package clw0108;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose number: ");
        int num = sc.nextInt();
        String str = "";


        for (int i = 1; i < 1000; i++) {
            if (str.length() >= 1000) {
                break;
            } else {
                str = str + i;
            }
        }
        System.out.println(str);
        System.out.println(str.charAt(num));


    }
}
