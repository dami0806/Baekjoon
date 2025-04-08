
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            st = new StringTokenizer(br.readLine());
            int startS = Integer.parseInt(st.nextToken());
            int startM = Integer.parseInt(st.nextToken());
             int endS = Integer.parseInt(st.nextToken());
             int endM = Integer.parseInt(st.nextToken());
            int answerS =0, answerM = 0;
            // 3 17 1 39
			// 8 22 5 10
			// 6 53 2 12   
 			if(startM + endM >= 60) {
            	answerM = startM+endM - 60;
                 answerS = (startS+endS) % 12;
                answerS++;
               
            }else {
            	answerM = startM+endM;
                 answerS = (startS+endS) % 12;
            }
            
		System.out.println("#" + test_case + " " + answerS + " " + answerM);
		}
	}
}