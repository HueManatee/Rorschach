import java.util.Random;

/**
* Creates a random, mirrored field of O's to immitate the inkblots on a Rorschach test.
* <p>
* Can be called multiple times, drawing field is 10x10. 
*/
public class InkblotMaker {
    public InkblotMaker(){
        for(int j=0;j<10;j++){
            String line = "";
            System.out.print("|");
            String blot;
            for(int k=0;k<5;k++){
                
                Random rand = new Random();
                int choice = rand.nextInt(2);
                if(choice == 0){
                    blot = "O";
                }
                else{
                    blot =" ";
                }
                line+=blot + " ";
                
            }
            System.out.print(line + mirrorLine(line));//mirror the image
            System.out.println("|");

            
        }
    }
    /**
* Returns a mirrored string from str
* <p>
* Using the randomly generated string (length 5), this function creates a new string that is mirrored to fit the Rorschach idea.
*
* @param  str  the random String of O's and spaces with a length of 5
* @return      a String with a length of 10, mirrored from str
*/
    public String mirrorLine(String str){
        String newStr = "";
        for(int j=str.length()-1;j>0;j--){
            newStr += str.substring(j-1,j);
        }
        return newStr;
    }
}
