package Birds;

public class Penguin extends Bird {
    public void makeNoise(){
        System.out.println(this.getName() + " goes honk honk!");
    }
    public void move(){
        System.out.println(this.getName() + " goes waddle waddle.");
    }
}
