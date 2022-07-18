import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Dryrun {

	public static void main(String[] args)throws IOException {

		try (Scanner f = new Scanner(new File("dryrun.dat"))) {
            int n = f.nextInt();
            f.nextLine();
            for(int x = 1; x<=n; x++){
            	String text = f.nextLine();
            	out.println("I like "+text+".");
            }
        }
		

	}

}
