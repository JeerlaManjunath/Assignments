package com.student.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LinesCounts {

	public static void main(String args[]) throws IOException {

		try {
			FileReader fr;
			BufferedReader br;
			File f;
			String str;
			int i = 0, cnt = 0;
			while (args[i] != null) {
				f = new File(args[i]);
				fr = new FileReader(f);
				br = new BufferedReader(fr);

				while ((str = br.readLine()) != null)
					cnt++;
				System.out.println("File Name : " + f.getName() + " Total Lines : " + cnt);
				cnt = 0;
				i++;
				fr.close();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("Exception : " + e);
		}
	}
}
