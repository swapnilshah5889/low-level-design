package Interfaces.CarMusicSystem;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        // Null Music System
        car.playSong();

        // Attach sony music system
        MusicSystem ms = new SonyMusicSystem();
        car.setMusicSystem(ms);
        car.playSong();
        car.rewindSong();
        car.pauseSong();

        // Attach bose music system
        MusicSystem ms2 = new BoseMusicSystem();
        car.setMusicSystem(ms2);
        car.playSong();
        car.rewindSong();
        car.pauseSong();
    }
}
