package com.jiwon.querydslpractice.controller;

import com.jiwon.querydslpractice.domain.Article;
import com.jiwon.querydslpractice.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/articles/search")
    public List<Article> searchByKeyword(@RequestParam String keyword){
        return articleService.searchByKeyword(keyword);
    }

}
