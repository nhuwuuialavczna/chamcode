package com.chamcode.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "baicode", schema = "dbo", catalog = "luyencode")
public class Baicode {
    private String mabaicode;
    private String tenbaicode;
    private String noidung;
    private String loaibai;
    private String chuong;
    private String dulieutest;
    private String dulieuoutput;
    private String vietlaihammain;
    private String interfaceCode;
    private String superclass;
    private String generic;
    private String rangbuoc;
    private String tenphuongthuc;
    private String danhsachthamso;
    private String thoigian;
    private String thongtinthem;
    private String mucdo;
    private String kieutrave;
    private String username;

    @Id
    @Column(name = "mabaicode")
    public String getMabaicode() {
        return mabaicode;
    }

    public void setMabaicode(String mabaicode) {
        this.mabaicode = mabaicode;
    }

    @Basic
    @Column(name = "tenbaicode")
    public String getTenbaicode() {
        return tenbaicode;
    }

    public void setTenbaicode(String tenbaicode) {
        this.tenbaicode = tenbaicode;
    }

    @Basic
    @Column(name = "noidung")
    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    @Basic
    @Column(name = "loaibai")
    public String getLoaibai() {
        return loaibai;
    }

    public void setLoaibai(String loaibai) {
        this.loaibai = loaibai;
    }

    @Basic
    @Column(name = "chuong")
    public String getChuong() {
        return chuong;
    }

    public void setChuong(String chuong) {
        this.chuong = chuong;
    }

    @Basic
    @Column(name = "dulieutest")
    public String getDulieutest() {
        return dulieutest;
    }

    public void setDulieutest(String dulieutest) {
        this.dulieutest = dulieutest;
    }

    @Basic
    @Column(name = "dulieuoutput")
    public String getDulieuoutput() {
        return dulieuoutput;
    }

    public void setDulieuoutput(String dulieuoutput) {
        this.dulieuoutput = dulieuoutput;
    }

    @Basic
    @Column(name = "vietlaihammain")
    public String getVietlaihammain() {
        return vietlaihammain;
    }

    public void setVietlaihammain(String vietlaihammain) {
        this.vietlaihammain = vietlaihammain;
    }

    @Basic
    @Column(name = "interface")
    public String getInterfaceCode() {
        return interfaceCode;
    }

    public void setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    @Basic
    @Column(name = "superclass")
    public String getSuperclass() {
        return superclass;
    }

    public void setSuperclass(String superclass) {
        this.superclass = superclass;
    }

    @Basic
    @Column(name = "generic")
    public String getGeneric() {
        return generic;
    }

    public void setGeneric(String generic) {
        this.generic = generic;
    }

    @Basic
    @Column(name = "rangbuoc")
    public String getRangbuoc() {
        return rangbuoc;
    }

    public void setRangbuoc(String rangbuoc) {
        this.rangbuoc = rangbuoc;
    }

    @Basic
    @Column(name = "tenphuongthuc")
    public String getTenphuongthuc() {
        return tenphuongthuc;
    }

    public void setTenphuongthuc(String tenphuongthuc) {
        this.tenphuongthuc = tenphuongthuc;
    }

    @Basic
    @Column(name = "danhsachthamso")
    public String getDanhsachthamso() {
        return danhsachthamso;
    }

    public void setDanhsachthamso(String danhsachthamso) {
        this.danhsachthamso = danhsachthamso;
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
    @Column(name = "thongtinthem")
    public String getThongtinthem() {
        return thongtinthem;
    }

    public void setThongtinthem(String thongtinthem) {
        this.thongtinthem = thongtinthem;
    }

    @Basic
    @Column(name = "mucdo")
    public String getMucdo() {
        return mucdo;
    }

    public void setMucdo(String mucdo) {
        this.mucdo = mucdo;
    }

    @Basic
    @Column(name = "kieutrave")
    public String getKieutrave() {
        return kieutrave;
    }

    public void setKieutrave(String kieutrave) {
        this.kieutrave = kieutrave;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baicode baicode = (Baicode) o;
        return Objects.equals(mabaicode, baicode.mabaicode) &&
                Objects.equals(tenbaicode, baicode.tenbaicode) &&
                Objects.equals(noidung, baicode.noidung) &&
                Objects.equals(loaibai, baicode.loaibai) &&
                Objects.equals(chuong, baicode.chuong) &&
                Objects.equals(dulieutest, baicode.dulieutest) &&
                Objects.equals(dulieuoutput, baicode.dulieuoutput) &&
                Objects.equals(vietlaihammain, baicode.vietlaihammain) &&
                Objects.equals(interfaceCode, baicode.interfaceCode) &&
                Objects.equals(superclass, baicode.superclass) &&
                Objects.equals(generic, baicode.generic) &&
                Objects.equals(rangbuoc, baicode.rangbuoc) &&
                Objects.equals(tenphuongthuc, baicode.tenphuongthuc) &&
                Objects.equals(danhsachthamso, baicode.danhsachthamso) &&
                Objects.equals(thoigian, baicode.thoigian) &&
                Objects.equals(thongtinthem, baicode.thongtinthem) &&
                Objects.equals(mucdo, baicode.mucdo) &&
                Objects.equals(kieutrave, baicode.kieutrave) &&
                Objects.equals(username, baicode.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mabaicode, tenbaicode, noidung, loaibai, chuong, dulieutest, dulieuoutput, vietlaihammain, interfaceCode, superclass, generic, rangbuoc, tenphuongthuc, danhsachthamso, thoigian, thongtinthem, mucdo, kieutrave, username);
    }
}
