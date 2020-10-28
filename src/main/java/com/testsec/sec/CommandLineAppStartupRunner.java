package com.testsec.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CommandLineAppStartupRunner implements CommandLineRunner{
@Autowired
BookRepository brep;
@Override
public void run(String... args) throws Exception {
    // TODO Auto-generated method stub
    brep.save(new Book(null,"saad"));
    brep.save(new Book(null,"bbb"));
    brep.save(new Book(null,"sacccd"));
    brep.save(new Book(null,"dddd"));
}

}
    
