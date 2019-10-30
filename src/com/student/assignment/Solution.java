package com.student.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Solution {

	private int pos = 0;

	public  String decodeString(String s) {
		StringBuilder sb = new StringBuilder();
		String num = "";
		for (int i = pos; i < s.length(); i++) {
			if (s.charAt(i) != '[' && s.charAt(i) != ']' && !Character.isDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
			} else if (Character.isDigit(s.charAt(i))) {
				num += s.charAt(i);
			} else if (s.charAt(i) == '[') {
				pos = i + 1;
				String next = decodeString(s);
				for (int n = Integer.valueOf(num); n > 0; n--)
					sb.append(next);
				num = "";
				i = pos;
			} else if (s.charAt(i) == ']') {
				pos = i;
				return sb.toString();
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		
		Solution ss=new Solution();
		File f1 = new File("C:\\Users\\MANJUNATHA JEERLA\\Desktop\\encode.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);

		String s = br.readLine();
		s=ss.decodeString(s);
		
		
		
		// Writing data
		File f2 = new File("C:\\Users\\MANJUNATHA JEERLA\\Desktop\\decode.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		while (s != null) {
			bw.write(s);
			bw.newLine();
			// reverseWords(s);
			System.out.println(s);
			s=br.readLine();

		}
		bw.flush();
		bw.close();
	}

}