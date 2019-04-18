package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "menu")
public class Menu {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String title;
    private String iconCls;
    private Integer parentId;
    private String jspUrl;
    @Transient
    private List<Menu> menuList;
}
