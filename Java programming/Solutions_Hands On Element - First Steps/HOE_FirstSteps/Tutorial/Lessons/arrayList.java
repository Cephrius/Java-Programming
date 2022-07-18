
package Tutorial.Lessons;
/* 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.sql.PseudoColumnUsage;
import java.util.regex.*;
import javax.naming.directory.DirContext;
import javax.swing.plaf.synth.SynthSeparatorUI;
*/
import java.util.ArrayList;



     public class arrayList{

          public static void main(String[] args) {

               ArrayList<ArrayList<String>> pcsAndCars = new ArrayList<>();


                ArrayList<String> bestCars = new ArrayList<>();

                bestCars.add( "Tesla");
                bestCars.add( "Porsche");
                bestCars.add( "Bugatti");
                bestCars.add( "Lexus");
                bestCars.add( "Toyota");
                bestCars.add("Lamborghini");
                bestCars.add("McLaren");

                ArrayList<String> carModels = new ArrayList<>();

                carModels.add("Model S");
                carModels.add("Chiron");
                carModels.add("Huracan");
                carModels.add("720s");
                carModels.add("LFA");
                carModels.add("Camry TRD");
                carModels.add("911 Turbo S");

                ArrayList<String> pcParts = new ArrayList<>();

                pcParts.add("RTX 3080");
                pcParts.add("Asus Motherboard");
                pcParts.add("Samsung 860 evo");
                pcParts.add("Lian Li 011 Dynamic");
                pcParts.add("Razer Hunstman Mini");

               
               pcsAndCars.add(bestCars);
               pcsAndCars.add(carModels);
               pcsAndCars.add(pcParts);

               System.out.println(pcsAndCars.get(0).get(2));


          }
     }
      
