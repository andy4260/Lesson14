
public class RadioCallinShow {

    public static void main(String[] args) {
        LinkedQueue phoneline = new LinkedQueue();
        System.out.println("Our phone lines are open");
        System.out.println("We currently have " + phoneline.size() + " callers.");
        System.out.println("We have just recieved 3 callers");
        phoneline.enqueue(new Caller("Nick"));
        phoneline.enqueue(new Caller("Scott"));
        phoneline.enqueue(new Caller("Alice"));
        System.out.println("The next caller will be " + phoneline.peekFront());
        
    }
    
}
