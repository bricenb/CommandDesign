//This method saves the desired document for the user 
public class SaveCommand implements Command{
    private Document doc;

    public SaveCommand(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
