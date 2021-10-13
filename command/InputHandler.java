
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