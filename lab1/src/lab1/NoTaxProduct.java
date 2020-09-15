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

//class thừa kế từ Product
public class NoTaxProduct extends Product {

    public NoTaxProduct(String name, double price, boolean tax) {
        super(name, price, tax);
    }

    
    // thuế 0%
    @Override
    public double getImportTax() {
        return this.getPrice();
    }
}
