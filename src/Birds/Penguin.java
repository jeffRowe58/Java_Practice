package Birds;

public class Penguin extends Bird {
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Honk honk");
    }
    public void move(){
        System.out.println(this.getName() + " goes waddle waddle.");
    }
}
