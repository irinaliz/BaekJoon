package baekjoon.java;

import java.io.*;
import java.util.StringTokenizer;

public class B10950 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		for(int a = 0; a < i ; a++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			System.out.println( Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) );
		}
	}

}
