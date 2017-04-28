package arrays;

import java.util.ArrayList;

public class Albums {
  private static ArrayList<Album> albums = new ArrayList<>();
  
  public static void addAlbumToAlbumList(Album album) {
    if (!albumExists(album)) {
      albums.add(album);
      System.out.println("Album " + album.getTitle() + " added.");
    } else {
      System.out.println("Album " + album.getTitle() + " already exists on list. No action made." );
    }
  }
  
  private static boolean albumExists(Album album) {
    return albums.indexOf(album) >= 0;
  }
  
  public static Album getAlbumByTitle(String albumTitle) {
    for (int i = 0; i < albums.size(); i++) {
      if (albums.get(i).getTitle().equals(albumTitle)) {
        return albums.get(i);
      }
    }
    System.out.println("Album not found.");
    return null;
  }
  
  public static Song getSongFromAlbum(String songTitle, Album album) {
    if (albumExists(album)) {
      return album.getSongByTitle(songTitle);
    }
    System.out.println("Album " + album.getTitle() + " is not on the list. No action made.");
    return null;
  }
}
