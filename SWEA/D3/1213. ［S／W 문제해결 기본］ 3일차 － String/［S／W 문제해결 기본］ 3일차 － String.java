
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		for(int test_case = 1; test_case <= 10; test_case++) {
            br.readLine(); //1
            String words = br.readLine();
            String line = br.readLine();
            int count =0;

            int wordLen = words.length();
            
           
            for (int i = 0; i <= line.length()-wordLen; i++) {
               
            		String findword = line.substring(i, i+wordLen);
               		   if(findword.equals(words)) {
                	 		count++;
                		}
            }
			System.out.println("#" + test_case + " " + count);
		}
	}
}