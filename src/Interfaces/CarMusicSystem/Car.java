package Interfaces.CarMusicSystem;

public class Car {

    private MusicSystem sm;

    void setMusicSystem(MusicSystem obj) {
        this.sm = obj;
    }

    private boolean isDeviceAttached() {
        if(sm==null) {
            System.out.println("Device not attached");
            return false;
        }
        return true;
    }

    void playSong() {
        if(isDeviceAttached()) {
            sm.Play();
        }
    }

    void pauseSong() {
        if(isDeviceAttached()) {
            sm.Pause();
        }
    }
    void forwardSong() {
        if(isDeviceAttached()) {
            sm.Forward();
        }
    }

    void rewindSong() {
        if(isDeviceAttached()) {
            sm.Rewind();
        }
    }

    void setVolume() {
        if(isDeviceAttached()) {
            sm.SetVolume();
        }
    }
}
