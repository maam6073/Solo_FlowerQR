package com.sujung.flowerQR.board.mapper;

import com.sujung.flowerQR.board.dto.BoardDeleteDto;
import com.sujung.flowerQR.board.dto.BoardPatchDto;
import com.sujung.flowerQR.board.dto.BoardPostDto;
import com.sujung.flowerQR.board.dto.BoardResponseDto;
import com.sujung.flowerQR.board.entity.Board;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-16T15:35:22+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.4.jar, environment: Java 11.0.20 (Azul Systems, Inc.)"
)
@Component
public class BoardMapperImpl implements BoardMapper {

    @Override
    public Board boardPostDtoToBoard(BoardPostDto boardPostDto) {
        if ( boardPostDto == null ) {
            return null;
        }

        Board.BoardBuilder board = Board.builder();

        board.nickname( boardPostDto.getNickname() );
        board.title( boardPostDto.getTitle() );
        board.content( boardPostDto.getContent() );
        board.content_pw( boardPostDto.getContent_pw() );

        return board.build();
    }

    @Override
    public Board boardPatchDtoToBoard(BoardPatchDto boardPatchDto) {
        if ( boardPatchDto == null ) {
            return null;
        }

        Board.BoardBuilder board = Board.builder();

        board.boardId( boardPatchDto.getBoardId() );
        board.content( boardPatchDto.getContent() );
        board.content_pw( boardPatchDto.getContent_pw() );

        return board.build();
    }

    @Override
    public Board boardDeleteDtoToBoard(BoardDeleteDto boardDeleteDto) {
        if ( boardDeleteDto == null ) {
            return null;
        }

        Board.BoardBuilder board = Board.builder();

        board.boardId( boardDeleteDto.getBoardId() );
        board.content_pw( boardDeleteDto.getContent_pw() );

        return board.build();
    }

    @Override
    public BoardResponseDto.ContentResponse boardToContentResponseDto(Board board) {
        if ( board == null ) {
            return null;
        }

        BoardResponseDto.ContentResponse contentResponse = new BoardResponseDto.ContentResponse();

        contentResponse.setTitle( board.getTitle() );
        contentResponse.setContent( board.getContent() );
        contentResponse.setContent_pw( board.getContent_pw() );
        contentResponse.setComment( board.getComment() );
        contentResponse.setView_count( board.getView_count() );

        return contentResponse;
    }

    @Override
    public BoardResponseDto.PatchResponse boardToPatchResponse(Board board) {
        if ( board == null ) {
            return null;
        }

        BoardResponseDto.PatchResponse.PatchResponseBuilder patchResponse = BoardResponseDto.PatchResponse.builder();

        patchResponse.nickname( board.getNickname() );
        patchResponse.title( board.getTitle() );
        patchResponse.content( board.getContent() );

        return patchResponse.build();
    }
}
