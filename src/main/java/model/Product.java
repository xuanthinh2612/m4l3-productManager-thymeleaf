package model;

public class Product {
    private int id;
    private String productName;
    private String maker;
    private String description;

    public Product() {
    }

    public Product(int id, String productName, String maker, String description) {
        this.id = id;
        this.productName = productName;
        this.maker = maker;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
