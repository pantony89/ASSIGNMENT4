/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.products;


 /* @author antony 

*/
public class ProductDetails {
    
   int productId;
   int quantity;
   String name;
   String description;
    
    
    public ProductDetails(){
    
    }
    
    public ProductDetails(int productId,String name,String description,int quantity){
        this.productId=productId;
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
    

    
    public int getProductId() {
        return productId;
    }

   
    public void setProductId(int productId) {
        this.productId = productId;
    }

}
