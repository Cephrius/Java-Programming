import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Code {

	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("code.dat"));
		int n = f.nextInt();f.nextLine();
		String secretCode = f.nextLine();
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		for(int x=1;x<=n;x++)
			{
			String deCodedNote = "";
			Scanner codedNote = new Scanner(f.nextLine());
			while(codedNote.hasNext())
				{
				String w=codedNote.next();
				String deCodedWord="";
				for(int i=0;i<w.length();i++)
					{
					int letNum = secretCode.indexOf(w.charAt(i));
					deCodedWord+=alphabet.substring(letNum, letNum+1);
					}
				deCodedNote+=deCodedWord+" ";
				}
			out.println(deCodedNote);			
			}
		}
	}