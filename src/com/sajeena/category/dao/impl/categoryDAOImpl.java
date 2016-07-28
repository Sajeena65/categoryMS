/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.category.dao.impl;

import com.sajeena.category.dao.categoryDAO;
import com.sajeena.category.entity.Category;

/**
 *
 * @author Admin
 */
public class categoryDAOImpl implements categoryDAO {

    private int count = 0;
    private Category[] Categorylist = new Category[10];

    @Override
    public boolean insert(Category ct) {
        if (count == Categorylist.length) {
            return false;
        }
        Categorylist[count] = ct;
        count++;
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < Categorylist.length; i++) {
            Category c = Categorylist[i];
            if (c != null && c.getId() == id) {
                Categorylist[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Category getbyId(int id) {
        for (int i = 0; i < Categorylist.length; i++) {
            Category c = Categorylist[i];
            if (c != null && c.getId() == id) {

                return c;
            }
        }
        return null;
    }

    @Override
    public Category[] getAll() {
        return Categorylist;

    }
}
