package com.project.nikswan.service;

import com.project.nikswan.model.Article;
import com.project.nikswan.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository){
        this.articleRepository=articleRepository;
    }

    public Article findById(Long id){
        return articleRepository.getOne(id);
    }

    public List<Article> findAll(){
        return articleRepository.findAll();
    }

    public Article saveArticle(Article article){
        return articleRepository.save(article);
    }

    public void deleteById(Long id){
        articleRepository.deleteById(id);
    }

}
