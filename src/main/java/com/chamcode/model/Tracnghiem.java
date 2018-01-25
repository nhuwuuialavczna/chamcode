package com.chamcode.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tracnghiem", schema = "dbo", catalog = "luyencode")
public class Tracnghiem {
    private String macauhoi;
    private String cauhoi;
    private String dapanA;
    private String dapanB;
    private String dapanC;
    private String dapanD;
    private String dapAnDung;
    private String mamonhoc;
    private String thoigian;
    private Integer mucdo;
    private String username;

    @Id
    @Column(name = "macauhoi")
    public String getMacauhoi() {
        return macauhoi;
    }

    public void setMacauhoi(String macauhoi) {
        this.macauhoi = macauhoi;
    }

    @Basic
    @Column(name = "cauhoi")
    public String getCauhoi() {
        return cauhoi;
    }

    public void setCauhoi(String cauhoi) {
        this.cauhoi = cauhoi;
    }

    @Basic
    @Column(name = "dapanA")
    public String getDapanA() {
        return dapanA;
    }

    public void setDapanA(String dapanA) {
        this.dapanA = dapanA;
    }

    @Basic
    @Column(name = "dapanB")
    public String getDapanB() {
        return dapanB;
    }

    public void setDapanB(String dapanB) {
        this.dapanB = dapanB;
    }

    @Basic
    @Column(name = "dapanC")
    public String getDapanC() {
        return dapanC;
    }

    public void setDapanC(String dapanC) {
        this.dapanC = dapanC;
    }

    @Basic
    @Column(name = "dapanD")
    public String getDapanD() {
        return dapanD;
    }

    public void setDapanD(String dapanD) {
        this.dapanD = dapanD;
    }

    @Basic
    @Column(name = "dapAnDung")
    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    @Basic
    @Column(name = "mamonhoc")
    public String getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(String mamonhoc) {
        this.mamonhoc = mamonhoc;
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
    @Column(name = "mucdo")
    public Integer getMucdo() {
        return mucdo;
    }

    public void setMucdo(Integer mucdo) {
        this.mucdo = mucdo;
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
        Tracnghiem that = (Tracnghiem) o;
        return Objects.equals(macauhoi, that.macauhoi) &&
                Objects.equals(cauhoi, that.cauhoi) &&
                Objects.equals(dapanA, that.dapanA) &&
                Objects.equals(dapanB, that.dapanB) &&
                Objects.equals(dapanC, that.dapanC) &&
                Objects.equals(dapanD, that.dapanD) &&
                Objects.equals(dapAnDung, that.dapAnDung) &&
                Objects.equals(mamonhoc, that.mamonhoc) &&
                Objects.equals(thoigian, that.thoigian) &&
                Objects.equals(mucdo, that.mucdo) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(macauhoi, cauhoi, dapanA, dapanB, dapanC, dapanD, dapAnDung, mamonhoc, thoigian, mucdo, username);
    }
}
