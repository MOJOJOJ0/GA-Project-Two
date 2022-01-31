package com.health.app.gaprojecttwo.repository;



        import com.health.app.gaprojecttwo.model.Category;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String categoryName);
}