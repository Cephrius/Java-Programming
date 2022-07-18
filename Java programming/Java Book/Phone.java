import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Phone {
	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("phone.dat"));
		int invalid=0;
		while(f.hasNext())
			{
			String posNum=f.nextLine();
			String justNums="";
			String goodNum="";
			for(int i=0;i<posNum.length();i++)
				if(Character.isDigit(posNum.charAt(i)))
					justNums+=posNum.substring(i, i+1);
			if(justNums.length()==10)
				{
				goodNum=justNums.substring(0, 3)+"-"+justNums.substring(3, 6)+"-"+justNums.substring(6);
				out.println(goodNum);
				}
			else
				invalid++;
			}
		out.println(invalid + " invalid entries.");
	}
}
