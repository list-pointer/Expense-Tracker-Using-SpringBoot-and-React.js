package com.expensetracker.MainPackage.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    private String id;

    private String name;

    private String email;

}