package gdu.test.oraclecrud.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gdu.test.oraclecrud.mapper.BoardMapper;
import gdu.test.oraclecrud.vo.BoardAdd;
import gdu.test.oraclecrud.vo.BoardVo;

@Service
@Transactional
public class BoardService {
	@Autowired private BoardMapper boardMapper;
	
	
	public List<BoardVo> getBoardList() {
		return boardMapper.selectBoardListAll();
		
	//게시글 작성
	}
	public BoardVo getBoardListByPage(int boardId){
		return boardMapper.selectBoardListByPage(boardId);
	}
	
	//게시글 작성
	public int addBoard(BoardAdd boardAdd) {
		return boardMapper.insertBoardAdd(boardAdd);
	}
	
	// 게시글 수정
	public int updateBoard(BoardUpdate boardUpdate) {
		return boardMapper.updateBoard(boardUpdate);
	}
	
	//게시글 삭제
	public void deleteBoard(BoardDelete boardDelete) {
		return boardMapper.deleteBoard(boardDelete);
	}
	
	//게시글 조회
	public BoardVo selectBoardByCode(BoardVo boardVo) throws Exception;
}
