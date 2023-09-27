
package edu.springapp.musicplayer.player;


import java.util.List;


import edu.springapp.musicplayer.playlist.Music;


public class MusicPlayer {
	private Music music;
	private List<Music> playList;
	private int indexOfMusic = 0;
	private int countOfPressesOfPlayButton = 0;

	public MusicPlayer (Music music) {
		this.music = music;
		playList.add (music);
	}


	public void playMusic () {
		countOfPressesOfPlayButton ++;
		System.out.println ("Plays: " + this.music.getSong ());
	}


	public void next () {
		if (countOfPressesOfPlayButton == 1) {
			indexOfMusic = 1;
		}
		this.music = playList.get (indexOfMusic ++);
		if (indexOfMusic == playList.size ()) {
			indexOfMusic = 0;
		}
		this.playMusic ();
	}


	public List<Music> getPlayList () {
		return playList;
	}


	public void setPlayList (List<Music> playList) {
		this.playList = playList;
	}


	public void addMusicToPlaylist (Music music) {
		this.playList.add (music);
	}


	public Music getMusic () {
		return music;
	}


	public void setMusic (Music music) {
		this.music = music;
	}

}
