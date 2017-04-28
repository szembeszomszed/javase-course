package daopractice1;

import java.util.List;

public interface PersonDao {
  public List<Person> getAllPersons();
  public Person getPerson(int id);
  public void updatePerson(Person person);
  public void deletePerson(Person person);  
}
