
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) // 10
		{
			String s = String.valueOf(test_case); //13
            // 받아와서 string으로
            int count = 0;
            for (char c : s.toCharArray()){
            	if ((c == '3') ||( c == '6') ||(c == '9')) {
                	count++;
                }
            }
            // 그 string을 char로 해서 3,6,9 검사, if -로, 아니면 그냥 숫자
            // clap 숫자로 
            
                // clap이 0> 갯수 만큼 - 
            if(count > 0) {
                for(int i = 0 ; i<count; i++){
            		System.out.print('-');
                }System.out.print(" ");
            }
            else {
            System.out.print(test_case + " ");
            }
		}
	}
}