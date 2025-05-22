import java.util.*;
import java.io.*;

public class Solution {
	static int answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int test_case = 1; test_case <= 10; test_case++) {

			int N = Integer.parseInt(br.readLine()); // 181
			String s = br.readLine().trim(); // (({<(({{[[[[<<[[(<[[{([{{{[<[[[
			answer = 0;
			if (s.length() % 2 == 1) {
				System.out.println("#" + test_case + " " + answer);
				continue;
			} else {
				sol(s);
			}

			// 스택이 비지 않거나, 없는데 pop을 했다면 안됨

			System.out.println("#" + test_case + " " + answer);

		}
	}

	static void sol(String s) {
		Stack<Character> stack = new Stack<>();
		// ()', '[]', '{}', '<>'

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{' || c == '<') {
				stack.add(c);
			} else {
				if (stack.isEmpty()) {
					return;
				}

				if (c == ')' && stack.peek() == '(') {
					stack.pop();
				} else if (c == ']' && stack.peek() == '[') {
					stack.pop();
				} else if (c == '}' && stack.peek() == '{') {
					stack.pop();
				} else if (c == '>' && stack.peek() == '<') {
					stack.pop();
				}else {
					return;
				}
			}
		}
		if (stack.isEmpty()) {
			answer = 1;
			return;
		}
	}
}