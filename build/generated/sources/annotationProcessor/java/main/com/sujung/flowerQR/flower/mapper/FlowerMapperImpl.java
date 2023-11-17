package com.sujung.flowerQR.flower.mapper;

import com.sujung.flowerQR.flower.dto.FlowerPostDto;
import com.sujung.flowerQR.flower.dto.FlowerResponseDto;
import com.sujung.flowerQR.flower.entity.Flower;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-17T17:33:02+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 11.0.20 (Azul Systems, Inc.)"
)
@Component
public class FlowerMapperImpl implements FlowerMapper {

    @Override
    public Flower flowerPostDtoToFlower(FlowerPostDto flowerPostDto) {
        if ( flowerPostDto == null ) {
            return null;
        }

        Flower.FlowerBuilder flower = Flower.builder();

        flower.name( flowerPostDto.getName() );
        flower.sub_name( flowerPostDto.getSub_name() );
        flower.content( flowerPostDto.getContent() );
        flower.sunlight_content( flowerPostDto.getSunlight_content() );

        return flower.build();
    }

    @Override
    public FlowerResponseDto flowerToFlowerResponseDto(Flower flower) {
        if ( flower == null ) {
            return null;
        }

        FlowerResponseDto.FlowerResponseDtoBuilder flowerResponseDto = FlowerResponseDto.builder();

        flowerResponseDto.name( flower.getName() );
        flowerResponseDto.sub_name( flower.getSub_name() );
        flowerResponseDto.content( flower.getContent() );
        flowerResponseDto.sunlight_content( flower.getSunlight_content() );

        return flowerResponseDto.build();
    }
}
