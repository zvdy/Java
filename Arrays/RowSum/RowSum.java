package Arrays.RowSum;

    // Method to display the array given a parameter
    public class RowSum {
        public static void display(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Method to calculate the sum of each row
        public static int[] rowSum(int[][] array) {
            int[] sum = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum[i] += array[i][j];
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            display(arr);
            int[] sum = rowSum(arr);
            for (int i = 0; i < sum.length; i++) {
                System.out.println("Sum of row " + i + " is " + sum[i]);
            }
        }
    }
