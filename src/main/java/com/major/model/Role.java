package com.major.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(nullable = false,unique = true)
    @NotEmpty
    public String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
