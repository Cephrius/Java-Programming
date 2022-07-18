import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Toggle {

	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("toggle.dat"));
		int n = f.nextInt();
		f.nextLine();
		for(int x=1;x<=n;x++)
			{
			String toggledText = "";
			String oldText = f.nextLine();
			for(int i=0;i<oldText.length();i++)
				{
			    if(oldText.charAt(i)<97)
			    	toggledText+=oldText.substring(i, i+1).toLowerCase();
			    else
			    	toggledText+=oldText.substring(i, i+1).toUpperCase();
		   	    }
			out.println(toggledText);
			}
		}
	}
