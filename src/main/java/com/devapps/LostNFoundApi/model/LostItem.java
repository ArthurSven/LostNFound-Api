package com.devapps.LostNFoundApi.model;

import jakarta.persistence.*;

import java.sql.Blob;
import java.sql.Date;

@Entity
public class LostItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lost_id;
    @Column
    private String item_name;

    @Column
    private String description;

    @Column
    private String location;

    @Column
    private String posted_by;

    @Column
    private String contact;

    @Column
    private String date;

    private String claimed;

    @Column
    private String image;

    public long getLost_id() {
        return lost_id;
    }

    public void setLost_id(long lost_id) {
        this.lost_id = lost_id;
    }

    public String getPosted_by() {
        return posted_by;
    }

    public String getLocation() {
        return location;
    }

    public String getContact() {
        return contact;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getClaimed() {
        return claimed;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPosted_by(String posted_by) {
        this.posted_by = posted_by;
    }

    public void setClaimed(String claimed) {
        this.claimed = claimed;
    }
}
