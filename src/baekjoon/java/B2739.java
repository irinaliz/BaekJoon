package baekjoon.java;

import java.io.*;

public class B2739 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		for(int a= 1 ; a <= 9 ; a++) {
			System.out.println(i +" * "+ a + " = " + (i*a));
		}
	}

}
