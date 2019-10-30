package com.student.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteFile {

	static String reverseWords(String str) {

		String s[] = str.split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		System.out.println("Reversed String:");
		System.out.println(ans.substring(0, ans.length() - 1));
		return ans;
	}

	public static void main(String[] args) throws IOException {

		File f1 = new File("C:\\Users\\MANJUNATHA JEERLA\\Desktop\\docs.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);

		String s = br.readLine();
		
		s=reverseWords(s);
		
		// Writing data
		File f2 = new File("C:\\Users\\MANJUNATHA JEERLA\\Desktop\\Manju5.txt");
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