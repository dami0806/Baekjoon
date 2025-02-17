import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Stack;


/**
 * 8
 * <p>
 * 4
 * 3
 * 6
 * 8
 * 7
 * 5
 * 2
 * 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        // 4받기

        Stack<Integer> stack = new Stack<>();
        int num;
        int plusstart = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            num = scan.nextInt();

            if (stack.isEmpty()) {
                for (int k = plusstart; k <= num; k++) { ////4까지 1,2,3,4 들어오기
                    stack.push(k);
                    plusstart++;
                    //System.out.println("+");
                    sb.append("+\n");
                }
                stack.pop(); //4 나가기
                sb.append("-\n");
                //System.out.println("-");
            } else {
                int top = stack.peek();

                if (stack.peek() < num) { // 비어있거나 top<num일때
                    for (int j = plusstart; j <= num; j++) { ////4까지 1,2, 들어오기
                        stack.push(j);
                        plusstart++;
                        sb.append("+\n");
                    }
                    stack.pop(); //4 나가기
                    sb.append("-\n");
                }
                if (stack.peek() == num) {
                    stack.pop();
                    sb.append("-\n");
                } else if (stack.peek() > num) {
                    sb = new StringBuilder();
                    sb.append("NO");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }
}