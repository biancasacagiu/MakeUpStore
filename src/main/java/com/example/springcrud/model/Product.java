package com.example.springcrud.model;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer product_id;

    @Column(name = "category")
    @NonNull
    private String category;

    @Column(name = "brand")
    @NonNull
    private String brand;

    @Column(name = "model")
    @NonNull
    private String model;

    @Column(name = "price")
    @NonNull
    private float price;

    @Column(name = "quantity")
    @NonNull
    private int quantity;

    @Column(name = "description")
    @NonNull
    private String description;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "age")
    @NonNull
    private int age;

    @Column(name = "img")
    @NonNull
    private String img;


    public Product() {
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    @NonNull
    public String getCategory() {
        return category;
    }

    public void setCategory(@NonNull String category) {
        this.category = category;
    }

    @NonNull
    public String getBrand() {
        return brand;
    }

    public void setBrand(@NonNull String brand) {
        this.brand = brand;
    }

    @NonNull
    public String getModel() {
        return model;
    }

    public void setModel(@NonNull String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}