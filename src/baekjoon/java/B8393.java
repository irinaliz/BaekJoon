package baekjoon.java;

import java.io.*;

public class B8393 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		int b= 0;
		
		for(int i = 1; i<=a; i++) {
			b += i;
		}
		System.out.println(b);

	}

}
