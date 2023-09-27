
package edu.springapp.musicplayer;


import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import edu.springapp.musicplayer.player.MusicPlayer;
import edu.springapp.musicplayer.playlist.ClassicalMusic;
import edu.springapp.musicplayer.playlist.Music;
import edu.springapp.musicplayer.playlist.PopMusic;
import edu.springapp.musicplayer.playlist.RockMusic;


public class Main {

	public static void main(String [] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationcontext.xml");) {
			MusicPlayer player = new MusicPlayer (context.getBean ("classical-music-1", ClassicalMusic.class));

			player.addMusicToPlaylist (context.getBean ("rock-music-1", RockMusic.class));
			player.addMusicToPlaylist (context.getBean ("pop-music-1", PopMusic.class));

			System.out.println ("Playlist: ");
			for (Music music : player.getPlayList ()) {
				System.out.println ("\t" + music.getSong ());
			}

			player.playMusic ();

			player.next ();
			player.next ();
			player.next ();
			player.next ();
			player.next ();

		} catch (BeansException e) {
			e.printStackTrace ();
		}

	}

}
