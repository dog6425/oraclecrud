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
	public List<BoardVo> getBoardList() {
		return boardMapper.selectBoardListAll();
		
	}
	//
	public BoardVo getBoardListByPage(int boardId){
		return boardMapper.selectBoardListByPage(boardId);
	}
	
	//게시글 작성
	public BoardVo getinsertBoard(int boardId) {
		return boardMapper.insertBoard(boardId);
	
	//게시글 수정
	}
	public BoardVo getupdateBoard(int boardId) {
		return boardMapper.updateBoard(boardId);
	}
	
	//게시글 삭제
	public BoardVo getdeleteBoard(int boardId) {
		return boardMapper.deleteBoard(boardId);
	}
		
	
}
