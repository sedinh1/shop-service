package com.sa.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shoppinglist")
public class ShoppingList {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String item;
    private int quantity;
    private int cost;

    public ShoppingList() {
    }

    public ShoppingList(Long id, String item, int quantity, int cost) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getCost() {
        return quantity;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ShoppingList{" + "id=" + id + ", item=" + item
                + ", quantity=" + quantity  + ", cost=" + cost +'}';
    }
}
