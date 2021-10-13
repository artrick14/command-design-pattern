
import java.util.ArrayList;

public class InputHandler {

    private ArrayList<Command> commands;

    public InputHandler(MilitaryCadence cadence) {
        this.commands = new ArrayList<>();
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