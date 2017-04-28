package arrays;

import java.util.ArrayList;

public class Album {
  private String title;
  private ArrayList<Song> songs;

  public Album(String title) {
    this.title = title;
    songs = new ArrayList<>();
  }

  public String getTitle() {
    return title;
  }
  
  public void addSongToAlbum(Song song) {
    if (this.songExists(song)) {
      System.out.println("Song already exists on album");
    } else {
      songs.add(song);
      System.out.println("Song has been added to album.");
    }
  }
  
  private boolean songExists(Song song) {
    return this.findSong(song) >= 0;
  }

  private boolean songExists(String songTitle) {
    return this.findSong(songTitle) >= 0;
  }
  
  private int findSong(Song song) {
    return songs.indexOf(song);
  }
  
  private int findSong(String songTitle) {
    for (int i = 0; i < this.songs.size(); i++) {
      if (this.songs.get(i).getTitle().equals(songTitle)) {
        return i;
      }
    }
    return -1;
  }
  
  public Song getSongByTitle(String songTitle) {
    if (this.songExists(songTitle)) {
      return this.songs.get(this.findSong(songTitle));
    } else {
      System.out.println("Song does not exist on album " + this.getTitle() + ".");
      return null;
    }
  }
  
  public Song getSong(Song song) {
    if (this.songExists(song)) {
      return this.songs.get(this.findSong(song));
    } else {
      System.out.println("Song " + song.getTitle() + " does not exist on album " + this.getTitle() + ".");
      return null;
    }
  }
  
  
  public void showSongsFromAlbum() {
    System.out.println("================\nSongs on album " + this.getTitle());
    for (int i = 0; i < songs.size(); i++) {
      System.out.println(i + 1 + " => " + songs.get(i).getTitle());
    }
    System.out.println("================");
  }
  
  
}
