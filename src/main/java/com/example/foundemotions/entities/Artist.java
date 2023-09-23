package com.example.foundemotions.entities;

import javax.persistence.*;


@Entity
@Table(name = "Artist")
public class Artist {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)

       private int id;

       @Column(name = "nameArtist",length = 45,nullable = false)
       private String nameArtist;


       @ManyToOne
       @JoinColumn(name = "genderid",referencedColumnName = "idgender")
       private Gender genderid ;


       public Artist(int id, String nameArtist, Gender genderid) {
              this.id = id;
              this.nameArtist = nameArtist;
              this.genderid = genderid;
       }

       public Artist() {

       }

       public int getId() {
              return id;
       }

       public void setId(int id) {
              this.id = id;
       }

       public String getNameArtist() {
              return nameArtist;
       }

       public void setNameArtist(String nameArtist) {
              this.nameArtist = nameArtist;
       }

       public Gender getGenderid() {
              return genderid;
       }

       public void setGenderid(Gender genderid) {
              this.genderid = genderid;
       }
}
