/**
 * @authors Adam Trickett,Esam Sartawi, Brandon Jennings, and Brady Smoak
 * This class is an interface that is implemented by the everywhere command class,the idontknow command class, and the inArmyCommand class
 */
public interface Command {
    /**
     * The execute method is passed down to the implement classes listed above, this method will call the appropriate cadence and begin the "singing"
     */
    public void execute();
}
