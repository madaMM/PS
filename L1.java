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
public class L1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Product p1 = new Laptop("HP TouchSmart", 20.00, 15.12, "Intel i7"); 
		Product p2 = new Mobile("HTC mini 2", 100.00,6, "HTC");
		Product p3 = new Laptop("Dell XPS", 50.00, 17.12, "Intel i7"); 
		
                
                Cart c = new Cart();
		c.addProduct(p1, 5);
		c.addProduct(p2, 1);
		c.addProduct(p3, 1);
                
                System.out.println(c.toString());
                System.out.println("TotalPrice "+ c.totalPrice());



    }
    
}
