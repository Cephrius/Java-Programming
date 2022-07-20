import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Case {

	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("case.dat"));
		int n = f.nextInt();
		f.nextLine();
		for(int x=1;x<=n;x++)
			{
			String changed = "";
			Scanner line = new Scanner(f.nextLine());
			int c = line.nextInt();
			switch(c)
				{
				case 1:String firstWord=line.next();
					   changed+=firstWord.substring(0, 1).toUpperCase()+firstWord.substring(1).toLowerCase()+" ";
					   while(line.hasNext())
					   	   {
						   String nextWord=line.next();
						   changed+=nextWord.toLowerCase()+" ";
						   if(nextWord.charAt(nextWord.length()-1)=='.')
							   if(line.hasNext())
							       {
								   nextWord=line.next();
								   changed+=nextWord.substring(0, 1).toUpperCase()+nextWord.substring(1).toLowerCase()+" ";
							       }
					   	   }
					   break;
				case 2:changed+=line.nextLine().toLowerCase().substring(1);
					   break;
				case 3:changed+=line.nextLine().toUpperCase().substring(1);
				       break;
				case 4:while(line.hasNext())
					        {
							String nextWord=line.next();
							changed+=nextWord.substring(0, 1).toUpperCase()+nextWord.substring(1).toLowerCase()+" ";
					        }
					   break;
				case 5:while(line.hasNext())
					   {
					   String nextWord=line.next();
					   String toggleWord="";
					   for(int i=0;i<nextWord.length();i++)
					   	    {
						    if(nextWord.charAt(i)<97)
						    	toggleWord+=nextWord.substring(i, i+1).toLowerCase();
						    else
						    	toggleWord+=nextWord.substring(i, i+1).toUpperCase();
					   	    }
					   changed+=toggleWord+" ";
					   }
				}
				out.println(changed);
			}
		}
	}
