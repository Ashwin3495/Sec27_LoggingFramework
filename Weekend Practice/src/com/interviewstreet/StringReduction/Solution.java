package com.interviewstreet.StringReduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {

	public static char redux(char left, char right) {

		if (left == 'a') {
			if (right == 'b')
				return 'c';
			if (right == 'c')
				return 'b';
		}

		if (left == 'b') {
			if (right == 'a')
				return 'c';
			if (right == 'c')
				return 'a';
		}

		if (left == 'c') {
			if (right == 'a')
				return 'b';
			if (right == 'b')
				return 'a';
		}

		return left;
	}


	public static int reduction(String a) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < a.length(); i++) {
			char res = a.charAt(i);
			while (!stack.empty()) {
				char peek = stack.peek();
				if (peek == res)
					break;
				else {
					char popped = stack.pop();
					res = redux(res, popped);
				}
			}
			stack.push(res);
		}
		return stack.size();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			String p = br.readLine();
			int res = Solution.reduction(p);
			System.out.println(res);
		}

	}

}