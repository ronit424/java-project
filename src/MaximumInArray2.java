import java.util.Scanner;

public class MaximumInArray2 {
    public static void main(String[] args)
    {
       int number[] = {5,8,2,10,1,3,5};
       int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (max < number[i])      {
                max = number[i];

            }
        }

        System.out.println(max);
    }
}
