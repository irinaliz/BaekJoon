package baekjoon.java;

import java.io.*;

public class B2438 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		
		for(int i = 1 ; i <= line; i ++) {
			for(int b = 0; b < i; b ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
