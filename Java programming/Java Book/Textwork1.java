import static java.lang.System.*;
import java.util.*;
import java.io.*;


public class Textwork1 {
    public static void main(String[] args) throws IOException{
        Scanner f = new Scanner(new File("textwork.dat"));
        int w=0,v=0,c=0,p=0;
        while(f.hasNext()){
            String nextWord =f.next().toLowerCase();
            w++;
            for(int x=0;x<nextWord.length();x++){
                char ch=nextWord.charAt(x);
                if (ch>=97&&ch<=122){
                    if(ch=='a'|| ch=='e'|| ch == 'i'|| ch=='o'|| ch=='u')
                    v++;
                    else
                        c++;
                }
            else
                p++;
            
            }
        }
        out.println("Words: " + w);
        out.println("Vowels: " +v);
        out.println("Consonants: " + c);
        out.println("Punctuation Marks: " + p);
    }


}
