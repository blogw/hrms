package biz.redlotus.hrms.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Transient
    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Integer version;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date insertDate;

    private Long createUser;

    private Long updateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    @PrePersist
    public void prePersist() {
        Date d = new Date();
        this.setInsertDate(d);
        this.setUpdateDate(d);
    }

    @PreUpdate
    public void preUpdate() {
        Date d = new Date();
        this.setUpdateDate(d);
    }

    @PostRemove
    public void postRemove() {
        log.info("save to xml...");
    }

    @Override
    public boolean equals(Object o) {
        return (o == this || (o instanceof BaseEntity && getId().equals(((BaseEntity) o).getId())));
    }
}
