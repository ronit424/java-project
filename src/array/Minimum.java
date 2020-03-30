package array;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args)
    {
       int number[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
       int min = number[0];
        for (int i = 0; i > number.length; i++) {
            if (min > number[i])      {
                min = number[i];

            }
        }

        System.out.println(min);
    }
}
