package com.example.firstproject.dto;


import com.example.firstproject.entity.Article;

public class ArticleForm {
    //Controller는 Form 데이터를 dto 객체에 담아서 받는다.
    private Long id;
    private String title;
    private String content;

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(id, title, content);
    }
}
