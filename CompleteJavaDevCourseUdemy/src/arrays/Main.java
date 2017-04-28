package arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
  // sorted array
//  private static Scanner scanner = new Scanner(System.in);
//  public static void main(String[] args) {
//    int[] myIntegers = getIntegers(5);
//    for (int i = 0; i < myIntegers.length; i++) {
//      System.out.println("Element " + i + ", value typed: " + myIntegers[i]);      
//    }
//  }
//
//  private static int[] getIntegers(int number) {
//    System.out.println("Enter " + number + " values.\r");
//    int[] values = new int[number];
//    for (int i = 0; i < values.length; i++) {
//      values[i] = scanner.nextInt();      
//    }
//    return values;
//  }

  // mobile phone, contact list
  private static Scanner scanner = new Scanner(System.in);
  private static MobilePhone phone = new MobilePhone();

  private static void printMenu() {
    System.out.println("Menu");
    System.out.println("---------------------");
    System.out.println("0 - Print menu");
    System.out.println("1 - Show contact list");
    System.out.println("2 - Add new contact");
    System.out.println("3 - Update contact");
    System.out.println("4 - Check if a contact exists");
    System.out.println("8 - Delete contact");
    System.out.println("9 - Shut down");
  }

  private static void startPhone() {
    System.out.println("Welcome!");
  }

  private static void addNewContact() {
    System.out.println("Adding new contact...");
    System.out.println("Enter new contact name: \r");
    String name = scanner.nextLine();
    System.out.println("Enter a number: \r");
    String number = scanner.nextLine();
    Contact contact = Contact.createContact(name, number);
    if (phone.addContact(contact)) {
      System.out.println("Name: " + name + ", number: " + number + " has been added.");
    } else {
      System.out.println("Can not add, " + name + " already on file.");
    }
  }

  private static void updateContact() {
    System.out.println("Updating contact...");
    System.out.println("Enter a name you wish to update: ");
    String nameToUpdate = scanner.nextLine();
    Contact existingContactRecord = phone.queryContact(nameToUpdate);
    if (existingContactRecord == null) {
      System.out.println("Contact not found");
      return;
    }
    System.out.println("Enter new name for this contact: ");
    String newName = scanner.nextLine();
    System.out.println("Enter new phone number: ");
    String newNumber = scanner.nextLine();
    Contact newContact = Contact.createContact(newName, newNumber);
    if (phone.updateContact(existingContactRecord, newContact)) {
      System.out.println("Contact updated successfully.");
    } else {
      System.out.println("Error in updating contact");
    }
    /*if (!phone.updateContact(nameToUpdate, newNumber)) {
      System.out.println("Would you like to add it as new contact?\n1 - Yes\n0 - No");
      byte choice = scanner.nextByte();
      if (choice == 1) {
        Contact newContact = Contact.createContact(nameToUpdate, newNumber);
        phone.addContact(newContact);
      }
    }*/
  }
  
  private static void queryContact() {
    System.out.println("Querying contact...");
    System.out.println("Enter a contact name you wish to query: \r");
    String nameToQuery = scanner.nextLine();
    Contact existingContactRecord = phone.queryContact(nameToQuery);
    if (existingContactRecord == null) {
      System.out.println("Contact not found");
      return;
    }
    System.out.println("Name: " + existingContactRecord.getName() + ", number: " + existingContactRecord.getNumber() );
  }

  private static void removeContact() {
    System.out.println("Deleting contact...");
    System.out.println("Enter a contact name you wish to delete: \r");
    String nameToDelete = scanner.nextLine();
    Contact existingContactRecord = phone.queryContact(nameToDelete);
    if (existingContactRecord == null) {
      System.out.println("Contact not found");
      return;
    }
    if (phone.deleteContact(existingContactRecord)) {
      System.out.println("Successfully deleted.");
    } else {
      System.out.println("Error in deleting contact.");
    }
  }

  private static void runPhone() {
    int action;
    boolean quit = false;
    printMenu();
    do {
      action = scanner.nextInt();
      scanner.nextLine();
      switch (action) {
        case 0:
          printMenu();
          break;
        case 1:          
          phone.printContacts();
          break;
        case 2:
          addNewContact();
          break;
        case 3:
          updateContact();
          break;
        case 4:
          queryContact();
          break;
        case 8:
          removeContact();
          break;
        case 9:
          System.out.println("Shutting down...");
          quit = true;
          break;
      }
    } while (!quit);
  }
  
  // playlist
  private static LinkedList<Song> playlist = new LinkedList<>();
  private static ListIterator<Song> playlistIterator = playlist.listIterator();
  private static boolean goingForward = true;
  
  
  private static void addSongFromAlbumToPlaylist(Song song, Album album) {
    Song songFromAlbum = album.getSong(song);
    if (songFromAlbum != null) {
      playlistIterator.add(songFromAlbum);
      System.out.println("Song " + songFromAlbum.getTitle() + " has been added to the playlist.");
    } else {
      System.out.println("Song not found.");
    }
    while (playlistIterator.hasPrevious()) {
      playlistIterator.previous();
    }
  }
  
  public static void showPlaylist() {
    Iterator<Song> i = playlist.iterator();
    int trackNumber = 0;
    System.out.println("===========================");
    System.out.println("Playlist: ");
    while (i.hasNext()) {
      System.out.println("Track " + (++trackNumber) + ": " + i.next().getTitle());
    }
    System.out.println("===========================");
  }
  
  private static void replayCurrentSong() {
    if (isPlaylistEmpty()) {
      System.out.println("Playlist is empty. Please add songs.");
      return;
    }
    
    if (goingForward) {
      skipBackwardsToPreviousSong();
      goingForward = false;
    } else {
      skipForwardToNextSong();
      goingForward = true;
    }
  }
  
  private static void skipBackwardsToPreviousSong() {
    if (isPlaylistEmpty()) {
      System.out.println("Playlist is empty. Please add songs.");
      return;
    }
    
    if (goingForward) {
      if (playlistIterator.hasPrevious()) {
        playlistIterator.previous();
      }
      goingForward = false;
    }
    if (playlistIterator.hasPrevious()) {
      System.out.println("Now playing " + playlistIterator.previous().getTitle());
    } else {
      System.out.println("This is the beginning of the list.");
      goingForward = true;
    }    
  }
  
  private static void skipForwardToNextSong() {
    if (isPlaylistEmpty()) {
      System.out.println("Playlist is empty. Please add songs.");
      return;
    }
    
    if (!goingForward) {
      System.out.println("Nem Goingforward");
      if (playlistIterator.hasNext()) {
        playlistIterator.next();
      }
      goingForward = true;
    }
    if (playlistIterator.hasNext()) {
      System.out.println("Now playing " + playlistIterator.next().getTitle());
    } else {
      System.out.println("This is the end of the list.");
      goingForward = false;
    }    
  }
  
  private static void showMenu() {
    System.out.println("==========================");
    System.out.println("-----MENU-----");
    System.out.println("0 - Show menu");
    System.out.println("1 - Replay current song");
    System.out.println("2 - Play previous song");
    System.out.println("3 - Play next song");
    System.out.println("4 - Show playlist");
    System.out.println("8 - Remove current song from playlist");
    System.out.println("9 - Turn off player");   
    System.out.println("==========================");
  }
  
  private static void removeCurrentSongFromPlayList() {
    if (isPlaylistEmpty()) {
      System.out.println("Playlist is empty. Please add songs.");
      return;
    }
    if (goingForward) {
      if (playlistIterator.hasPrevious()) {
        Song songToRemove = playlistIterator.previous();
        playlist.remove(songToRemove);
        System.out.println("Song " + songToRemove.getTitle() + " has been removed.");
        goingForward = false;
      } else {
        System.out.println("This is the beginning of the list.");
      }
    } else {
      if (playlistIterator.hasNext()) {
        Song songToRemove = playlistIterator.next();
        playlist.remove(songToRemove);
          System.out.println("Song " + songToRemove.getTitle() + " has been removed.");
          goingForward = true;        
      } else {
        System.out.println("This is the end of the list.");
      }
    }
    
  }
  
  private static boolean isPlaylistEmpty() {
    return playlist.isEmpty();
  }
  
  private static void manageMenu() {
    boolean quit = false;
    Scanner scanner = new Scanner(System.in);
    do {
      showMenu();
      System.out.println("Please choose an action: ");
      int action = scanner.nextInt();
      scanner.nextLine();
      switch (action) {
        case 0:
          showMenu();
          break;
        case 1:
          replayCurrentSong();
          break;
        case 2:
          skipBackwardsToPreviousSong();
          break;
        case 3:
          skipForwardToNextSong();
          break;
        case 4:
          showPlaylist();
          break;
        case 8:
          removeCurrentSongFromPlayList();
          break;
        case 9:
          System.out.println("Turning off...");
          quit = true;
          break;
      }      
    } while (!quit);
  }

  public static void main(String[] args) {
    //runPhone();
//    // bank
//    Bank otp = new Bank("otp");
//    Branch kobanya = otp.addBranch("kobanya");
//    otp.addCustomerToBranchWithInitialTransaction(kobanya, "mate", 100.0);
//    otp.addTransactionToExistingCustomer(kobanya, "mate", 10.0);
//    otp.displayBranchesAndCustomers();
//    Branch oktogon = otp.addBranch("oktogon");
//    otp.addCustomerToBranchWithInitialTransaction(oktogon, "karcsi", 10.0);
//    otp.addTransactionToExistingCustomer(kobanya, "mate", -15.0);
//    otp.displayBranchesAndCustomers();
    Song contain = new Song("Contain", "4:30");
    Song corten = new Song("Corten", "6:40");
    Album consumed = new Album("Consumed");
    consumed.addSongToAlbum(contain);
    consumed.addSongToAlbum(corten);
    consumed.showSongsFromAlbum();
    Song theCrystalShip = new Song("The Crystal Ship", "3:45");
    Song lightMyFire = new Song("Light My Fire", "2:50");
    Album theDoors = new Album("The Doors");
    theDoors.addSongToAlbum(theCrystalShip);
    theDoors.addSongToAlbum(lightMyFire);
    addSongFromAlbumToPlaylist(contain, consumed);
    addSongFromAlbumToPlaylist(corten, consumed);
    addSongFromAlbumToPlaylist(theCrystalShip, theDoors);
    addSongFromAlbumToPlaylist(lightMyFire, theDoors);
    manageMenu();
    
    
      
  }

}
