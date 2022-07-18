import static java.lang.System.*;
import java.util.*;
import java.io.*;
public class Index {

	public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("index.dat"));
		ArrayList<String> listOfWords = new ArrayList<String>();
		while(f.hasNext())
			{
			String thisWord = f.next().toLowerCase();
			String checkWord = "";
			for(int i=0;i<thisWord.length();i++)
				if(thisWord.charAt(i)>=97&&thisWord.charAt(i)<=122)
					checkWord+=thisWord.substring(i, i+1);
			if(!listOfWords.contains(checkWord))
				listOfWords.add(checkWord);
			}
		Collections.sort(listOfWords);
		for(String w:listOfWords)
			out.println(w);
	}
}
