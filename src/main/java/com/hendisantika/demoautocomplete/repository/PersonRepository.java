package com.hendisantika.demoautocomplete.repository;

import com.hendisantika.demoautocomplete.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-autocomplete
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/10/18
 * Time: 14.25
 * To change this template use File | Settings | File Templates.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByNamaContainingIgnoreCase(@Param("nama") String nama);
}
