package com.example.demo.service;

import com.example.demo.model.Pc;

import java.util.List;

public interface PcService {
    List<Pc> getAllpcs();
    void savePc(Pc pc);
    Pc getPcById(long id);
}