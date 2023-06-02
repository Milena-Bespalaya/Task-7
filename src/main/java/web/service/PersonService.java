package web.service;

import web.model.Person;

import java.util.List;

public interface PersonService  {
    void saveUser(Person person);
    void updateUser(Person person);
    void removeUser(Long id);
    Person getUserById(Long id);
    List<Person> getAllUsers();
}
