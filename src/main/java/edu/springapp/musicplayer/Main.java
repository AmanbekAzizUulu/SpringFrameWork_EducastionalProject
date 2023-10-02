
package edu.springapp.musicplayer;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.springapp.musicplayer.player.MusicPlayer;

public class Main {

    public static void main(String[] args) {
	try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");) {
	  MusicPlayer musicPlayer = context.getBean("music-player-1", MusicPlayer.class);
	  
	  musicPlayer.play();
	  
	} catch (BeansException e) {
	    e.printStackTrace();
	}

    }

}
