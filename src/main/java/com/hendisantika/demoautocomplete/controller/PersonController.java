package com.hendisantika.demoautocomplete.controller;

import com.hendisantika.demoautocomplete.entity.Person;
import com.hendisantika.demoautocomplete.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-autocomplete
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/10/18
 * Time: 14.27
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("api")
public class PersonController {

    @Autowired
    PersonService personService;

//    @GetMapping("users")
//    public List<Person> getAllUsers(){
//        return personService.getAllUsers();
//    }

    @GetMapping("users")
    public List<Person> getAllUsersByName(){
//    public List<Person> getAllUsersByName(@RequestParam(value = "nama") String nama){
        List<Person> results = personService.getAllUsers();
//        List<Person> results = personService.getAllUsers(nama);
//        return results;
//        return results.stream().filter( person -> nama.equals(person)).collect(Collectors.toList());
        return  results.stream().collect(Collectors.toList());
    }
}
