public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        double sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            sum2 += 1.0 / array[i];
        }

        System.out.println("Dizideki sayıların ortalaması: " + sum / array.length);
        System.out.println("Dizideki sayıların harmonik ortalaması: " + array.length / sum2);
    }
}