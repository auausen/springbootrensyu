package com.example.demo.service;

import com.example.demo.model.Pc;
import com.example.demo.repository.PcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PcServiceImpl implements PcService {

    @Autowired
    private PcRepository pcRepository;

    @Override
    public List<Pc> getAllpcs() {
        return pcRepository.findAll();
    }

    @Override
    public void savePc(Pc pc) {
        this.pcRepository.save(pc);
    }

    @Override
    public Pc getPcById(long id) {
        Optional<Pc> optional = pcRepository.findById(id);
        Pc pc = null;
        if(optional.isPresent()){
            pc = optional.get();
        }else{
            throw new RuntimeException("PCが見つかりませんでした。ID番号: " + id);
        }
        return pc;
    }
}
