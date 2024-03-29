package practice.arrays;
import java.util.*;
public class floorAndCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        int lo = 0;
        int hi = arr.length-1;
        int floor = 0, ceil = 0;

        while(lo<=hi){
            int mid = (lo+hi)/2;

            if (d<arr[mid]){
                hi = mid-1;
                ceil = arr[mid];
            } else if (d>arr[mid]) {
                lo = mid+1;
                floor = arr[mid];
            } else {
                ceil = arr [mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }
}
