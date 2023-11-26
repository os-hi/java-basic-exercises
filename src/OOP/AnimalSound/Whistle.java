package OOP.AnimalSound;

public class Whistle {
    private final String whistle;
    public Whistle(String whistleSound){
        this.whistle = whistleSound;
    }

    public void sound(){
        System.out.println(whistle);
    }

}
