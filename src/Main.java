public class Main {
    public static void main(String[] args) {
        int[] array = {10,9,18,22,46,17};
        int min = Integer.MIN_VALUE;
        int max = min;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                max = min;
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}