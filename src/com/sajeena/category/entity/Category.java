/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.category.entity;

/**
 *
 * @author Admin
 */
public class Category {
     private int id;
    private String Categoryname,description;
    private boolean status;

    public Category() {
    }

    public Category(int id, String Categoryname, String description, boolean status) {
        this.id = id;
        this.Categoryname = Categoryname;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryname() {
        return Categoryname;
    }

    public void setCatagoryname(String Categoryname) {
        this.Categoryname = Categoryname;
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
