/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author madaM
 */
public class Cart {
    
     HashMap <Product, Integer> products;
     Integer aux;
     Product p;
     public Cart(){
         
         products= new HashMap<Product,Integer>();
     
     }
     
     public double totalPrice(){
       double price = 0;
       for (Map.Entry<Product, Integer> entry : products.entrySet()){
           price += entry.getKey().getPrice(entry.getValue());
       }
       
       return price;
         
         
     }
     
     public String toString(){
         
       String aux = "";
       for (Map.Entry<Product, Integer> entry : products.entrySet()){
           aux += entry.getKey().toString()+ " "  ;
       }
       
       return aux;
     }
     
     
     public void addProduct(Product p,Integer quantity){
         products.put(p,quantity);
     }
     
     
    
}
