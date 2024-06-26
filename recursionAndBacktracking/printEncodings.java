package practice.recursionAndBacktracking;
import java.util.*;
public class printEncodings {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str  = sc.nextLine();
        print(str, "");
    }
    public static void print(String ques, String csf){
        if(ques.length() == 0 ){
            System.out.println(csf);
            return;
        } else if (ques.length()==1) {
            char ch = ques.charAt(0);
            if(ch == '0'){
                return;
            } else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                System.out.println(csf+code);
            }
        } else{
            char ch = ques.charAt(0);
            String ros = ques.substring(1);

            if(ch == 0){
                return;
            } else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                print(ros, csf+code);
            }

            String ch12 = ques.substring(0,2);
            String roq = ques.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if(ch12v<=26){
                char code = (char)('a' + ch12v - 1);
                print(roq, csf+code);
            }

        }
    }
}
