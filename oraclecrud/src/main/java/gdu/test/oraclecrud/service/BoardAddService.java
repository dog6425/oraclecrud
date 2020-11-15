package gdu.test.oraclecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gdu.test.oraclecrud.mapper.BoardMapper;
import gdu.test.oraclecrud.vo.BoardVo;


@Service
@Transactional
public class BoardAddService {
	@Autowired private BoardMapper boardMapper;
	
	public int addBoard(Addboard addboard) {
		return AddMapper.insertAddMapper(AddBoard);
	}

	public List<BoardVo> getaddBoard() {
		return null;
	}
}
