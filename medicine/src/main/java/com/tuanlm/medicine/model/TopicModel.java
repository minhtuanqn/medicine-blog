package com.tuanlm.medicine.model;

import java.io.Serializable;
import java.util.UUID;

public class TopicModel implements Serializable {
    private UUID id;
    private String name;
    private String description;
    private boolean status;

    public TopicModel() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
