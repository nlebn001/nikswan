package com.project.nikswan.model;

import javax.persistence.*;

@Entity
@Table(name="article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="short_review")
    private String shortReview;
    @Column(name="full_text")
    private String fullText;

//    private String filename;

    public Article(){
    }

    public Article(String title, String shortReview, String fullText) {
        this.title = title;
        this.shortReview = shortReview;
        this.fullText = fullText;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortReview() {
        return shortReview;
    }

    public void setShortReview(String shortReview) {
        this.shortReview = shortReview;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

//    public String getFilename() {
//        return filename;
//    }
//
//    public void setFilename(String filename) {
//        this.filename = filename;
//    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", shortReview='" + shortReview + '\'' +
                ", text='" + fullText + '\'' +
                '}';
    }
}
