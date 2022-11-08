package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> { //<관리대상 Entity,대표값 타입>
    // Entity는 Repository라는 일꾼을 통해 DB에 전달되고 처리된다.
}
