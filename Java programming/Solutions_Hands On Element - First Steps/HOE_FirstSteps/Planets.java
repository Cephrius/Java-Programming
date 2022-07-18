import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Planets {

	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("planets.dat"));
		String[] pNames = new String[9];
		long[] pDistances = new long[9];
		for(int x=0;x<=8;x++)
			{
			pNames[x]=f.next();
			pDistances[x]=f.nextLong();
			f.nextLine();
			}
		int t = f.nextInt();
		for(int x=1;x<=t;x++)
			{
			String departure=f.next();
			String destination=f.next();
			long d1=0,d2=0;
			for(int i=0;i<pNames.length;i++)
				{
				if(departure.equals(pNames[i]))
					d1=pDistances[i];
				if(destination.equals(pNames[i]))
					d2=pDistances[i];
				}
			long trip = Math.abs(d2-d1);
			out.println(departure+" to "+destination+" is "+trip+" kilometers.");
			}
	}
}