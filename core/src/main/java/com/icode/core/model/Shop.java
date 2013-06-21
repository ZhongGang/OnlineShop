package com.icode.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-14
 * Time: 下午9:39
 */
@Entity
@Table(name = "shop")
public class Shop extends AbstractEntity {
    @Column(name = "name")
    private String name;
}
