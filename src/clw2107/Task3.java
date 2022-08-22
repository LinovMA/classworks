package clw2107;

public class Task3 {

    public static void main(String[] args) {

        int[] arrayRandom = new int[8];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = ((int) (Math.random() * 10) + 1);
            System.out.print(arrayRandom[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arrayRandom.length; i++) {
            if (i % 2 != 0 || i == 0){
                arrayRandom [i] = 0;
            }
            System.out.print(arrayRandom[i] + " ");

        }
    }





}
