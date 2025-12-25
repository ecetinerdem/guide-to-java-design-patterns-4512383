package com.example;

public class MediaPlayerActiveState implements MediaPlayerState {

  @Override
  public void pressButton(MediaPlayer mediaPlayer) {
    mediaPlayer.setPlayer(new MediaPlayerPauseState());
    System.out.println("Player will be pausing");
  }
}
