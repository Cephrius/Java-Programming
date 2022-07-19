package Package1;
import javax.swing.text.html.MinimalHTMLWriter;
import Package2.*;

public class A {
    
    public static void main(String[] args) {
        
        B b = new B(); 
        System.out.println(b.privateMessage);
    }

}


// anything using the public keyword is visible to any package.
// default only can see what is in the same package
// Protected is only available to a different class in a different package as long as that class is an extention of the parent class