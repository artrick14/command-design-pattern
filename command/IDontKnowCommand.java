/**
 * @authors Adam Trickett,Esam Sartawi, Brandon Jennings, and Brady Smoak
 * This class implements command and contains a constructor and a implement method excecute, this class implements the singing for the idontKnow.txt file
 * @param cadence this variable is of type Military cadence and is referenced in the constructor to call the singIDontKnow method in execute
 */
public class IDontKnowCommand implements Command {
    private MilitaryCadence cadence;
    /**
     * This method constructs the cadence param and takes in a cadence 
     * @param cadence cadence is set as a reference to the class Military Cadence in order to call a method in this class
     */
    public IDontKnowCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    /**
     * This method is used to call the singIDontKnow method using the constructed param cadence
     */
    public void execute() {
        cadence.singIDontKnow();
    }
}
