package Shop;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static BL bl = new BL();
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("1.ADD SHOP\t2.DISPLAY SHOP\t3.REMOVE PRODUCT FROM SHOP\t4.UPDATE PRODUCT IN SHOP\t5.SEARCH PRODUCT BY SHOP\t6.ADD PRODUCT INTO SHOP\t  7.EXIT");
            System.out.print("enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add_shop();
                    break;
                case 2:
                    display_Shop();
                    break;
                case 3:
                    remove_Product_From_Shop();
                    break;
                case 4:
                    update_Product_In_Shop();
                    break;
                case 5:
                    search_Product_By_Shop();
                    break;
                case 6:
                    add_Product_Into_Shop();
                    break;
                case 7:
                    System.out.println("Exited");
                    flag = false;
                    break;
                default:
                    System.out.println("enter valid choice");
            }
        }
    }

    private static void add_Product_Into_Shop() {
        System.out.print("enter shop id : ");
        int shop_id = sc.nextInt();
        System.out.print("enter product  id : ");
        int product_id = sc.nextInt();
        System.out.print("enter product name : ");
        String product_name = sc.next();
        System.out.print("enter product price : ");
        double product_price = sc.nextDouble();
        bl.add_Product_Into_Shop(shop_id, product_id, product_name, product_price);
    }

    private static void search_Product_By_Shop() {
        System.out.print("enter shop id : ");
        int shop_id = sc.nextInt();
        bl.search_Product_By_Shop(shop_id);
    }

    private static void update_Product_In_Shop() {
        System.out.print("enter shop id : ");
        int shop_id = sc.nextInt();
        System.out.print("enter product  id : ");
        int product_id = sc.nextInt();
        System.out.print("enter product name : ");
        String product_name = sc.next();
        System.out.print("enter product price : ");
        double product_price = sc.nextDouble();
        bl.update_Product_In_Shop(shop_id, product_id, product_name, product_price);
    }

    private static void remove_Product_From_Shop() {
        System.out.print("enter shop id : ");
        int shop_id = sc.nextInt();
        System.out.print("enter product  id : ");
        int product_id = sc.nextInt();
        bl.remove_Product_From_Shop(shop_id, product_id);
    }

    private static void display_Shop() {
        bl.display_Shop();
    }

    private static void add_shop() {
        System.out.print("enter shop id : ");
        int shop_id = sc.nextInt();
        System.out.print("enter shop name : ");
        String shop_name = sc.next();
        System.out.print("enter shop type : ");
        String shop_type = sc.next();
        ArrayList<Product> product_data = new ArrayList<>();
        boolean flag = false;
        while (!flag) {
            System.out.println("1. ADD PRODUCT     2.EXIT");
            System.out.print("enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    product_data.add(add_product());
                    break;
                case 2:
                    System.out.println("exited");
                    flag = true;
                    break;
                default:
                    System.out.println("enter valid choice");
                    break;
            }
        }
        Shop s1 = new Shop(shop_id, shop_name, shop_type, product_data);
        bl.add_shop(s1);
    }

    private static Product add_product() {
        System.out.print("enter product  id : ");
        int product_id = sc.nextInt();
        System.out.print("enter product name : ");
        String product_name = sc.next();
        System.out.print("enter product price : ");
        double product_price = sc.nextDouble();
        return new Product(product_id, product_name, product_price);
    }
}
