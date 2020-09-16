/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tuan.domanh
 */
public class Lab1Bai1234 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Khởi tạo mới 1 arraylist OOP
        ArrayList<Product> listproduct = new ArrayList<Product>();
        int n = 0;

        //Khởi tạo nhập từ bàn phím
        Scanner sn = new Scanner(System.in);
        System.out.print("nhập số lượng sản phẩm:");
        n = sn.nextInt();

        for (int i = 0; i < n; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("___________________________");
            System.out.println("Sản phẩm thứ " + (i + 1));
            System.out.print("Tên sp:");
            String name = in.nextLine();
            System.out.print("Sản phẩm chịu thuế? (Y or N):");
            String confirmTax = in.nextLine();
            System.out.print("Giá sp:");
            double prince = in.nextDouble();

            //value default check tax
            boolean tax = false;
            // nếu xác nhận Y thì sản phẩm sẽ chịu thuế
            if (confirmTax.equals("Y") || confirmTax.equals("y")) {
                tax = true;
            } else {
                tax = false;
            }

            // khởi tạo Product mới
            Product product = new Product(name, prince, tax);

            //Thêm vào list product
            listproduct.add(product);
        }
        if (n == 0) {
            System.out.print("Chạy lại chương trình và nhập số lượng lớn hơn 0 ");
            //Thoát chương trình
            System.exit(0);
        }
        renderArray(listproduct);

        ///số lượng = 3 sử dụng interface đc implement trong Product
        if (n == 3) {
            Product product = new Product();
            product.insert();
            product.update();
            product.delete();
            product.select();
        }
    }

    //function Dùng để render ra data của list Product
    static void renderArray(ArrayList<Product> listproduct) {
        System.out.println("___________Danh sách sản phẩm___________");

        //đây là vòng lập for để dùng lấy dữ liệu thay cho kiểu vòng for(int i;i<length;i++)
        listproduct.forEach((item) -> {
            String name = item.getName();
            double price = item.getPrice();
            boolean tax = item.isTax();
            result(name, price, tax);
        });
    }

    //funcion để kiểm tra xem sản phẩm cần tính thuế hoặc ko
    static void result(String name, double price, boolean tax) {

        // tax == true
        if (tax) {
            // khởi tạo Product mới
            Product product = new Product(name, price, tax);
            printResult(product.getName(), product.getPrice(), product.getImportTax());
        } else {
            // khởi tạo Product mới
            NoTaxProduct noTaxProduct = new NoTaxProduct(name, price, tax);
            printResult(noTaxProduct.getName(), noTaxProduct.getPrice(), noTaxProduct.getImportTax());

        }
    }

    // func để in kết quả.
    static void printResult(String name, double price, double tax) {
        System.out.println("Sản phẩm :" + name);
        System.out.println("Giá :" + price + "VNĐ");
        System.out.println("Thuế :" + tax + "VNĐ");
        System.out.println("__________________________________");

    }
}
