import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Bullseye {

	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("bullseye.dat"));
		int s = f.nextInt();
		for(int i=1;i<=s;i++)
			{
			double x=f.nextDouble();
			double y=f.nextDouble();
			double d = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
			if(d<=0.5)
				out.println("Bullseye");
			else
				out.println("Miss");
			}
	}
}