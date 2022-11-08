package com.example.firstproject.entity;

import javax.persistence.*;

@Entity // DB가 해당 객체를 인식 가능!
public class Article {

    // Entity는 자바객체(ex.dto)를 DB가 이해할 수 있도록 규격화된 데이터
    @Id // 대표값을 지정! like a 주민등록번호
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1,2,3, ... 자동 생성 어노테이션!
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
