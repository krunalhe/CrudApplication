package com.project.crudsms.model;


import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
   private String email;
   private String mobile;
   private  String address;

   public User(){}


    public User(Long id, String name, String email, String mobile, String address){
      this.id=id;
       this.name=name;
       this.email=email;
       this.mobile=mobile;
       this.address=address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
