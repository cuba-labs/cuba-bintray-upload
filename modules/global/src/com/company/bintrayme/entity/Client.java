package com.company.bintrayme.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|title")
@Table(name = "BINTRAYME_CLIENT")
@Entity(name = "bintrayme$Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 7383468008695398474L;

    @Column(name = "TITLE")
    protected String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}