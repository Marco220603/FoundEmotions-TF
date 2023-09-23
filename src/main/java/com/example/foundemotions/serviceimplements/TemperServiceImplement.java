package com.example.foundemotions.serviceimplements;

import com.example.foundemotions.entities.Temper;
import com.example.foundemotions.repositories.ITemperRepository;
import com.example.foundemotions.serviceinterface.ITemperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperServiceImplement implements ITemperService {
    @Autowired
    private ITemperRepository tR;
    @Override
    public void insert(Temper temper) {
        tR.save(temper);
    }

    @Override
    public void delete(int idtemper) {
        tR.deleteById(idtemper);
    }

    @Override
    public Temper listId(int idtemper) {
        return null;
    }

    @Override
    public List<Temper> list() {
        return null;
    }
}
