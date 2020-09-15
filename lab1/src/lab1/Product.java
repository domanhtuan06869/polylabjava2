/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author tuan.domanh
 */
public class Product {

    private String name;
    private double price;
    
    // cái này để cho biết sản phẩm chịu thế hay k,true là có false là k
    private boolean tax;

    public boolean isTax() {
        return tax;
    }

    public void setTax(boolean tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // thuế 10%
    public double getImportTax() {
        double tax = (this.getPrice() / 100) * 10;
        return tax;
    }

    //đây là constructor
    public Product(String name, double price, boolean tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

}
