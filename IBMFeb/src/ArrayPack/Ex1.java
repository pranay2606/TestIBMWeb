package ArrayPack;
import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		int i[] = {1,5,3,7,6};
		int x[] = new int[5];
		x[0]=120;
		x[1]=120;
		x[2]=400;
		String s1[] = new String[3];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Values of String Array");
		s1[0]=scan.nextLine();
		s1[1]=scan.nextLine();
		s1[2]=scan.nextLine();

		for (int j=0;j<s1.length;j++) {
			System.out.println(s1[j]);
		}
		for (int j:i){
			System.out.println(j);
		}
	}
}
