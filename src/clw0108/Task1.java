package clw0108;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.print("Enter text: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print("Choose char: ");
        String chr = sc.nextLine();
        char chf = chr.charAt(0);
        int cont = 0;

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == chf) {
                cont++;
            }
        }
        System.out.print("Repetition " + cont);
        if (cont == 0) {
            System.out.println("Char error");
        }
    }


}


