package practice.patterns;
import java.util.*;
public class printFibonnaciTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a=0,b=1;
        int c=0;

        for(int i=0;i<n;++i){
            for(int j=0;j<i;++j){
                System.out.print( a +"\t");
                c+=a+b;
                a=b; b=c;
            }
            System.out.println();
        }
    }
}
