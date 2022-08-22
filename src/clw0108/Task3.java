package clw0108;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.print("Введите предложение: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] array = str.split(" ");
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i].length();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum / array.length);
    }
}
