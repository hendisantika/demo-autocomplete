package com.hendisantika.demoautocomplete.service;

import com.hendisantika.demoautocomplete.entity.Person;
import com.hendisantika.demoautocomplete.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-autocomplete
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/10/18
 * Time: 14.29
 * To change this template use File | Settings | File Templates.
 */

@Service
@Transactional
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllUsers(){
        return personRepository.findAll();
    }

    public List<Person> getAllUsers(String name){
        return personRepository.findByNamaContainingIgnoreCase(name);
    }
}
