package com.cattr1ne.myapplication50;

public class Motive {

    // поля сущности
    private String description; // поле цитат, высказываний.
    private String author; // поле автора цитаты, высказывания.
    private int motiveResource;


    // конструктор
    public Motive(String description, String author, int motiveResource) {
        this.description = description;
        this.author= author;
        this.motiveResource = motiveResource;
    }

    // геттеры и сеттеры
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getMotiveResource() {
        return motiveResource;
    }

    public void setMotiveImage(int motiveResource) {
        this.motiveResource = motiveResource ;
    }
}