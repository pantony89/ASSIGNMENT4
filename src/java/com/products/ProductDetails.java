/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.products;

/**
 *
 * @author antony 
public class ProductDetails {
    
    private int product_id;

    private String name;
    private String description;
    private int quantity;
    
    public ProductDetails(){
    
    }
    
    public ProductDetails(int product_id,String name,String description,int quantity){
        this.product_id=product_id;
        this.name=name;
        this.description=description;
        this.quantity=quantity;
    
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    /**
     * Get the value of product_id
     *
     * @return the value of product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * Set the value of product_id
     *
     * @param product_id new value of product_id
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

}
