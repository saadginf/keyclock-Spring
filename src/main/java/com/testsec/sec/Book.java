package com.testsec.sec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String rayonId;


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

  
    /**
     * @return String return the rayonId
     */
    public String getRayonId() {
        return rayonId;
    }

    /**
     * @param rayonId the rayonId to set
     */
    public void setRayonId(String rayonId) {
        this.rayonId = rayonId;
    }

    public Book(Long id,String rayonId) {
        this.id = id;
      
        this.rayonId = rayonId;
    }

    public Book() {
    }

}
