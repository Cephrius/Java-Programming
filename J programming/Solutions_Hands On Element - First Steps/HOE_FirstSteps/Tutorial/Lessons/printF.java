package Tutorial.Lessons;

public class printF {
    
    public static void main(String[] args) {
        // This is how C programming is displayed 
        // printf() = an optional method to control, format, and display text to the console window 
        //              two arguments = format string + (object/varible/value)
        //              % [Flags] [precision] [width] [conversion-character]

            //boolean myBoolean = true;   
            //char myChar = '@';
           // String myString = "Chiedozie";
            //int myInt = 50;
            //double myDouble = 1000;
            
            // Converstion Charater
            //System.out.printf("%b", myBoolean);
            //System.out.printf("%c", myChar);
            //System.out.printf("%s", myString);
            //System.out.printf("%d", myInt);
            //System.out.printf("%f", myDouble);

            //[Width]
            // minimum number of charaters to be written as output
            //System.out.printf("Hello %-10s", myString);

            //[Precision]
            // sets number of digits of precision when outputting floating-point values
            //System.out.printf("You have this much money %.1f",myDouble);

            // [Flags]
            // adds an effect to output based on the flag added to format specifier
            // - : left-justify
            // + : output a plus(+) or minus (-) sign for a numeric value
            // 0 : numeric values are zero-padded 
            // , : comma grouping separator if numbers > 1000

            //System.out.printf("You have this much money %,f",myDouble);
    }
}
