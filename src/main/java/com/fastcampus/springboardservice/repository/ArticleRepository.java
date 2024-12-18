package com.fastcampus.springboardservice.repository;

import com.fastcampus.springboardservice.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}