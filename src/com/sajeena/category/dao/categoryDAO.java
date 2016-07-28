/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.category.dao;

import com.sajeena.category.entity.Category;

/**
 *
 * @author Admin
 */
public interface categoryDAO {
     boolean insert(Category ct);
    boolean delete(int id);
    Category getbyId(int id);
    Category[] getAll();
    
}
