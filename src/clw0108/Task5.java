package clw0108;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String str = sc.nextLine();
        String [] array = str.split(" ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() % 2 == 0){
                count ++;
            }
        }
        System.out.print("колличество слов с четным колличеством букв: "+ count);

    }


}
