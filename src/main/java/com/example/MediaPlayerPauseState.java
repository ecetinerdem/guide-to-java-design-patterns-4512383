package com.example;

public class MediaPlayerPauseState implements MediaPlayerState {
  @Override
  public void pressButton(MediaPlayer mediaPlayer) {
    mediaPlayer.setPlayer(new MediaPlayerActiveState());
    System.out.println("Player will be playing");
  }
}
