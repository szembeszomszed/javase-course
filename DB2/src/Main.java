import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
  
  private static Employee újDolgozó() {
    Employee e=new Employee();
    e.setFirst_name("John");
    e.setLast_name("Doe");
    e.setEmail("DOE");
    e.setPhone_number("515.120.4567");
    e.setHire_date(new Date());
    e.setJob_id("IT_PROG");
    e.setSalary(11500);
    //e.setCommission_pct(0);
    e.setManager_id(102);
    e.setDepartment_id(60);
    return e;
  }
  
  public static void main(String[] args) {
	  final StandardServiceRegistry REGISTRY=
      new StandardServiceRegistryBuilder().configure(
        new File("hibernate.cfg.xml")).build();
	  try {
      //olvasás
		  Session s=new MetadataSources(REGISTRY).buildMetadata().buildSessionFactory().openSession();
      s.beginTransaction();      
      final String HQL="from Employee"; //where, order by
      List<?> eredmény=s.createQuery(HQL).list();
      for(Employee dolgozó : (ArrayList<Employee>) eredmény)
        System.out.println("Employee (név: " +dolgozó.getFirst_name()+" "+dolgozó.getLast_name()+")");
      s.getTransaction().commit();
      s.close();
      
      //írás
      s=new MetadataSources(REGISTRY).buildMetadata().buildSessionFactory().openSession();
      s.beginTransaction();      
      s.save(újDolgozó());
      s.getTransaction().commit();
      s.close();
	  }
	  catch(Exception e) {
		  StandardServiceRegistryBuilder.destroy( REGISTRY );
      e.printStackTrace();
	  }
  }
}
