public class DiverseArray {
    public static int arraySum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count;
    }
    public static int[] rowSums(int[][] array2d) {
        int[] rowSums = new int[array2d.length];
        for (int i = 0; i < array2d.length; i++) {
            rowSums[i] = arraySum(array2d[i]);
        }
        return rowSums;
    }
    public static boolean isDiverse(int[][] array2d) {
        int[] rowSums = rowSums(array2d);
        for (int i = 0; i < rowSums.length; i++) {
            for (int j = i + 1; j< rowSums.length; j++) {
                if (rowSums[i] == rowSums[j]) {
                    return false;
                }
            }
        }
        return true;
    }


}
