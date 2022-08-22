package clw2107;

public class Task4 {


    public static void main(String[] args) {

        Task4 n = new Task4();

        int[] r1 = n.array1();
        int[] r2 = n.array1();
        int ar1 = n.arithmetic(r1);
        int ar2 = n.arithmetic(r2);
    }

    public int[] array1() {
        int[] array1 = new int[5];
        int sum1 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 5));
            sum1 = sum1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println(sum1);
        return array1;

    }

    public int arithmetic(int[] r1) {
        int sum = 0;
        int arithmetic = 0;
        for (int i = 0; i < r1.length; i++) {
            sum += r1[i];
            arithmetic = sum / r1.length;
        }
        return arithmetic;
    }
}