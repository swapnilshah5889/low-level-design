package Interfaces.CarMusicSystem;

public class BoseMusicSystem implements MusicSystem{

    @Override
    public void Play() {
        System.out.println("Bose Play Song");
    }

    @Override
    public void Pause() {
        System.out.println("Bose Pause Song");
    }

    @Override
    public void Forward() {
        System.out.println("Bose Forward Song");
    }

    @Override
    public void Rewind() {
        System.out.println("Bose Rewind Song");
    }

    @Override
    public void SetVolume() {
        System.out.println("Bose Set Volume");
    }
}
