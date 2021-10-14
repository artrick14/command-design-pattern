import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * @authors Adam Trickett,Esam Sartawi, Brandon Jennings, and Brady Smoak
 * This class will display the files in when they are called and clear the console after every command
 */
public class MilitaryCadence {
    /**
     * this is the constructor for the military candence class
     */
    public MilitaryCadence() {
        
    }
    /**
     * this method reads the idontknow.txt file and then "sings it" to the terminal
     */
    public void singIDontKnow() {
        readFile("command-design-pattern/command/idontknow.txt");
    }
    /**
     * this method reads the everywhere.txt file and then "sings it" to the terminal
     */
    public void singEverywhereWeGo() {
        readFile("command-design-pattern/command/everywhere.txt");
    }
    /**
     * this method reads the inarmy.txt file and then "sings it" to the terminal
     */
    public void singInArmy() {
        readFile("command-design-pattern/command/inarmy.txt");
    }
    /**
     * this method reads in a file and prints each line to the console after clearing the previous line
     * @param fileName this is the file name that is to be used in the sing methods above
     */
    private void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNext()) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println(fileScanner.nextLine());
                TimeUnit.MILLISECONDS.sleep(100);
               
            }
        fileScanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }


}
