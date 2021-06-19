package com.example.recycleview;

public class CarBrand {

    private int id;
    private String name;
    private int dateOfManufacturing;
    private String imageURL;

    public CarBrand(int id, String name, int dateOfManufacturing, String imageURL) {
        this.id = id;
        this.name = name;
        this.dateOfManufacturing = dateOfManufacturing;
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "CarBrand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfManufacturing=" + dateOfManufacturing +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(int dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
