package com.tuanlm.medicine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "Comment")
@Entity
public class CommentEntity {
    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "content")
    private String content;
    @Column(name = "parentId")
    private UUID parentId;
    @Column(name = "postId")
    private UUID postId;
    @Column(name = "userId")
    private UUID userId;
    @Column(name = "status")
    private boolean status;

    public CommentEntity() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }

    public UUID getPostId() {
        return postId;
    }

    public void setPostId(UUID postId) {
        this.postId = postId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
