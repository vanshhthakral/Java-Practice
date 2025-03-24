public class MusicPlayer implements Playable {
    private boolean isPlaying;

    public MusicPlayer() {
        this.isPlaying = false;
    }

    @Override
    public void play() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Music is playing.");
        } else {
            System.out.println("Music is already playing.");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Music is paused.");
        } else {
            System.out.println("Music is already paused.");
        }
    }

    @Override
    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Music is stopped.");
        } else {
            System.out.println("Music is already stopped.");
        }
    }
}
