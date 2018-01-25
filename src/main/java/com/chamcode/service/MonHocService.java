package com.chamcode.service;

import com.chamcode.model.Monhoc;

import java.util.List;

public interface MonHocService {

    List<Monhoc> getAll();

    boolean add(Monhoc monhoc);

    Monhoc getMonhoc(String id);
}
