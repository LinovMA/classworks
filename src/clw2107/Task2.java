package clw2107;

public class Task2 {

    public static void main(String[] args) {

        int maxNumber = -16;
        int maxIndex = 0;


        int[] arrayRandom = new int[12];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = ((int) (Math.random() * 31) - 15);
            System.out.print(arrayRandom[i] + " ");
            if (maxNumber <= arrayRandom[i]) {
                maxNumber = arrayRandom[i];
            maxIndex = i;
            }
        }
        System.out.println();
        System.out.print("Индекс максимального числа " + maxIndex);

    }
}







