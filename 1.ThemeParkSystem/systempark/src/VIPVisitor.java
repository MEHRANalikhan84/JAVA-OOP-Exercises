public class VIPVisitor extends Visitor {
    public VIPVisitor(String name) {
        super(name);
    }

    public void getPriorityAccess(Ride ride) {
        System.out.println(getName() + " دسترسی ویژه به " + ride + " دریافت کرد");
    }
}