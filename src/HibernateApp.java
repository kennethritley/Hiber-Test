import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 *  Just a very simple Java application using Hiberate to demonstrate OR Mapping.  H
 *    
 *  Here are the files it needs:
 * 
 *     /src/HibernateApp.java - this app
 *     /src/Person.java - a "POJO" to represent the table "person" and its columns
 *     /src/Person.hbm.xml - an XML configuration file mapping the DB columns to the Java objects
 *     /src/hibernate.cfg.xml - an XML configuration file specifying the DB infos
 *     /lib/... - all the Hibernate jarfiles
 *    
 *  @class Person
 *  @author Dr. Ken and his little green friend
 *  @version 1.0
 *  @since 2023-04-30
 **/
public class HibernateApp {
    public static void main(String[] args) {
        
        // Create configuration instance
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        // Create session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Open a session
        Session session = sessionFactory.openSession();

        //----------TEST WRITING TO DB----------
        // Create and save a new person
        Person person = new Person();
        person.setName("John Doe");

        Transaction transaction = session.beginTransaction();
        int id = (int) session.save(person);
        transaction.commit();

        System.out.println("Person saved with ID: " + id);

        //----------TEST READING FROM TO DB----------
        // Retrieve and display the saved person
        Person retrievedPerson = session.get(Person.class, id);
        System.out.println("Retrieved person: " + retrievedPerson.getName());

        // Close the session and session factory
        session.close();
        sessionFactory.close();
    }
}
