import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Algorithms
{
   private static File f;
   private static Scanner s;
   public static void main(String[] args) throws FileNotFoundException {
       f = new File("words.txt");
       int twoletter = twoletter()
       System.out.println("Number of words with two letters: " + twoletter);

public static int twoletter() throws FileNotFoundException{
       s = new Scanner(f);
       int twoletter = 0;
       while (s.hasNext()) {
            String currentword=s.nextString()
            if (currentword.length()==2){
                twoletter++;
            }    
       }
       return twoletter;
       