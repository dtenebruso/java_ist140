package checkstring;
import java.util.*;
import java.io.*;
/**
 *
 * @author dzt28
 */
public class CheckString {

    public static void main(String[] args) throws Exception {
        String file = "data.txt";
        
        System.out.println(getWord());
        //stuff strings in the String Array
        ArrayList<String> testData = new ArrayList<>();
        testData.add("hello everyone, my name is");
        testData.add("rabbit, flu shot.Someone tell me whats happening"); 
        testData.add("All you ever gave us was the wine on your breath and the back of your hand");
        
        writeFile(testData,file);
        //declare & initialize array with output from readFile
        ArrayList<String> fileContents = readFile(file);
        
        //loop over the input and print to stdout
        for(int x = 0; x < fileContents.size(); x++){
            System.out.println(fileContents.get(x));
        }
    }
    
    public static void checkWord(String word) throws Exception{
        try{

            char firstChar = word.charAt(0);
            //check if first character is a letter; if not throw exception Exception
            if(!Character.isLetter(firstChar)){
                throw new Exception("This is not a word: ");
            }
        }
        catch(Exception excpt){
            System.out.print(excpt.getMessage());
        }
    }
    
    public static String getWord() throws Exception{
        Scanner scan = new Scanner(System.in);
        String userInput;
        //stuff user input into variable userInput
        System.out.print("Type any string: ");
        userInput = scan.nextLine();
        checkWord(userInput);
        
        return userInput;
    }

    public static void writeFile(ArrayList<String> arrayToWrite, String filename) throws Exception{
        File file = new File(filename);
        file.createNewFile(); //file created; create write to write contents of array to new file
        FileWriter writer = new FileWriter(file);
        //iterate over array and write each indexed string to file
        for(int x=0; x < arrayToWrite.size(); x++){
            writer.write(arrayToWrite.get(x)+"\n");
        }
        //flush the buffer and close the file
        writer.flush();
        writer.close();
    }
    public static ArrayList<String> readFile(String filename) throws Exception{
        ArrayList<String> fileContents = new ArrayList<String>();
        String line;
        //declare & initialize a file reader object
        FileReader fileReader = new FileReader(filename);
        //wrap our Reader tool in bufferedReader to improve efficiency; depends on the file
        BufferedReader bufferReader = new BufferedReader(fileReader);
        //loop over each line and read them in fileContents
        while((line = bufferReader.readLine()) != null) {
            fileContents.add(line);
        }   
        bufferReader.close(); //always close the file
        return fileContents;
    }

}
