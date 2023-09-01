package Interfaces.CarMusicSystem;

public class SonyMusicSystem implements MusicSystem{
    @Override
    public void Play() {
        System.out.println("Sony Play Song");
    }

    @Override
    public void Pause() {
        System.out.println("Sony Pause Song");
    }

    @Override
    public void Forward() {
        System.out.println("Sony Forward Song");
    }

    @Override
    public void Rewind() {
        System.out.println("Sony Rewind Song");
    }

    @Override
    public void SetVolume() {
        System.out.println("Sony Set Volume");
    }
}
