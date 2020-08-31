package com.expensetracker.MainPackage.Category;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategoryController {
    private CategoryRepo categoryRepo;

    public CategoryController(CategoryRepo categoryRepo) {
        super();
        this.categoryRepo = categoryRepo;
    }

    @GetMapping("/categories")
    Collection<Category> categories() {
        return categoryRepo.findAll();
    }

    @GetMapping("/category/{id}")
    ResponseEntity<?> getCategory(@PathVariable Long id) {
        Optional<Category> category = categoryRepo.findById(id);
        return category.map(response -> ResponseEntity.ok().body(response)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/addCategory")
    ResponseEntity<Category> createCategory(@Validated @RequestBody Category category) throws
            URISyntaxException {
        Category result = categoryRepo.save(category);
        return ResponseEntity.created(new URI("/api/category" + result.getId())).body(result);
    }

    @PutMapping("/category/{id}")
    ResponseEntity<Category> updateCategory(@Validated @RequestBody Category category) {
        Category result = categoryRepo.save(category);
        return ResponseEntity.ok(result);
    }
}
