package com.mybatis2.pojo;

import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * @author : GOU
 */
@Alias("orders2")
public class Orders2 {
  //订单Id
  private long id;
  //订单编号
  private String number;
  //关联商品集合信息
  private List<Product> productList;

  @Override
  public String toString() {
    return "Orders2{" +
            "id=" + id +
            ", number='" + number + '\'' +
            ", productList=" + productList +
            '}';
  }

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


}
