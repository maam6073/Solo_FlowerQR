package com.sujung.flowerQR.board.mapper;


import com.sujung.flowerQR.board.dto.BoardPatchDto;
import com.sujung.flowerQR.board.dto.BoardPostDto;
import com.sujung.flowerQR.board.dto.BoardResponseDto;
import com.sujung.flowerQR.board.entity.Board;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardMapper {
    Board boardPostDtoToBoard(BoardPostDto boardPostDto);

    Board boardPatchDtoToBoard(BoardPatchDto boardPatchDto);

    BoardResponseDto.ContentResponse boardToContentResponseDto(Board board);
    //BoardResponseDto.SimpleContentsResponse boardToSimpleContentsResponse(Board board);
    BoardResponseDto.PatchResponse boardToPatchResponse(Board board);
}
