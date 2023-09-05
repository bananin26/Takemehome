package pe.edu.upc.aww.takemehometf.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;
    @Column(name = "limit_date",nullable = false)
    private LocalDate limitDate;
    @Column(name = "destination_country",length = 45,nullable = false)
    private String destinationCountry;
    @Column(name = "destination_city",length = 45,nullable = false)
    private String destinationCity;
    @Column(name = "destination_address",length = 75,nullable = false)
    private String destinationAddress;
    @Column(name = "origin_country",length = 35,nullable = false)
    private String originCountry;
    @Column(name = "origin_city",length = 45,nullable = false)
    private String originCity;
    @Column(name = "name_product",length = 45,nullable = false)
    private String nameProduct;
    @Column(name = "category_product",length = 45,nullable = false)
    private String categoryProduct;
    @Column(name = "price_product",nullable = false)
    private String priceProduct;
    @Column(length = 2000)
    private String urlProduct;
    @Column(name = "dimensions_product",length = 20,nullable = false)
    private String dimensionsProduct;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    public Order() {
    }
    public Order(int idOrder,LocalDate limitDate, String destinationCountry, String destinationCity, String destinationAddress, String originCountry,String originCity, String urlProduct, String nameProduct, String categoryProduct, String priceProduct, String dimensionsProduct,User user) {
        this.idOrder = idOrder;
        this.limitDate = limitDate;
        this.destinationCountry = destinationCountry;
        this.destinationCity = destinationCity;
        this.destinationAddress = destinationAddress;
        this.originCountry = originCountry;
        this.originCity=originCity;
        this.nameProduct = nameProduct;
        this.categoryProduct = categoryProduct;
        this.priceProduct = priceProduct;
        this.urlProduct = urlProduct;
        this.dimensionsProduct = dimensionsProduct;
        this.user=user;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public LocalDate getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(LocalDate limitDate) {
        this.limitDate = limitDate;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getUrlProduct() {
        return urlProduct;
    }

    public void setUrlProduct(String urlProduct) {
        this.urlProduct = urlProduct;
    }

    public String getDimensionsProduct() {
        return dimensionsProduct;
    }

    public void setDimensionsProduct(String dimensionsProduct) {
        this.dimensionsProduct = dimensionsProduct;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
