/**
 * Jackson, Bricen, Thomas, John
 * This class holds a hashmap for the commands, and their input keys
 */
import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;
    
    public InputHandler(Document document) {
        commands = new HashMap<String, Command>();
        
        commands.put("load", new LoadCommand(document));
        commands.put("save", new SaveCommand(document));
        commands.put("spell", new SpellCommand(document));
        commands.put("print", new PrintCommand(document));
    }
    
    //Check if the key is valid then execute the command
    public void inputEntered(String data) {
    	if (commands.containsKey(data)) {
    		commands.get(data).execute();
    	} else {
            System.out.println("Sorry, we don't recognize that command");
        }
    }
}
