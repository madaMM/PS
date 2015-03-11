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
public class Laptop extends Product{

    private String processor;
    private double screenSize;
   
    
    public Laptop(String name, double price,double screenSize,String processor) {
        super(name, price);
        this.processor=processor;
        this.screenSize=screenSize;
    }
    
   

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getScreen() {
        return screenSize;
    }

    public void setScreen(float screen) {
        this.screenSize = screen;
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
      aux=aux+"Name: "+this.getName()+"Price: "+this.getPrice() +"ScreenSize: "+this.getScreen()+"Processor: "+this.getProcessor() +"\n";
      return aux;
    }
    
    
}
