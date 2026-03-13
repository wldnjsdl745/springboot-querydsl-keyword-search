package com.jiwon.querydslpractice.service;

import com.jiwon.querydslpractice.domain.Article;
import com.jiwon.querydslpractice.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> searchByKeyword(String keyword){
        return articleRepository.searchByKeyword(keyword);
    }
}
