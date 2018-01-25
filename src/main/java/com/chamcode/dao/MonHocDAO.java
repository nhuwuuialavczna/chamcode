package com.chamcode.dao;

import com.chamcode.model.Monhoc;

import java.util.List;

public interface MonHocDAO {

    List<Monhoc> getAll();

    boolean add(Monhoc monhoc);

    Monhoc getMonhoc(String id);

}
