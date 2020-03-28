public class Array2 {
    public static void main(String args[]) {
        int[] array = {10, 20, 30, 40, 50, 10};
        int sum = 0;
        //Advanced for loop

        System.out.println(array[3]);
 /*       for (int num : array) {
            sum = sum + num;
        }*/

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("Sum of array elements is:" + sum);
    }
}
