package OOPs;

// Rule Book 1: Everyone who implements this MUST have a takePhoto() method
interface Camera {
    void takePhoto(); // Hidden code: public abstract void takePhoto();
}

// Rule Book 2: Everyone who implements this MUST have a playSong() method
interface MusicPlayer {
    void playSong();
}

// IMPLEMENTATION (Multiple Inheritance)
// A Class can implement multiple interfaces separated by commas
class SmartPhone implements Camera, MusicPlayer {

    // We MUST define the body for takePhoto()
    @Override
    public void takePhoto() {
        System.out.println("Clicking Photo... 📸");
    }

    // We MUST define the body for playSong()
    @Override
    public void playSong() {
        System.out.println("Playing Music... 🎵");
    }
}

// MAIN CLASS TO RUN THE CODE
public class Abstraction2 {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();

        // Calling methods from different interfaces
        myPhone.takePhoto(); // Acts like a Camera
        myPhone.playSong();  // Acts like a Music Player
    }
}
