package com.example.foundemotions.entities;

import javax.persistence.*;


@Entity
@Table(name = "Artist")
public class Artist {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)

       private int id;

       @Column(name = "name",length = 45,nullable = false)
       private String name;


       @ManyToOne
       @JoinColumn(name = "genderid")
       private Gender gender ;


       public Artist() {
       }

       public Artist(int id, String name, Gender genderid) {
              this.id = id;
              this.name = name;
              this.gender = genderid;
       }

       public int getId() {
              return id;
       }

       public void setId(int id) {
              this.id = id;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public Gender getGenderid() {
              return gender;
       }

       public void setGenderid(Gender genderid) {
              this.gender = genderid;
       }
}
