package me.suiyun.blog.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.sql.Update;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name="blog_article")
public class Article {

    @Id
    @NotNull(groups= Update.class)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "ID", hidden = true)
    private Long id;

    private String title;
    private String mdContent;
    private String htmlContent;
    private String summary;
    private Long cid;
    private Long uid;
    private Timestamp publishDate;
    private Integer state;
    private Integer pageView;
    private Timestamp editTime;

//    @ManyToMany(targetEntity = Tags.class)
//    @JoinTable(name = "blog_article_tags",
//            joinColumns = {@JoinColumn(name = "aid",referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "tid",referencedColumnName = "id")}
//    )
//    private Set<Tags> tags;
}
