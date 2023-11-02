package practice.stackAndQueues;
import java.util.*;
import java.io.*;

public class test {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        sort(arr);
    }



    public static void sort(int [][] arr){
        int i = 0, j = arr.length;

        while(i>=j){
            if(arr[i][0]>arr[j][0]){
                int temp1 = arr[i][0];
                int temp2 = arr[i][1];

                arr[i][0] = arr[j][0];
                arr[i][1] = arr[j][1];

                arr[j][0] = temp1;
                arr[j][1] = temp2;
                i++;
            } else {
                int temp1 = arr[j][0];
                int temp2 = arr[j][1];

                arr[j][0] = arr[i][0];
                arr[j][1] = arr[i][1];

                arr[i][0] = temp1;
                arr[i][1] = temp2;
                j--;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println("arr[" + k + "][0] = " + arr[k][0] + ", arr[" + k + "][1] = " + arr[k][1]);
        }

    }

}
