package com.project.nikswan.controller;

import com.project.nikswan.model.Article;
import com.project.nikswan.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BlogController {

    private final ArticleService articleService;

    @Autowired
    public BlogController(ArticleService articleService){
        this.articleService=articleService;
    }

    @GetMapping("/blog")
    public String findAllArticles(Model model){
        List<Article> articles = articleService.findAll();
        model.addAttribute("articles", articles);
        return "blog-list";
    }

    @GetMapping("/article-create")
    public String createArticleForm(Article article){
        return "/blog-create";
    }

    @PostMapping("/article-create")
    public String createArticle(Article article){
        if(article.getTitle()!=""&&article.getShortReview()!=""&&article.getFullText()!="") {
            articleService.saveArticle(article);
            return "redirect:/blog";
        }else
            return "/blog-create";

    }

    @GetMapping("/article-delete/{id}")
    public String deleteArticle(@PathVariable("id") Long id){
        articleService.deleteById(id);
        return "redirect:/blog";
    }

    @GetMapping("/article-update/{id}")
    public String updateArticleForm(@PathVariable("id") Long id, Model model){
        Article article = articleService.findById(id);
        model.addAttribute("article", article);
        return "/blog-update";
    }

    @PostMapping("/article-update")
    public String updateArticle(Article article){
        return "redirect:/blog";
    }


}
