package me.suiyun.blog.service;

import me.suiyun.blog.domain.Article;

import java.util.List;

public interface ArticleService {


    int getArticleCountByState(Integer state, String keywords);

    List<Article> getArticleByState(Integer state, Integer page, Integer count, String keywords);
}
