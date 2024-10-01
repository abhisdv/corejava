package file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderpgm {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\admin\\OneDrive\\Desktop\\demotext.txt");
		FileReader fr= new FileReader(f);
		int size=(int) f.length();
		char [] arr= new char [size];
		 fr.read(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("data is read successfully");
		for (char c : arr) {
			System.out.print(c+"");
		}
	}
}
