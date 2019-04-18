package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "banner")
@AllArgsConstructor
@NoArgsConstructor
public class Banner {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String title;
    private String imagePath;
    @DateTimeFormat(pattern = "yyyy/MM/dd,hh/mm/ss")
    private Date creatDate;
    private Integer status = 0;
}
