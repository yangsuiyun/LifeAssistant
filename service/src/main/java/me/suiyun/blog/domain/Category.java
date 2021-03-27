package me.suiyun.blog.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name="blog_category")
public class Category {
    @Id
    private Long id;

    @Column(name = "cate_name")
    private String cateName;

    private Timestamp date;

}
