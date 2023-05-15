package Shop;

import java.util.ArrayList;

public class Shop {
    private int shop_id;
    private String shop_name;
    private String shop_type;
    private ArrayList<Product> data = new ArrayList<>();

    public Shop(int shop_id, String shop_name, String shop_type, ArrayList<Product> data) {
        this.shop_id = shop_id;
        this.shop_name = shop_name;
        this.shop_type = shop_type;
        this.data = data;
    }

    public ArrayList<Product> getData() {
        return data;
    }

    public void setData(Product data) {
        this.data.add(data);
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_type() {
        return shop_type;
    }

    public void setShop_type(String shop_type) {
        this.shop_type = shop_type;
    }
}
