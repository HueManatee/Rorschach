import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestMaker {
    private String testTaker;//name of test taker for recording purposes
    private String[] posList;//if I ever change the pos list
    private String[] negList;//if I ever change the neg list
    private int posPoint;
    private int negPoint;
    public TestMaker(String name, String[] pos, String[] neg){
        Scanner input = new Scanner(System.in);
        testTaker = name;
        posList = pos;
        negList = neg;
        String[] responses = runTest(input);
        checkResponses(responses,pos,neg);
        System.out.println("We found " + posPoint + " positive words.");
        System.out.println("We found " + negPoint + " negative words.\n");
        System.out.println("Would you like to save the data to a file? (yes or no)");
        String fileSave = input.nextLine().toLowerCase();
        boolean fileAns = false;
        while(fileAns==false){
            if(fileSave.equals("yes")){
                saveFile(testTaker);
                System.out.println("Thank you for trying out my program!");
                fileAns = true;
            }
            else if(fileSave.equals("no")){
                System.out.println("Thank you for trying out my program!");
                fileAns = true;
            }
            else{
                System.out.println("Sorry, Please type yes or no.");
                fileSave = input.nextLine().toLowerCase();
            }
            
        }
        input.close();
        

        
        
    }
        /**
* Displays 5 Rorschach tests and returns responses in an array.
* <p>
* Calls InkblotMaker and asks the user what they look like so we can check for positive and negative words later.
*
* @param  input  Scanner to collect responses
* @return      Array with 5 responses stored
*/
    public String[] runTest(Scanner input){
        String[] storeResponse = new String[5];
        for(int j=0;j<5;j++){
            new InkblotMaker();
            System.out.println("What do you see? (Use Adjectives)");
            String response = input.nextLine().toLowerCase();
            storeResponse[j] = response;

        }
        return storeResponse;
    }
        /**
* Checks responses with positive and negative words, displaying them to the user.
* <p>
* Using responses and the given files with positive and negative word lists, it scans each statement for every word in the list and displays what it finds.
*
* @param  r  Array with all of the responses////
* @param  pos  the random String of O's and spaces with a length of 5
* @param  neg  the random String of O's and spaces with a length of 5
* @return      a String with a length of 10, mirrored from str
*/
    public void checkResponses(String[] r, String[] pos, String[] neg){
        //credit to https://gist.github.com/mkulakowski2/4289437 for pos words list
        //credit to https://gist.github.com/mkulakowski2/4289441 for neg words list
        for(int j=0;j<r.length;j++){
            for(int k=0;k<pos.length;k++){
                
                if(r[j].contains((pos[k]))){//implement spaces before and after 
                    posPoint++;
                    System.out.println("Found " + pos[k]);
                }
                else if(r[j].contains((neg[k]))){
                    negPoint++;
                    System.out.println("Found " + neg[k]);
                }
                
            }
        }
        
    }
    public void saveFile(String name){//implement file saving
        String fileTitle = name + "_Summary.txt";
        File summary = new File(fileTitle);
        //MUST make try catch to ease errors
        try{
            FileWriter writer = new FileWriter(summary);
            writer.write("Hey Test");

            writer.close();

        } catch (IOException e){
            System.out.println("Error: Can't write to created file.");
        }

        
    }

}
