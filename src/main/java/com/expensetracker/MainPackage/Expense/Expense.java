package com.expensetracker.MainPackage.Expense;

import com.expensetracker.MainPackage.Category.Category;
import com.expensetracker.MainPackage.User.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "expense")
public class Expense {

    @Id
    private Long id;

    private LocalDate expenseDate;

    private String description;

    private String location;

    @ManyToOne
    private Category category;

    @JsonIgnore//This will not send data related to this
    @ManyToOne
    private User user;


}