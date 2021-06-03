package Birds;

public class Duck extends Bird {
    //override

    public void makeNoise(){
        System.out.println(this.getName() + " goes Quack Quack.");
    }
}
