import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Parking {

	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("parking.dat"));
		int n = f.nextInt();f.nextLine();
		for(int numVeh=1;numVeh<=n;numVeh++)
			{
			String timeIn=f.next();
			String timeOut=f.next();
			int colon = timeIn.indexOf(":");
			int hourIn=Integer.parseInt(timeIn.substring(0, colon));
			int minIn=Integer.parseInt(timeIn.substring(colon+1));
			colon = timeOut.indexOf(":");
			int hourOut=Integer.parseInt(timeOut.substring(0, colon));
			int minOut=Integer.parseInt(timeOut.substring(colon+1));
			int hr;
			int min;
			if(hourIn<hourOut&&minIn!=minOut)
				{
				hr=hourOut-(hourIn+1);
				min=60-minIn+minOut;
				hr+=min/60;
				min=min%60;
				}
			else if(hourIn<hourOut&&minIn==minOut)
				{
				hr=hourOut-hourIn;
				min=0;
				}
			else if(hourIn>hourOut&&minIn!=minOut)
				{
				hr=(hourOut+24)-(hourIn+1);
				min=60-minIn+minOut;
				hr+=min/60;
				min=min%60;
				}
			else if(hourIn>hourOut&&minIn==minOut)
				{
				hr=(hourOut+24)-hourIn;
				min=0;
				}
			else
				{
				hr=0;
				min=minOut-minIn;
				}
			out.println(hr+" hours "+min+" minutes");
			}

	}

}
