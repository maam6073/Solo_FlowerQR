package com.sujung.flowerQR.flower.controller;

import com.sujung.flowerQR.flower.dto.FlowerPostDto;
import com.sujung.flowerQR.flower.dto.FlowerResponseDto;
import com.sujung.flowerQR.flower.entity.Flower;
import com.sujung.flowerQR.flower.mapper.FlowerMapper;
import com.sujung.flowerQR.flower.service.FlowerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/flowers")
@Validated
public class FlowerController {
    private final FlowerService flowerService;
    private final FlowerMapper flowerMapper;

    FlowerController(FlowerService flowerService,FlowerMapper flowerMapper){
        this.flowerService = flowerService;
        this.flowerMapper = flowerMapper;
    }

    //꽃 등록
    @PostMapping
    public ResponseEntity postFlower(@Valid @RequestBody FlowerPostDto flowerPostDto){
        Flower flower = flowerService.createFlower(flowerMapper.flowerPostDtoToFlower(flowerPostDto));
        FlowerResponseDto response = flowerMapper.flowerToFlowerResponseDto(flower);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }
}
