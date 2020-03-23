/**
 * Jackson, Bricen, Thomas, John
 * this class Holds a hashmap for the commands, and their input keys
 */
import java.util.HashMap;

public class InputHandler {
    private HashMap<String, String> commands;


    public InputHandler(Document doc) {
        commands = new HashMap<>();

        commands.put("load"," document is loading into view");
        commands.put("save","document is being saved");
        commands.put("spell check","document is being checked being checked for spelling errors");
        commands.put("print", "document is printing");
    }

    public void inputEntered(String data) {
        if (data.equals("load")){
            System.out.println(commands.get("load"));
        } else if (data.equals("save")){
            System.out.println(commands.get("save"));
        } else if (data.equals("spell check")) {
            System.out.println(commands.get("spell check"));
        } else if (data.equals("print")) {
            System.out.println(commands.get("print"));
        } else {
            System.out.println("Please enter another command, that one does not exist");
        }
    }
}
