package me.suiyun.blog.rest;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import me.suiyun.blog.domain.Article;
import me.suiyun.blog.service.ArticleService;
import me.suiyun.common.utils.*;
import me.suiyun.logging.annotation.Log;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/article")
@Api(tags = "Blog: Blog API")
public class ArticleController {

    private final ArticleService articleService;

//    @Log("List all blogs")
    @GetMapping(value = "/all")
    @ApiOperation("List all blogs")
    public Map<String, Object> getArticleByState(
            @RequestParam(value = "state", defaultValue = "-1") Integer state,
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "count", defaultValue = "6") Integer count,
            String keywords
    ) {
        int totalCount = articleService.getArticleCountByState(state, keywords);
        System.out.println("total count:" + totalCount);
        List<Article> articles = articleService.getArticleByState(state, page, count, keywords);
        System.out.println("total article:" + articles.size());
        Map<String, Object> map = new HashMap<>();
        map.put("totalCount", totalCount);
        map.put("articles", articles);
        return map;
    }
}
