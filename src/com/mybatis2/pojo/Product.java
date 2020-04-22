package com.mybatis2.pojo;


import org.apache.ibatis.type.Alias;

import java.util.List;
@Alias("product")
public class Product {
  //商品id
  private long id;
  //商品名称
  private String name;
  //商品单价
  private double price;
  //与订单的关联属性
  private List<Orders2> orders;

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", orders=" + orders +
            '}';
  }

  public List<Orders2> getOrders() {
    return orders;
  }

  public void setOrders(List<Orders2> orders) {
    this.orders = orders;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
