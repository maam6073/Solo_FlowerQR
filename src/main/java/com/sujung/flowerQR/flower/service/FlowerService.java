package com.sujung.flowerQR.flower.service;

import com.sujung.flowerQR.flower.entity.Flower;
import com.sujung.flowerQR.flower.repository.FlowerRepository;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }


    public Flower createFlower(Flower flower){
        return flowerRepository.save(flower);
    }







}
