import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.*;


/**
 * 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지
 */
public class Main {

    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 1;
    int start_index = 1;
    int end_index = 1;
    int sum = 1;
    while (end_index != N) {
      if (sum == N) {         //sum == N ->  End index++;  sum = sum + End index;  count++;  
        count++;
        end_index++;
        sum = sum + end_index;
      } else if (sum > N) {   //sum > N ->  sum = sum - Start index;  Start index++;
        sum = sum - start_index;
        start_index++;
      } else {                //sum < N ->  End index++;  sum = sum + End index;
        end_index++;
        sum = sum + end_index;
      }
    }
    System.out.println(count);
  
    }
}
