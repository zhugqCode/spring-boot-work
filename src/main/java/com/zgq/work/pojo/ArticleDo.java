package com.zgq.work.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ArticleDo {;
    private Integer id;
    private String title;
    private String content;
    private LocalDate created;
    private LocalDate modified;
    private String categories;
    private String tags;
    private Integer allowComment;
    private String thumbnail;
}
