package Lab_10;

public class FloorAndCeil {

    public static int floor(int[] array, int low, int high, int number) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (array[mid] == number) {
            return array[mid];
        }

        if (mid > 0 && array[mid - 1] <= number && number < array[mid]) {
            return array[mid - 1];
        }

        if (number < array[mid]) {
            return floor(array, low, mid - 1, number);
        } else {
            return floor(array, mid + 1, high, number);
        }
    }

    public static int ceil(int[] array, int low, int high, int number) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (array[mid] == number) {
            return array[mid];
        }

        if (mid < array.length - 1 && array[mid] < number && number <= array[mid + 1]) {
            return array[mid + 1];
        }

        if (number > array[mid]) {
            return ceil(array, mid + 1, high, number);
        } else {
            return ceil(array, low, mid - 1, number);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 7, 8, 9};

        for (int i = 1; i < 10; i++) {
            int floorValue = floor(array, 0, array.length - 1, i);
            int ceilValue = ceil(array, 0, array.length - 1, i);
            System.out.println("Number " + i + ": " + "Ceil: " + ceilValue +  " Floor: " + floorValue);
        }
    }
}
