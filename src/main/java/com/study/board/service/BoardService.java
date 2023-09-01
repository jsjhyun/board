package com.study.board.service;

import com.study.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public interface BoardService {

   void write(Board board, MultipartFile file) throws Exception;

   Page<Board> boardList(Pageable pageable);

   Page<Board> boardSearchList(String searchKeyword, Pageable pageable);

   Board boardView(Integer id);


}