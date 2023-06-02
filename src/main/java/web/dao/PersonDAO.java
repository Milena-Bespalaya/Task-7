package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Person;

import java.util.List;
@Repository
public interface PersonDAO {
     void saveUser(Person person);
     void updateUser(Person person);
     void removeUser(Long id);
     Person getUserById(Long id);
     List<Person> getAllUsers();
//     Person show(int id);
//     void save(Person person);
//
//     void update(int id, Person updatePerson);
//
//     void delete (int id);
}
