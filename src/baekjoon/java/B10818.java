package baekjoon.java;

import java.io.*;
import java.util.*;

public class B10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		String[] st = br.readLine().split(" ");
		
		for(int i= 0; i <st.length ; i++) {
			list.add(Integer.parseInt(st[i]));
		}
		
		Collections.sort(list);
		System.out.println(list.get(0) +" " + list.get(list.size()-1));
	}

}