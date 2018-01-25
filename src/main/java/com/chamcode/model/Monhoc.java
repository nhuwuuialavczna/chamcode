package com.chamcode.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "monhoc", schema = "dbo", catalog = "luyencode")
public class Monhoc {
    private String mamonhoc;
    private String tenmonhoc;

    @Id
    @Column(name = "mamonhoc")
    public String getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(String mamonhoc) {
        this.mamonhoc = mamonhoc;
    }

    @Basic
    @Column(name = "tenmonhoc")
    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monhoc monhoc = (Monhoc) o;
        return Objects.equals(mamonhoc, monhoc.mamonhoc) &&
                Objects.equals(tenmonhoc, monhoc.tenmonhoc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mamonhoc, tenmonhoc);
    }
}
