package com.example.artists.model;

import javax.persistence.*;

@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;//tên sản phẩm
    @ManyToOne
    private Category category;///loại sán phẩm
    private String material;// chất liệu
    private String size;//kích thước
    private  double  price;//giá
    private String yearOfCreation;//năm sáng tác...

    private String Experience3d;//trải nhiệm 3d...
    @ManyToOne
    private Artist artist;
    private  String image;

    public Product() {
    }

    public Product(long id, String name, Category category, String material, String size, double price, String yearOfCreation, String experience3d, Artist artist, String image) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.material = material;
        this.size = size;
        this.price = price;
        this.yearOfCreation = yearOfCreation;
        Experience3d = experience3d;
        this.artist = artist;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public String getExperience3d() {
        return Experience3d;
    }

    public void setExperience3d(String experience3d) {
        Experience3d = experience3d;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
