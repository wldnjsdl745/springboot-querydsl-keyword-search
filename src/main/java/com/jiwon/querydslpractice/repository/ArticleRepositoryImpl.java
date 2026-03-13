package com.jiwon.querydslpractice.repository;

import com.jiwon.querydslpractice.domain.Article;
import com.jiwon.querydslpractice.domain.QArticle;
import com.querydsl.jpa.impl.JPAQueryFactory;

import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    public ArticleRepositoryImpl(JPAQueryFactory queryFactory){
        this.queryFactory = queryFactory;
    }

    @Override
    public List<Article> searchByKeyword(String keyword){
        QArticle article = QArticle.article;

        return queryFactory
                .selectFrom(article)
                .where(
                        article.name.contains(keyword)
                                .or(article.title.contains(keyword))
                                .or(article.contents.contains(keyword))
                )
                .fetch();
    }
}
