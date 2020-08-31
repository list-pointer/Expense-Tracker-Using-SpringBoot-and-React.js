package com.expensetracker.MainPackage.Expense;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

@RestController
@RequestMapping("/api")
public class ExpenseController {
//    private ExpenseRepo expenseRepo;
//
//    public ExpenseController(ExpenseRepo expenseRepo) {
//        super();
//        this.expenseRepo = expenseRepo;
//    }

    @Autowired
    private ExpenseRepo expenseRepo;

    @GetMapping("/expenses")
    Collection<Expense> getExpenses() {
        return expenseRepo.findAll();
    }

    @DeleteMapping("/expense/{id}")
    ResponseEntity<?> deleteExpense(@PathVariable Long id) {
        expenseRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/addExpense")
    ResponseEntity<Expense> createExpense(@Validated @RequestBody Expense expense) throws
            URISyntaxException {
        Expense result = expenseRepo.save(expense);
        return ResponseEntity.created(new URI("/api/expenses" + result.getId())).body(result);
    }

    @PutMapping("/expense/{id}")
    ResponseEntity<Expense> updateExpense(@Validated @RequestBody Expense expense) {
        Expense result = expenseRepo.save(expense);
        return ResponseEntity.ok(result);
    }
}
