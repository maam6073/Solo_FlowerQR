package com.sujung.flowerQR.board.dto;

import lombok.*;
import org.springframework.data.domain.Page;

import java.util.List;



public class BoardResponseDto {

    //글 상세내용 Response
    @NoArgsConstructor
    @Getter @Setter
    public static class ContentResponse{
        //제목
        private String title;

        //내용
        private String content;

        //게시글 비번
        private int content_pw;

        //댓글
        private String comment;

        //조회수
        private int view_count;
    }


    //글 목록 전체 Response
    //@Builder
    public static class SimpleContentsResponse<E, T>{

        private E info;
        private List<T> data;
        //private Page pageInfo;

        public SimpleContentsResponse(List<T> data, Page page){
            //data =
        }
                                      //닉네임
        private String nickname;

        //제목
        private String title;

        //조회수
        private int view_count;

        //댓글수
        private int commentCnt;
    }



    //수정후 게시글 Response

    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter @Setter
    public static class PatchResponse {
        //닉네임
        private String nickname;

        //제목
        private String title;

        //변경 내용
        private String content;

        //상태 메세지
        private String message;
    }
}
