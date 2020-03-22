//This class loads the desired document into view for the user to see
public class LoadCommand implements Command{
    private Document doc;

    public LoadCommand(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.load();
    }
}
