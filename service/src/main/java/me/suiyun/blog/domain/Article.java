package me.suiyun.blog.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.sql.Update;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

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

    @Column(name = "md_content")
    private String mdContent;

    @Column(name = "html_content")
    private String htmlContent;

    private String summary;
    private Long cid;
    private Long uid;

    @Column(name = "publish_date")
    private Timestamp publishDate;

    private Integer state;

    @Column(name = "page_view")
    private Integer pageView;

    @Column(name = "edit_time")
    private Timestamp editTime;

//    @ManyToMany(targetEntity = Tags.class)
//    @JoinTable(name = "blog_article_tags",
//            joinColumns = {@JoinColumn(name = "aid",referencedColumnName = "id")},
//            inverseJoinColumns = {@JoinColumn(name = "tid",referencedColumnName = "id")}
//    )
//    private Set<Tags> tags;
}
