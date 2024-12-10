import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Algorithms
{
   private static File f;
   private static Scanner s;
   private static Scanner b;
   public static void main(String[] args) throws FileNotFoundException {
       f = new File("words.txt");
       int twoletter = twoletter();
       int longestword=longestword();
       int palindromes=palindromes();
       System.out.println("Number of two letter words: " + twoletter);
       System.out.println("Number of words tied for the longest word in the file: " + longestword);
       System.out.println("Number of palindromes: " + palindromes);
       s.close();
   }


   public static int twoletter() throws FileNotFoundException{
       s = new Scanner(f);
       int twoletter = 0;
       while (s.hasNext()) {
           String currentword=s.nextLine();
           if (currentword.length()==2) twoletter++;
       }
       return twoletter;
   }

   public static int longestword() throws FileNotFoundException{
    int longestword = 0;
    int currentlength=0;
    s = new Scanner(f);
    while (s.hasNext()) {
        String currentword=s.nextLine();
        if (currentword.length()>currentlength) currentlength=currentword.length();
    }
    b = new Scanner(f);
    while (b.hasNext()) {
        String currentword=b.nextLine();
        if (currentword.length()==currentlength) longestword++;
    }
    return longestword;
}
public static int palindromes() throws FileNotFoundException{
    s = new Scanner(f);
    int palindromes = 0;
    while (s.hasNext()) {
        String backwards = "";
        String currentword=s.nextLine();
        int wordlength=currentword.length();
        while (wordlength>0){
            String currentletter=currentword.substring(wordlength-1,wordlength);
            backwards +=currentletter;
            wordlength--;
            if (backwards.equals(currentword)) palindromes++;
        }
        
    }
    return palindromes;
}
}