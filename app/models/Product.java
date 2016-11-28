package models;

public class Product {

  private Long id;
  private String name;
  private String description;
  private int stock;
  private double price;


public Product() {
}

   public Product(Long id, String name, String description, int stock, double price) {

      this.id=id;
       this.name=name;
       this.description=description;
       this.stock=stock;
       this.price=price;
}

  public Long getId() {
    return id; 
 }

 public void setId(Long id)  {
   this.id = id;
 }

   public String getName() { 
    return name;
}


  
