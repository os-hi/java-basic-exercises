package OOP.AnimalSound;

public class WhistleSound {
    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("Kwaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
    }
}
