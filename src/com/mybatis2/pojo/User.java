package com.mybatis2.pojo;


import org.apache.ibatis.type.Alias;

import java.util.List;

/**
 * @author : GOU
 */
@Alias("user")
public class User {
  //用户编号
  private long id;
  //用户姓名
  private String username;
  //用户地址
  private String address;
  //用户关联的订单
  private List<Orders> ordersList;

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", address='" + address + '\'' +
            ", ordersList=" + ordersList +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public List<Orders> getOrdersList() {
    return ordersList;
  }

  public void setOrdersList(List<Orders> ordersList) {
    this.ordersList = ordersList;
  }
}
