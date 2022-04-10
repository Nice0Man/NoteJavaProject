package com.example.javaproject1.module;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Category {
    private final StringProperty categoryName = new SimpleStringProperty(this,"categoryName");
    private final IntegerProperty categoryId = new SimpleIntegerProperty(this,"categoryId");
    public String getCategoryName(){
        return categoryName.get();
    }

    public void setCategoryName(String name){
        this.categoryName.set(name);
    }

    public int getCategoryId(){
        return categoryId.get();
    }

    public void setCategoryId(int id){
        this.categoryId.set(id);
    }

    public Category(){}
    public Category(int id,String name){
        this.categoryName.set(name);
        this.categoryId.set(id);
    }
}
