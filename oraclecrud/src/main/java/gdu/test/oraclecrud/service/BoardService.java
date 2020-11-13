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
	
	public List<BoardVo> getBoardList() {
		return boardMapper.selectBoardListAll();
	}
	public BoardVo getBoardListByPage(int boardId){
		return boardMapper.selectBoardListByPage(boardId);
	}
	
}
