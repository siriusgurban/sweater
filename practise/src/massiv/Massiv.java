package massiv;

import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {

        double[] arr = new double[4];
        arr[0]= 10;
        arr[1]= 20;
        arr[2]= 45;
        arr[3]= 37;


        double sum = 0;

        int i = 0;
        while (i<arr.length){
            sum += arr[i];
            i++;
        }

        System.out.println(sum);


        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println(Arrays.toString(arr));

    }
}
