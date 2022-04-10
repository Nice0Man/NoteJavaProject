package com.example.javaproject1.module;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Note {
    private final StringProperty noteName = new SimpleStringProperty(this,"noteName");
    private final StringProperty textFiled = new SimpleStringProperty(this,"textFiled");
    private final ObjectProperty<LocalDate> date = new SimpleObjectProperty<>(this,"date");
    private final IntegerProperty categoryID = new SimpleIntegerProperty(this,"categoryID");

    public String getNoteName(){
        return noteName.get();
    }

    public String getTextFiled(){
        return textFiled.get();
    }

    public LocalDate getDate(){
        return date.get();
    }

    public int getCategoryID(){
        return categoryID.get();
    }

    public void setNoteName(String str){
        this.noteName.set(str);
    }

    public void setTextFiled(String str){
        this.textFiled.set(str);
    }

    public void setDate(LocalDate date){
        this.date.set(date);
    }

    public void setCategoryID(int id){
        this.categoryID.set(id);
    }

    public Note(){}

    public Note(String name,String text,LocalDate date,int id){
        this.noteName.set(name);
        this.textFiled.set(text);
        this.date.set(date);
        this.categoryID.set(id);
    }

}
