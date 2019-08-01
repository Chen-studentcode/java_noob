import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	public static void main(String avgv[]) throws IOException {
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("½Ð¿é¤J¥b®|: ");
		String intR =console.readLine();	
		Double pi = 3.14;
		
		System.out.println("¶ê©P:"+2*Integer.parseInt(intR)*pi);
		System.out.println("¶ê­±¿n:"+Integer.parseInt(intR)*Integer.parseInt(intR)*pi);	
		}
}
