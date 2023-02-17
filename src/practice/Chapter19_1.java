package practice;

import java.io.FileWriter;
import java.io.IOException;

public class Chapter19_1 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\pleiades\\workspace\\test.txt", true);
			fw.write("あいうえお");
		} catch (IOException e) {
			System.out.println("エラーです");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}