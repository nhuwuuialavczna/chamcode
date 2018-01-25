package com.chamcode.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(SubmitsionPK.class)
@Table(name = "Submitsion", schema = "dbo", catalog = "luyencode")
public class Submitsion {
    private String mabaicode;
    private String username;
    private Integer diem;
    private String thoigian;

    @Id
    @Column(name = "mabaicode")
    public String getMabaicode() {
        return mabaicode;
    }

    public void setMabaicode(String mabaicode) {
        this.mabaicode = mabaicode;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "diem")
    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    @Id
    @Column(name = "thoigian")
    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Submitsion that = (Submitsion) o;
        return Objects.equals(mabaicode, that.mabaicode) &&
                Objects.equals(username, that.username) &&
                Objects.equals(diem, that.diem) &&
                Objects.equals(thoigian, that.thoigian);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mabaicode, username, diem, thoigian);
    }
}
