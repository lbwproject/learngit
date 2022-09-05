package cn.edu.hbut.jsjxy.shortterm2022.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Articles {
    String oldTitle;
    String oldContent;
    String title;
    String content;
    Long userId;
}
