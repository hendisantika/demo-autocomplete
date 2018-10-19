package com.hendisantika.demoautocomplete.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-autocomplete
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/10/18
 * Time: 14.13
 * To change this template use File | Settings | File Templates.
 */

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nama;

    private int age;
}
