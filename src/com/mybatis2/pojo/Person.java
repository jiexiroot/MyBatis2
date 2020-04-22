package com.mybatis2.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @author GOU
 */
@Alias("person")
public class Person {

  private long id;
  private String name;
  private long age;
  private String sex;

  private Idcard cardId;

  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", cardId=" + cardId +
            '}';
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


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Idcard getCardId() {
    return cardId;
  }

  public void setCardId(Idcard cardId) {
    this.cardId = cardId;
  }


}
