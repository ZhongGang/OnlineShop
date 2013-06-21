package com.icode.core.model;

import com.icode.share.GuidGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-6-14
 * Time: 下午9:22
 */
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Version
    @Column(name = "version")
    private Integer version;

    @Column(name = "active")
    private Boolean active = Boolean.TRUE;

    @Column(name = "guid")
    private String guid = GuidGenerator.generate();

    @Column(name = "create_time", columnDefinition = "datetime")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime createTime;

    @Column(name = "last_modify_time", columnDefinition = "datetime")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime lastModifyTime;

}
