package main.MavenProejct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Person {

    @Autowired

    private Account account;

    @Autowired
    private Address address;


}
