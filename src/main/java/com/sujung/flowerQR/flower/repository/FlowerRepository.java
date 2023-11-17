package com.sujung.flowerQR.flower.repository;

import com.sujung.flowerQR.flower.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower,Long> {

}
