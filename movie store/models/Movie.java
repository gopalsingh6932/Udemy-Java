package models;

public class Movie {
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;

    public Movie(String name, String format, double rating) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name can not be null/blank");
        }
        if (!(format.equals("DVD")) && !(format.equals("Blue-Ray"))) {
            throw new IllegalArgumentException("format must be DVD or Blue_Ray");
        }
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Invalid rating");
        }
        this.name = name;
        this.format = format;
        this.rating = rating;
        this.sellingPrice = (format.equals("Blue-Ray") ? 4.25 : 2.25);
        this.rentalPrice = (format.equals("Blue-Ray") ? 1.99 : 0.99);
        this.isAvailable = true;
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
        this.isAvailable = source.isAvailable;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name can not be null or blank");
        }
        this.name = name;
    }

    public void setFormat(String format) {
        if (!(format.equals("DVD")) || !(format.equals("Blue-Ray"))) {
            throw new IllegalArgumentException("format must be DVD or Blue_Ray");
        }
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("format can not be null or blank");
        }
        this.format = format;
        setSellingPrice(format.equals("Blue-Ray") ? 4.25 : 2.25);
        setRentalPrice(format.equals("Blue_ray") ? 1.99 : 0.99);
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Invalid rating");
        }
        this.rating = rating;
    }

    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String toString() {
        String temp = "\t Name: " + this.name + "\n" +
                "\t Format: " + this.format + "\n" +
                "\t Rating: " + this.rating + "\n" +
                "\t Selling Price: " + this.sellingPrice + "\n" +
                "\t Rental Price: " + this.rentalPrice + "\n" +
                "\t Availability: " + ((this.isAvailable) ? "in-stock" : "rented") + "\n";
        return temp;
    }

}
