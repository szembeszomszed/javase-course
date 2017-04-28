
package daopractice1;

public class DaoPatternDemo {
  public static void main(String[] args) {
    PersonDao personDao = new PersonDaoImpl();
    
    // print all
    for (Person person : personDao.getAllPersons()) {
      System.out.println("Person [id: " + person.getId() + " name: " + person.getFirstName() + " " + person.getLastName() + "]");
    }
    
    // update person
    Person person = personDao.getAllPersons().get(0);
    person.setFirstName("marton");
    person.setLastName("szabo");
    personDao.updatePerson(person);
    
    // get person
    personDao.getPerson(0);
    System.out.println("Person [id: " + person.getId() + " name: " + person.getFirstName() + " " + person.getLastName() + "]");
      
  }
}
