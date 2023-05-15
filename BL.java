package Shop;

import java.util.ArrayList;

public class BL {
    private final ArrayList<Shop> shop_data = new ArrayList<>();

    {
        ArrayList<Product> data = new ArrayList<>();
        data.add(new Product(101, "jeans", 2899));
        data.add(new Product(102, "shirt", 1244));
        data.add(new Product(103, "jacket", 4999));
        data.add(new Product(104, "trousers", 1899));
        shop_data.add(new Shop(3221, "rahul", "mens_were", data));
        ArrayList<Product> data1 = new ArrayList<>();
        data1.add(new Product(201, "vitA", 99));
        data1.add(new Product(202, "vitB", 44));
        data1.add(new Product(203, "vitC", 49));
        data1.add(new Product(204, "vitD", 89));
        shop_data.add(new Shop(1921, "kiran", "medical", data1));
    }

    public void display_Shop() {
        for (int i = 0; i < shop_data.size(); i++) {
            System.out.println();
            System.out.println((i + 1) + ". " + shop_data.get(i).getShop_id() + "  " + (shop_data.get(i).getShop_name() + "  " + shop_data.get(i).getShop_type()));
            System.out.println("PRODUCT LIST : ");
            for (int j = 0; j < shop_data.get(i).getData().size(); j++) {
                System.out.println("               " + (j + 1) + ". " + shop_data.get(i).getData().get(j).getProduct_id() + "  " + shop_data.get(i).getData().get(j).getProduct_name() + "  " + shop_data.get(i).getData().get(j).getProduct_price());
            }
        }
    }

    public void add_shop(Shop s1) {
        shop_data.add(s1);
    }

    public void remove_Product_From_Shop(int shop_id, int product_id) {
        boolean b1 = false;
        for (Shop shopDatum : shop_data) {
            if (shopDatum.getShop_id() == shop_id) {
                for (int j = 0; j < shopDatum.getData().size(); j++) {
                    if (product_id == shopDatum.getData().get(j).getProduct_id()) {
                        shopDatum.getData().remove(j);
                        b1 = true;
                        System.out.println("product deleted successfully ");
                        break;
                    }
                }
            }
        }
        if (!b1) {
            System.out.println("product not found");
        }
    }

    public void update_Product_In_Shop(int shopId, int productId, String product_name, double product_price) {
        boolean b1 = false;
        for (Shop shopDatum : shop_data) {
            if (shopDatum.getShop_id() == shopId) {
                for (int j = 0; j < shopDatum.getData().size(); j++) {
                    if (productId == shopDatum.getData().get(j).getProduct_id()) {
                        shopDatum.getData().get(j).setProduct_name(product_name);
                        shopDatum.getData().get(j).setProduct_price(product_price);
                        b1 = true;
                        System.out.println("product deleted successfully ");
                        break;
                    }
                }
            }
        }
        if (!b1) {
            System.out.println("product not found");
        }
    }

    public void search_Product_By_Shop(int shopId) {
        boolean b1 = false;
        for (Shop shopDatum : shop_data) {
            if (shopDatum.getShop_id() == shopId) {
                for (int j = 0; j < shopDatum.getData().size(); j++) {
                    System.out.println("             " + (j + 1) + ". " + shopDatum.getData().get(j).getProduct_id() + "  " + shopDatum.getData().get(j).getProduct_name() + "  " + shopDatum.getData().get(j).getProduct_price());
                    b1 = true;
                }
            }
        }
        if (!b1) {
            System.out.println("shop not found");
        }
    }


    public void add_Product_Into_Shop(int shopId, int productId, String productName, double productPrice) {
        boolean b1 = false;
        for (Shop shopDatum : shop_data) {
            if (shopDatum.getShop_id() == shopId) {
                shopDatum.getData().add(new Product(productId, productName, productPrice));
                System.out.println("product inserted successfully in shop ");
                b1 = true;
            }
        }
        if (!b1) {
            System.out.println("shop not found");
        }
    }
}
