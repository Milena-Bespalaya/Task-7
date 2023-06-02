package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.PersonDAO;
import web.model.Person;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {
    private PersonDAO personDAO;

    @Autowired
    public PersonServiceImp(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }


    @Override
    public void saveUser(Person person) {
        personDAO.saveUser(person);
    }

    @Override
    public void updateUser(Person person) {
        personDAO.updateUser(person);
    }

    @Override
    public void removeUser(Long id) {
        personDAO.removeUser(id);
    }

    @Override
    public Person getUserById(Long id) {
        return personDAO.getUserById(id);
    }

    @Override
    public List<Person> getAllUsers() {
        return personDAO.getAllUsers();
    }
}

