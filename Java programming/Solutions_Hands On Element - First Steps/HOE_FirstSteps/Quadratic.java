import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Quadratic {

	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("quadratic.dat"));
		int n = f.nextInt();
		for(int x=1;x<=n;x++){
			int a = f.nextInt();
			int b = f.nextInt();
			int c = f.nextInt();
			int d = b*b-4*a*c;
			if(d<0)
				out.println("No real solution.");
			else{
				double x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
				double x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
				if(x1==x2)
					out.printf("%.4f\n", x1);
				else
					out.printf("%.4f %.4f\n", x1,x2);
			}
		}
	}
}
