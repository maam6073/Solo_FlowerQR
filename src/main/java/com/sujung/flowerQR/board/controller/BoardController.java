package com.sujung.flowerQR.board.controller;

import com.sujung.flowerQR.board.dto.BoardDeleteDto;
import com.sujung.flowerQR.board.dto.BoardPatchDto;
import com.sujung.flowerQR.board.dto.BoardPostDto;
import com.sujung.flowerQR.board.dto.BoardResponseDto;
import com.sujung.flowerQR.board.entity.Board;
import com.sujung.flowerQR.board.mapper.BoardMapper;
import com.sujung.flowerQR.board.service.BoardService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping(value = "/boards")
@Validated
public class BoardController {
    private final BoardMapper boardMapper;
    private final BoardService boardService;

    BoardController(BoardMapper boardMapper, BoardService boardService){
        this.boardMapper = boardMapper;
        this.boardService = boardService;
    }

    //글 작성
    @PostMapping
    public ResponseEntity postBoard(@Valid @RequestBody BoardPostDto boardPostDto){
        boardService.createBoard(boardMapper.boardPostDtoToBoard(boardPostDto));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //글 수정
    @PatchMapping("/{board-id}")
    public ResponseEntity patchBoard(@PathVariable("board-id") @Positive Long boardId,
                                         @Valid @RequestBody BoardPatchDto boardPatchDto){
        Board board;
        BoardResponseDto.PatchResponse response;
        boardPatchDto.setBoardId(boardId);

        if(boardService.alterBoard(boardMapper.boardPatchDtoToBoard(boardPatchDto)) != null){
            board = boardService.alterBoard(boardMapper.boardPatchDtoToBoard(boardPatchDto));
            response = boardMapper.boardToPatchResponse(board);
        }
        else
            response = BoardResponseDto.PatchResponse.builder()
                    .message("게시글 비밀번호가 맞지 않습니다.")
                    .build();

        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    //글 조회
    @GetMapping("/{board-id}")
    public ResponseEntity getBoard(@PathVariable("board-id") @Positive Long boardId){
        Board board = boardService.findBoardById(boardId);
        BoardResponseDto.ContentResponse response = boardMapper.boardToContentResponseDto(board);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    //글 삭제
    @DeleteMapping("/{board-id}")
    public ResponseEntity deleteBoard(@PathVariable("board-id") @Positive Long boardId,
                                      @Valid @RequestBody BoardDeleteDto boardDeleteDto){
        boardDeleteDto.setBoardId(boardId);
        boardService.dropBoard(boardMapper.boardDeleteDtoToBoard(boardDeleteDto));
        return new ResponseEntity<>(HttpStatus.OK);
    }


    //글 전체 조회
    @GetMapping
    public ResponseEntity getBoards(@Positive @RequestParam int page,
                                    @Positive @RequestParam int size){
        Page<Board> pageBoards = boardService.findBoards(page-1,size);
        //BoardResponseDto.SimpleContentsResponse response =
        //return new ResponseEntity<>(new Board)
        return null;
    }
}
