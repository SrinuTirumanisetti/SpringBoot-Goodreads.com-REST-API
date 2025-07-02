package com.example.goodreads;

public class Book{
    private int id;
    private String name;
    private String imageUrl;
    public Book(int id,String name,String imageUrl){
        this.id=id;
        this.name=name;
        this.imageUrl = imageUrl;
    }
    public int getId(){
        return this.id;
    }
    public int setId(int id){
       This.id=id;
    }
    public String getName(){
        return this.name;
    }
    public String setName(int name){
       This.name=name;
    }
    public int getImageUrl(){
        return this.imageUrl;
    }
    public int setImageUrl(int imageUrl){
       This.imageUrl=imageUrl;
    }
    
}