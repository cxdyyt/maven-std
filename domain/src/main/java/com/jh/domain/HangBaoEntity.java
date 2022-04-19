package com.jh.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "hang_bao")
public class HangBaoEntity {
    private int id;
    private String name;
    private Byte age;
    private String loveType;
    private Date birthday;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age")
    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    @Basic
    @Column(name = "loveType")
    public String getLoveType() {
        return loveType;
    }

    public void setLoveType(String loveType) {
        this.loveType = loveType;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HangBaoEntity that = (HangBaoEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(loveType, that.loveType) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, loveType, birthday);
    }
}
