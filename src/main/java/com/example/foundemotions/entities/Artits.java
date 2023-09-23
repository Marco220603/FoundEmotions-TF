package com.example.foundemotions.entities;

import javax.persistence.*;


@Entity
@Table(name = "Artits")
public class Artits {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)

       private int id;

       @Column(name = "nameArtits",length = 45,nullable = false)
       private String nameArtits;


       @ManyToOne
       @JoinColumn(name = "genderid",referencedColumnName = "idgender")
       private Gender genderid ;


       public Artits(int id, String nameArtits, Gender genderid) {
              this.id = id;
              this.nameArtits = nameArtits;
              this.genderid = genderid;
       }

       public Artits() {
              
       }

       public int getId() {
              return id;
       }

       public void setId(int id) {
              this.id = id;
       }

       public String getNameArtits() {
              return nameArtits;
       }

       public void setNameArtits(String nameArtits) {
              this.nameArtits = nameArtits;
       }

       public Gender getGenderid() {
              return genderid;
       }

       public void setGenderid(Gender genderid) {
              this.genderid = genderid;
       }
}
