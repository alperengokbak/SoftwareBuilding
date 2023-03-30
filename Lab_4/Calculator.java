package Lab_4;

//Alperen Gökbak-21070006205
public class Calculator{

    public static double complexCalculation(int x, double y, boolean flag, String str, int[] array, double[] doubleArray) {
        
        try {
            assert x >= 0 : "x should be greater than or equal to 0";
            assert !Double.isNaN(y) && !Double.isInfinite(y) : "y should not be NaN or infinite";
            assert str != null && !str.isEmpty() : "str should not be null or empty";
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (!flag) {
            x++;
        }
        
        if (array == null || array.length == 0) {
            array = new int[] {0};
        }
        
        if (doubleArray != null) {
            for (int i = 0; i < doubleArray.length; i++) {
                if (Double.isNaN(doubleArray[i]) || Double.isInfinite(doubleArray[i])) {
                    doubleArray[i] = Double.MAX_VALUE;
                }
            }
        }
        
        double result = (x + y) * array[0] * str.length();
        
        if (doubleArray != null) {
            for (double d : doubleArray) {
                result -= d;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] emptyArray = null;
        double[] testArray = {1.0, Double.NaN, 2.0, Double.POSITIVE_INFINITY};
        double result = complexCalculation(0, Double.NaN, true, "test", emptyArray, testArray);
        System.out.println(result);
        
        int[] emptyArray2 = new int[]{};
        double[] testArray2 = {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
        double result2 = complexCalculation(-1, Double.NaN, false, "", emptyArray2, testArray2);
        System.out.println(result2);

        int[] array3 = new int[]{1, 3, 4, 6};
        double[] doublearray3 = {2.0, 3.1};
        double result3 = complexCalculation(1, 2.0, true, "", array3, doublearray3);
        System.out.println(result3);
    }
}