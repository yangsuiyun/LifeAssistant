package me.suiyun.blog.service.impl;

import lombok.RequiredArgsConstructor;
import me.suiyun.blog.domain.Article;
import me.suiyun.blog.repository.ArticleRepository;
import me.suiyun.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
//    private final Long uid = SecurityUtils.getCurrentUserId();
    private final Long uid = 1L;

    @Autowired
    private final ArticleRepository articleRepository;

    public int getArticleCountByState(Integer state, String keywords){
        return articleRepository.getArticleCountByState(state, uid, keywords);
    }

    public List<Article> getArticleByState(Integer state, Integer page, Integer count,String keywords) {
        int start = (page - 1) * count;
        return articleRepository.getArticleByState(start, count);
    }
}
