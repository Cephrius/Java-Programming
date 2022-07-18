import static java.lang.System.*;
import java.util.*;
import java.io.*;


public class Grades1  {
    public static void main(String[] args) throws IOException{
		Scanner f = new Scanner(new File("grades.dat"));
        int n = f.nextInt();
        for(int x=1;x<=n;x++){
            String first = f.next();
            String last = f.next();
            double total = 0;
            for(int y=1;y<=6;y++)
                total+=f.nextInt();
            double avg = total/6.0;
            out.printf("%s, %s %.2f\n", last,first,avg);
        }

    }
}
