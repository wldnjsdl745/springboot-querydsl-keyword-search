package com.jiwon.querydslpractice.repository;

import com.jiwon.querydslpractice.domain.Article;
import java.util.List;

public interface ArticleRepositoryCustom {
    List<Article> searchByKeyword(String keyword);

}
