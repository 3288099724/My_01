package com.bs.entity;


/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;*/

import lombok.Data;

import java.util.Date;
import java.util.Objects;

//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;

//@Document(indexName = "supplier",type = "s")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Supplier {
   // @Id
    private String id;


    private String name;

    @Field(type = FieldType.text,analyzer ="ik_max_word")
    private String leader;
//
    //@Field(type = FieldType.text,analyzer ="ik_max_word")
    private String phone;
//
    //@Field(type = FieldType.Date)
    private Date create_date;



   public Supplier() {
    }

    public Supplier(String id, String name, String leader, String phone, Date create_date) {
        this.id = id;
        this.name = name;
        this.leader = leader;
        this.phone = phone;
        this.create_date = create_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", leader='" + leader + '\'' +
                ", phone='" + phone + '\'' +
                ", create_date=" + create_date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(id, supplier.id) &&
                Objects.equals(name, supplier.name) &&
                Objects.equals(leader, supplier.leader) &&
                Objects.equals(phone, supplier.phone) &&
                Objects.equals(create_date, supplier.create_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, leader, phone, create_date);
    }
  }