package com.project.nikswan.repository;

import com.project.nikswan.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository <Article, Long> {
}
