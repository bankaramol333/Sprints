package ExceptionHandlingPractice1;

import java.util.*;
import java.io.*;

class EmptyFile extends Exception {
	public EmptyFile(String msg) {
		super(msg);
	}
}

public class EmptyFileException {
	public static String checkFile(File file) throws EmptyFile {
		try {

			FileReader fr = new FileReader(
					"C:/Users/amobhagw/eclipse-workspace/CapgeminiM1Practice/src/ExceptionHandlingPractice1/abc.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				return "Not Empty";
			}
			throw new EmptyFile("file is empty");
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String[] args) {
		try {
			File file = new File("abc.txt");
			System.out.println(checkFile(file));
		} catch (EmptyFile e) {
			System.out.println(e.getMessage());
		}
	}
}
