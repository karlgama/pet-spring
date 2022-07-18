package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String phone;
    private Integer age;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pet_id",referencedColumnName = "id")
    private List<Pet>pets;
}
