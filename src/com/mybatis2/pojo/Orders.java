package com.mybatis2.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @author : GOU
 */
@Alias("orders")
public class Orders {
  //订单Id
  private long id;
  //订单编号
  private String number;

  @Override
  public String toString() {
    return "Orders{" +
            "id=" + id +
            ", number='" + number + '\'' +
            '}';
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
