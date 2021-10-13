
import java.util.ArrayList;

public class InputHandler {

    private ArrayList<Command> commands = new ArrayList<Command>();

    public InputHandler(MilitaryCadence cadence) {
        commands = new ArrayList<>();
        commands.add(new IDontKnowCommand(cadence));
        commands.add(new InArmyCommand(cadence));
        commands.add(new EverywhereCommand(cadence));
    }

    public boolean playCadence(int num) {
<<<<<<< HEAD
        if (num == 0) {
            commands.get(0).execute();
            return true;
        }
        if (num == 1) {
            commands.get(1).execute();
            return true;
        }
        if (num == 2) {
=======
        if(num == 0) {
            commands.get(0).execute();
            return true;
        }
        else if(num == 1) {
            commands.get(1).execute();
            return true;
        }
        else if(num == 2) {
>>>>>>> 8f752cc2560b1362c20a2634424cb0179655f0e3
            commands.get(2).execute();
            return true;
        }
        else {
<<<<<<< HEAD
         return false;
=======
            return false;
>>>>>>> 8f752cc2560b1362c20a2634424cb0179655f0e3
        }
    }
}