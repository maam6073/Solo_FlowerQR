package com.sujung.flowerQR.board.service;

import com.sujung.flowerQR.board.entity.Board;
import com.sujung.flowerQR.board.repository.BoardRepository;
import com.sujung.flowerQR.exception.BusinessLogicException;
import com.sujung.flowerQR.exception.ExceptionCode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    //글 작성
    public Board createBoard(Board board){
       return boardRepository.save(board);
    }

    //글 수정
    public Board alterBoard(Board board){
        Board updateBoard;
        if(verifyBoardPassword(board)){
            updateBoard = Board.builder()
                    .content(board.getContent())
                    .build();
        }
        else
            return null;

        return boardRepository.save(updateBoard);
    }

    //글 찾기
    public Board findBoardById(Long boardId){
        return boardRepository.findById(boardId)
                .orElseThrow(() -> new BusinessLogicException(ExceptionCode.BOARD_NOT_FOUND));
    }

    //글 전체 출력
    public Page<Board> findBoards(int page,int size){
        return boardRepository.findAll(
                PageRequest.of(page,size, Sort.by("boardId").descending()));
    }

    //익명 패스워드 검사
    private boolean verifyBoardPassword(Board board){
       Board orBoard = findBoardById(board.getBoardId());
       return orBoard.getContent_pw() == board.getContent_pw();
    }
}
