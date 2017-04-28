package daopractice1;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
  List<Person> persons;
  
  public PersonDaoImpl() {
    persons = new ArrayList<Person>();
    Person person1 = new Person("karoly", "horvath", 0);
    Person person2 = new Person("tunde", "tarnyik", 1);
    persons.add(person1);
    persons.add(person2);    
  }

  @Override
  public List<Person> getAllPersons() {
    return persons;
  }

  @Override
  public Person getPerson(int id) {
    return persons.get(id);
  }

  @Override
  public void updatePerson(Person person) {
    persons.get(person.getId()).setFirstName(person.getFirstName());
    persons.get(person.getId()).setLastName(person.getLastName());
    System.out.println("Person " + person.getId() + " updated in database.");
  }

  @Override
  public void deletePerson(Person person) {
    persons.remove(person.getId());
    System.out.println("Person " + person.getId() + " deleted from list.");
  }
  
}
