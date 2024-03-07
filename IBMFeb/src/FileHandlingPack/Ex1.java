package FileHandlingPack;
import java.io.*;

public class Ex1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream f1 = new FileOutputStream("C:/FileHandling/two.txt");
		String s1 = "welcome to java";
		byte by[] = s1.getBytes();
		f1.write(by);
		f1.flush();
		f1.close();
		System.out.println("File Written");
		FileInputStream fis = new FileInputStream("C:/FileHandling/two.txt");
		
		int i = 0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i+",");
		}
		fis.close();
	}
}
