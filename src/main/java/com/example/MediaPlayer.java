package com.example;

public class MediaPlayer {
    private MediaPlayerState state;

    public MediaPlayer() {
        this.state = new MediaPlayerPauseState();
    }

    public void pressButton() {
        state.pressButton(this);
    }

    public void play() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

    public void pause() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }

    public void setPlayer(MediaPlayerState mediaPlayerState) {
        this.state = mediaPlayerState;
    }
}
