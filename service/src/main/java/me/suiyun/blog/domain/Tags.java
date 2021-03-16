package me.suiyun.blog.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import me.suiyun.common.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "blog_tags")
public class Tags extends BaseEntity {
    @Id
    @Column
    @NotNull(groups = {Update.class})
    @ApiModelProperty(value = "ID", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tagName;

//    @ManyToMany(mappedBy = "tags")
//    private Set<Article> articles;

}
