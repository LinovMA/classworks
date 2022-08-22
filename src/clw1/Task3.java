package clw1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Кошка");
        System.out.println("2 - Собака");
        System.out.println("3 - Лошадь");
        System.out.println("4 - Утка");
        System.out.println("5 - Лиса");
        System.out.print("Введите номер: ");
        int num = sc.nextInt();

        switch (num){
            case (1): {
                System.out.println("Мяуууу");
                break;
            }
            case (2): {
                System.out.println("Гав");
                break;
            }
            case (3): {
                System.out.println("Игого");
                break;
            }
            case (4): {
                System.out.println("Кря кря");
                break;
            }
            case (5): {
                System.out.println("Фыр фыр");
                break;
            }
            default:
                System.out.println("Попробуй еще раз");
        }
    }
}
