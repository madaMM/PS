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
public class Mobile extends Product{

    private String os;
    private double memory;
    Mobile b;
    
    public Mobile(String name, double price,double memory,String os) {
        super(name, price);
        this.os=os;
        this.memory=memory;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    @Override
    public double getPrice(double quantity) {
       
        double newPrice=0.0d;
        newPrice=quantity * this.getPrice();
        return newPrice;
    }

    @Override
    public String toString() {
      String aux="";
      aux=aux+"Name: "+this.getName()+"Price: "+this.getPrice() +"Memory: "+this.getMemory()+"Os: "+this.getOs();
      return aux;
    }
    
    
    
}
