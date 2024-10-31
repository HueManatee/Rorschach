import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class RorschachRunner {
    public static void main(String[] args) {
        String[] pos = new String[2006];
        String[] neg = new String[4783];
        //MUST make try catch to ease errors
        try{
            File posFile = new File("positive-words.txt");
            Scanner search = new Scanner(posFile);
            
            for(int j=0;j<2006;j++){
                pos[j] = search.nextLine();
            }
            search.close();

        } catch (FileNotFoundException e){
            System.out.println("Error: Positive Word list not found");
        }
        try{
            File negFile = new File("negative-words.txt");
            Scanner search = new Scanner(negFile);
            
            for(int j=0;j<4783;j++){
                neg[j] = search.nextLine();
            }
            search.close();

        } catch (FileNotFoundException e){
            System.out.println("Error: Negative Word list not found");
        }
        
        

        //System.out.println(Arrays.toString(pos));
        //System.out.println(Arrays.toString(neg));
        Scanner start = new Scanner(System.in);
        System.out.println("Welcome to Harrison's Rorschach Test. \nThis test will show you 5 randomly generated \"Inkblot\" tests. \nYou will then answer what you think they look like.");
        System.out.println("*NOTE* Try and use as many adjectives as possible when describing the image. And obviously this is just for testing purposes");
        System.out.println("Enter your name below:\n");
        String name = start.nextLine();
        new TestMaker(name, pos, neg);



        start.close();
    }
}