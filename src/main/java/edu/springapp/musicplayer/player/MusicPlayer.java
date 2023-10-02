
package edu.springapp.musicplayer.player;

import java.util.List;

import edu.springapp.musicplayer.playlist.Music;

public class MusicPlayer {
    private Music music;
    private List<Music> playList;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
	this.music = music;
	playList.add(music);
    }
    
    
    public void play() {
	System.out.println("Plays:\t" + this.music.getSong());
    }

    public List<Music> getPlayList() {
	return playList;
    }

    public void setPlayList(List<Music> playList) {
	this.playList = playList;
    }

    public Music getMusic() {
	return music;
    }

    public void setMusic(Music music) {
	this.music = music;
    }

}
