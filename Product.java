/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator1;

/**
 *
 * @author Student
 */
public abstract class Product {
 
    private String name;
    private double price;
    
    public Product(String name, double price){
        
        this.name=name;
        this.price=price;
        
    }
    
    public abstract double getPrice(double quantity);
    public abstract String toString();
    
    public double getPrice(){
        
        return price;
        
    }
    
    public String getName(){
        
        return name;
    }
    
    
}
