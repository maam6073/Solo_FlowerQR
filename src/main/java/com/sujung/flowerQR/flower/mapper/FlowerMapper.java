package com.sujung.flowerQR.flower.mapper;

import com.sujung.flowerQR.flower.dto.FlowerPostDto;
import com.sujung.flowerQR.flower.dto.FlowerResponseDto;
import com.sujung.flowerQR.flower.entity.Flower;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FlowerMapper {
    Flower flowerPostDtoToFlower(FlowerPostDto flowerPostDto);


    FlowerResponseDto flowerToFlowerResponseDto(Flower flower);
}
