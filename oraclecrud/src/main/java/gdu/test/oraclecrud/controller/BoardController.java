package gdu.test.oraclecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import gdu.test.oraclecrud.service.BoardAddService;
import gdu.test.oraclecrud.service.BoardService;
import gdu.test.oraclecrud.vo.BoardAdd;
import gdu.test.oraclecrud.vo.BoardVo;

@Controller
public class BoardController {
	@Autowired BoardService boardService;
	
	// 1.게시글 목록
	@GetMapping("/boardList")
	public String boardList(Model model) {
		List<BoardVo> boardList = boardService.getBoardList();
		
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
	// 2.상세보기
	@GetMapping("/boardOne/{boardId}")
	// jsp에서 값을 가져올 때 @PathVariable을 사용할 떄 {} 으로 사용해서 값을 가져옴
	public String BoardList(Model model,
					@PathVariable(name="boardId", required=true) int boardId) {
					// Request기능을 사용
		BoardVo boardOne = boardService.getBoardListByPage(boardId);
		model.addAttribute("boardOne",boardOne);
		return "boardList";
		
	}
	// 게시글 등록
/*	@GetMapping("/addBoard")
	public String write(@ModelAttribute("BoardVo")BoardVo boardVo, Model model) throws Exception{
		BoardAddService.insertBoard(BoardVo);
*/
	@GetMapping("/addBoard")
	public String addBoard(Model model) {
		List<BoardVo> addBoard = BoardAddService.getaddBoard();
	}
	
}
	
	
	
	


	
	
