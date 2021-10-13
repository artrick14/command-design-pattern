import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MilitaryCadence {
    
    public MilitaryCadence() {
        
    }

    public void singIDontKnow() {
        readFile("idontknow.txt");
        clearConsole();
    }

    public void singEverywhereWeGo() {
        readFile("everywhere.txt");
        clearConsole();
    }

    public void singInArmy() {
        readFile("inarmy.txt");
        clearConsole();
    }

    private void readFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
                TimeUnit.MILLISECONDS.sleep(100);
            }
        fileScanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    private void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
