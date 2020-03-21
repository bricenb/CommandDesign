public class Document {

    public Document (String name){
       System.out.println("Document named " + name + " is created");
    }

    public void load() {
        System.out.println("document is loaded into view");
    }

    public void spell() {
        System.out.println("document is being checked for spelling");
    }

    public void save() {
        System.out.println("document is being saved...");
    }

    public void print() {
        System.out.println("document is printing...");
    }
}
