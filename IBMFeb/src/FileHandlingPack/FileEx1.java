package FileHandlingPack;
import java.io.*;
public class FileEx1 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("C:/FileHandling/three.txt");
		fw.write("Welcome to File Handling");
		fw.close();
		
		FileReader fr = new FileReader("C:/FileHandling/three.txt");
		int i = 0;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
