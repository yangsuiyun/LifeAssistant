package me.suiyun.blog.repository;

import me.suiyun.blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {

    @Query(value = "SELECT count(1) FROM blog_article", nativeQuery = true)
    int getArticleCountByState(Integer state, Long uid, String keywords);

    @Query(value = "SELECT * FROM blog_article ORDER BY edit_time DESC limit ?1,?2", nativeQuery = true)
    List<Article> getArticleByState(Integer start, Integer count);
}
