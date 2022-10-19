package com.nestgigital.recipesbackendnew1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipes_tb")

public class RecipesModel {
    @Id
    @GeneratedValue

    public int id;
    public String dishes;
    public String items;
    public int  price;

    public RecipesModel(int id, String dishes, String items, int price) {
        this.id = id;
        this.dishes = dishes;
        this.items = items;
        this.price = price;
    }

    public RecipesModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
