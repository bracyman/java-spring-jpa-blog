package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pluralsight.blog.model.Category;


@Component
public interface CategoryRepository extends JpaRepository<Category,Long> {}
