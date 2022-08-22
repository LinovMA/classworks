package clw1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Inter day number: ");
        int num = sc.nextInt();


        switch (num) {

            case (1): {
                System.out.println("This is monday");
                break;
            }
            case (2): {
                System.out.println("This is tuesday");
                break;
            }
            case (3): {
                System.out.println("This is wednesday");
                break;
            }
            case (4): {
                System.out.println("This is thursday");
                break;
            }
            case (5): {
                System.out.println("This is friday");
                break;
            }
            case (6): {
                System.out.println("This is saturday");
                break;
            }
            case (7): {
                System.out.println("This is sunday");
                break;
            }
            default:
                System.out.println("What is it?");
        }




    }
}
