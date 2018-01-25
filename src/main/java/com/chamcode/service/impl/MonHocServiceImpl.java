package com.chamcode.service.impl;

import com.chamcode.dao.MonHocDAO;
import com.chamcode.model.Monhoc;
import com.chamcode.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonHocServiceImpl implements MonHocService {

    @Autowired
    MonHocDAO monHocDAO;


    @Override
    public List<Monhoc> getAll() {
        return monHocDAO.getAll();
    }

    @Override
    public boolean add(Monhoc monhoc) {
        return monHocDAO.add(monhoc);
    }

    @Override
    public Monhoc getMonhoc(String id) {
        return monHocDAO.getMonhoc(id);
    }
}
