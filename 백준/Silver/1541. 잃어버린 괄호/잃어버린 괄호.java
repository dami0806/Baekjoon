
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //10+20-30+40
        String[] parts = br.readLine().split("-");

        // 처음더하고, 다 빼기
        int sum=0;
        sum+=changeInt(parts[0]);
        for(int i = 1; i<parts.length; i++){
            sum-=changeInt(parts[i]);
        }
        System.out.println(sum);

    }
    static int changeInt(String s) {
        int sum =0;
        String str[] = s.split("\\+");
        for(int i=0; i< str.length; i++) {
            sum+=Integer.parseInt(str[i]);
        }
        return sum;
    }
}