package com.mybatis2.pojo;


import org.apache.ibatis.type.Alias;

/**
 * @author GOU
 */
@Alias("idCard")
public class Idcard {

  private long id;
  private String code;

  @Override
  public String toString() {
    return "Idcard{" +
            "id=" + id +
            ", code='" + code + '\'' +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

}
