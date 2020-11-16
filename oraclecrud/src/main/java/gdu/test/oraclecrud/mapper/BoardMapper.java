package gdu.test.oraclecrud.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;

import gdu.test.oraclecrud.vo.BoardVo;

@Mapper
public interface BoardMapper {
	List<BoardVo> selectBoardListAll();
	
	BoardVo selectBoardListByPage(int boardId);
	
	BoardVo insertBoard(int boardinsert);
	
	BoardVo updateBoard(int boarddelete);
	
	BoardVo deleteBoard(int boardupdate);
	
	
	
}
