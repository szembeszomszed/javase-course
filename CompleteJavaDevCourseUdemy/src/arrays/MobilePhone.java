package arrays;

import java.util.ArrayList;

public class MobilePhone {
  private ArrayList<Contact> contacts;

  public MobilePhone() {
    this.contacts = new ArrayList<>();
  }
  
  public boolean addContact(Contact contact) {
    String name = contact.getName();
    String number = contact.getNumber();
    if (this.findContact(name) >= 0) {
      //System.out.println("Contact " + name + " already exists.");
      return false;
    }
    this.contacts.add(new Contact(name, number));
    //System.out.println("Name: " + name + ", number: " + number + " has been added as new contact.");
    return true;
  }
  
//  public boolean updateContact(String name, String number) {
//    int index = this.findContact(name);
//    if (index < 0) {
//      System.out.println("Contact does not exist.");
//      return false;
//    }
//    Contact updatedContact = new Contact(name, number);
//    contacts.set(index, updatedContact);
//    System.out.println("Contact has been updated.");
//    return true;
//  }
  
  public boolean updateContact(Contact oldContact, Contact newContact) {
    int foundPosition = findContact(oldContact);
    if (foundPosition < 0) {
      System.out.println("Contact " + oldContact.getName() + " not found.");
      return false;
    }
    this.contacts.set(foundPosition, newContact);
    System.out.println(oldContact.getName() + " replaced with " + newContact.getName());
    return true;
  }
  
//  public boolean deleteContact(String name) {
//    int index = this.findContact(name);
//    if (index < 0) {
//      System.out.println("Contact " + name + " does not exist.");
//      return false;
//    }
//    this.contacts.remove(index);
//    System.out.println("Contact " + name + "has been deleted.");
//    return true;    
//  }
  
  public boolean deleteContact(Contact contact) {
    int foundPosition = findContact(contact);
    if (foundPosition < 0) {
      System.out.println("Contact " + contact.getName() + " not found.");
      return false;
    }
    this.contacts.remove(foundPosition);
    System.out.println(contact.getName() + " has been deleted");
    return true;
    
  }
  
  private int findContact(Contact contact) {
    return this.contacts.indexOf(contact);
  }
  
  private int findContact(String contactName) {
    for (Contact c : this.contacts) {
      if (c.getName().equals(contactName)) {
        return contacts.indexOf(c);
      }
    }
    return -1;
  }
  
  public String queryContact(Contact contact) {
    if (findContact(contact) >= 0) {
      return contact.getName();
    }
    return null;
  }
  
  public Contact queryContact(String name) {
    int position = findContact(name);
    if (position >= 0) {
      return this.contacts.get(position);
    }
    return null;
  }
  
  public void printContacts() {
    System.out.println("Contact list: ");
    for (int i = 0; i < contacts.size(); i++) {
      System.out.println((i + 1) + " " + contacts.get(i).getName() + " --> " + contacts.get(i).getNumber());
    }
  }
}
