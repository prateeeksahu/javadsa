package practice.arrays;
import java.util.*;

public class rotateAnArrayBy90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for(int i = 0; i< arr.length;++i){
            for(int j = 0; j<arr[0].length;++j){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i< arr.length;++i){
            for(int j = i; j<arr[0].length;++j){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0;i<arr.length;i++){
            int li = 0;
            int ri = arr[i].length-1;

            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }
        display(arr);
    }

    public static void display(int [][] arr){
        for(int i = 0; i< arr.length;++i){
            for(int j = 0; j<arr[0].length;++j){
                System.out.println(arr[i][j]);
            }
        }
    }
}
