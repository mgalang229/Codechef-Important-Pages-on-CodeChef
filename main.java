import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in
                                 
        int a = in.nextInt();
        int b = in.nextInt();
                                 
        String ans = "";
                                 
        if (a == 1 && b == 1) {
            ans = "https://discuss.codechef.com";
        } else if (a == 1) {
            ans = "https://www.codechef.com/contests";
        } else {
            ans = "https://www.codechef.com/practice";
        }
                                 
        System.out.println(ans);
    }
}
