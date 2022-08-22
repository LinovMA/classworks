package clw2107;

import java.util.Scanner;

public class HowMany {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слова: ");
        String input = sc.nextLine();
        int slova = 0;


        if(input.length() !=0)
        slova ++;{
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '\u0020'){
                slova++;
                }

            }
        }

        System.out.println("Вы ввели " +slova+ " слов(а)!");
    }

}