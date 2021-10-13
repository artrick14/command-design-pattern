import java.util.ArrayList;
/**
 * @authors Adam Trickett,Esam Sartawi, Brandon Jennings, and Brady Smoak
 * Input handler takes in each of the files and adds them to an Arraylist to be printed in the military cadence class
 * @param commands which is an the arraylist using of type command, this means that each index contains an entire .txt file such as inarmy.txt
 */
public class InputHandler {

    private ArrayList<Command> commands = new ArrayList<Command>();
    /**
     * this method takes in an input cadence of type Military Cadence and adds to each index of the arraylist one of the three files in the command folder
     * @param cadence cadence is used here to as an instance variable for each of the classes everywherecommand.java...
     */
    public InputHandler(MilitaryCadence cadence) {
        commands = new ArrayList<>();
        commands.add(new IDontKnowCommand(cadence));
        commands.add(new InArmyCommand(cadence));
        commands.add(new EverywhereCommand(cadence));
    }
    /**
     * this method checks to see which number is inputted by the user in the driver and executes the corresponding command list
     * @param num this variable is brought in by the class and is the number inputted into the driver
     * @return true or false if the num is 1,2,3 then true, else false
     */
    public boolean playCadence(int num) {
        if(num == 0) {
            commands.get(0).execute();
            return true;
        }
        else if(num == 1) {
            commands.get(1).execute();
            return true;
        }
        else if(num == 2) {
            commands.get(2).execute();
            return true;
        }
        else {
            return false;
        }
    }
}