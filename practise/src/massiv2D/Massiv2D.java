package massiv2D;

import java.util.Arrays;

public class Massiv2D {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 5;
        arr[0][2] = 7;
//        arr[0][3] = 21;
        arr[1][0] = 48;
        arr[1][1] = 13;
        arr[1][2] = 52;
//        arr[1][3] = 9;
//        arr[2][0] = 44;
//        arr[2][1] = 17;
//        arr[2][2] = 33;
//        arr[2][3] = 37;

        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);

        int[] srr = new int[2];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(i<1)srr[0] += arr[i][j];
                else srr[1] += arr[i][j];

            }

        }

        System.out.println(Arrays.toString(srr));

    }
}
