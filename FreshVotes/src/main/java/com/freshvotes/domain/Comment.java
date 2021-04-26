package com.freshvotes.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {
    private String text;
    private CommentId primaryKey;
    @Column(length = 1000)
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    @EmbeddedId
    public CommentId getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(CommentId primaryKey) {
        this.primaryKey = primaryKey;
    }
}
