package com.chamcode.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TaiKhoan", schema = "dbo", catalog = "luyencode")
public class TaiKhoan {
    private String username;
    private String password;
    private String ten;
    private Integer diem;
    private String thoigian;
    private String thanhtich;
    private String namsinh;
    private String email;
    private String facebook;
    private String baidalam;
    private String gioithieu;
    private String role;

    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "ten")
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "diem")
    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    @Basic
    @Column(name = "thoigian")
    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    @Basic
    @Column(name = "thanhtich")
    public String getThanhtich() {
        return thanhtich;
    }

    public void setThanhtich(String thanhtich) {
        this.thanhtich = thanhtich;
    }

    @Basic
    @Column(name = "namsinh")
    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "facebook")
    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Basic
    @Column(name = "baidalam")
    public String getBaidalam() {
        return baidalam;
    }

    public void setBaidalam(String baidalam) {
        this.baidalam = baidalam;
    }

    @Basic
    @Column(name = "gioithieu")
    public String getGioithieu() {
        return gioithieu;
    }

    public void setGioithieu(String gioithieu) {
        this.gioithieu = gioithieu;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaiKhoan taiKhoan = (TaiKhoan) o;
        return Objects.equals(username, taiKhoan.username) &&
                Objects.equals(password, taiKhoan.password) &&
                Objects.equals(ten, taiKhoan.ten) &&
                Objects.equals(diem, taiKhoan.diem) &&
                Objects.equals(thoigian, taiKhoan.thoigian) &&
                Objects.equals(thanhtich, taiKhoan.thanhtich) &&
                Objects.equals(namsinh, taiKhoan.namsinh) &&
                Objects.equals(email, taiKhoan.email) &&
                Objects.equals(facebook, taiKhoan.facebook) &&
                Objects.equals(baidalam, taiKhoan.baidalam) &&
                Objects.equals(gioithieu, taiKhoan.gioithieu) &&
                Objects.equals(role, taiKhoan.role);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, password, ten, diem, thoigian, thanhtich, namsinh, email, facebook, baidalam, gioithieu, role);
    }
}
