package test;

import java.util.Arrays;

/**
 * @Author: cjh27
 * @Date: 2019/2/14
 */
public class TesSortDemo {


    public static void main(String[] args) {

        int[] arr = {12, 5, 33, 89, 17, 35, 22,111,2};

        sort(arr);

        System.err.print(Arrays.toString(arr));

//     5 12 33 89 17 35 22 111 2

    }


    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                     arr[j] = arr[j+1];

                     arr[j+1] = temp;
                }

            }
        }

    }

}
