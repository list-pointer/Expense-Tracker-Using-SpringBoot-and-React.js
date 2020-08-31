package com.expensetracker.MainPackage.Expense;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expense, Long> {

}
