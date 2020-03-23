/*
 * This class uses the executive method from Command to check document for spelling errors.
 */
public class SpellCommand implements Command{
    private Document doc;

    public SpellCommand(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.spell();
    }
}
