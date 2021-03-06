package gdu.test.oraclecrud.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gdu.test.oraclecrud.mapper.BoardMapper;
import gdu.test.oraclecrud.vo.BoardVo;

@Service
@Transactional
public class BoardService {
	@Autowired private BoardMapper boardMapper;
	
	//
	public List<BoardVo> getboardList() {
		return boardMapper.selectBoardListAll();
		
	}
	//
	public BoardVo getBoardListByPage(int boardId){
		return boardMapper.selectBoardListByPage(boardId);
	}
	
	//게시글 작성
	public BoardVo getinsertBoard(int boardinsert) {
		return boardMapper.insertBoard(boardinsert);
	
	//게시글 수정
	}
	public BoardVo getupdateBoard(int boardupdate){
		return boardMapper.updateBoard(boardupdate);
	}
	
	//게시글 삭제
	public BoardVo getdeleteBoard(int boarddelete) {
		return boardMapper.deleteBoard(boarddelete);
	}
	
}
