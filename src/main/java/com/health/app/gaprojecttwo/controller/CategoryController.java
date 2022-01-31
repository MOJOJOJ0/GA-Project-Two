package com.health.app.gaprojecttwo.controller;


//        import com.health.app.gaprojecttwo.model.Category;
//        import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class CategoryController {

    @GetMapping(path = "/categories/)
            public List<Category> getCategories() {
            return "get all categories";
            }

            @GetMapping(path = "/categories/{categoryId}")
            public String getCategory(@PathVariable Long categoryId) {
            return "getting the category with the id of " + categoryId;
            }

            @PostMapping("/categories/")
            public String createCategory(@RequestBody String body) {
            return "creating a category " + body;
            }

            @PutMapping("/categories/{categoryId}")
            public String updateCategory(@PathVariable(value = "categoryId") Long categoryId, @RequestBody String body) {
            return "updating the category with the id of " + categoryId + body;
            }

            @DeleteMapping("/categories/{categoryId}")
            public String deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
            return "deleting the category with the id of " + categoryId;
            }
}