package Birds;

public class Duck extends Bird {
    //override

    public void makeNoise(){
        super.makeNoise();
        System.out.println("Quack Quack.");
    }
}
