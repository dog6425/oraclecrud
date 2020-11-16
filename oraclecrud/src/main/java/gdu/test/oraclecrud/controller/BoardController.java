package gdu.test.oraclecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import gdu.test.oraclecrud.service.BoardService;
import gdu.test.oraclecrud.vo.BoardVo;

@Controller
public class BoardController {
	@Autowired BoardService boardService;
	@GetMapping("/boardList")
	public String boardList(Model model) {
		List<BoardVo> boardList = boardService.getboardList();
		
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
	// 게시글 목록
	
	// 상세보기
	@GetMapping("/boardOne/{boardId}")
	// jsp에서 값을 가져올 때 @PathVariable을 사용할 떄 {} 으로 사용해서 값을 가져옴
	public String boardList(Model model,
					@PathVariable(name="boardId", required=true) int boardId) {
					// Request기능을 사용
		BoardVo BoardOne = boardService.getBoardListByPage(boardId);
		System.out.print(BoardOne);
		model.addAttribute("BoardOne",BoardOne);
		return "BoardOne";
		
	}
	// 게시글 등록
		@GetMapping("/addBoard/{boardinsert}")
		public String insertBoard(Model model,
					@PathVariable(name="boardinsert", required=true) int boardinsert) {
		BoardVo addBoard = boardService.getinsertBoard(boardinsert);
		System.out.print(addBoard);
		model.addAttribute("addBoard", addBoard);
		return "addBoard";
			
		}
	
	// 게시글 수정
		@GetMapping("/modifyBoard/{boardupdate}")
		public String modifyBoard(Model model,
					@PathVariable(name="boardupdate", required=true) int boardupdate) {
			BoardVo modifyBoard = boardService.getupdateBoard(boardupdate);
			System.out.print(modifyBoard);
			model.addAttribute("modifyBoard", modifyBoard);
		return "modifyBoard";
			
		}
	// 게시글 삭제
		@GetMapping("/eraseBoard/{boarddelete}")
		public String eraseBoard(Model model,
					@PathVariable(name="boarddelete", required=true) int boarddelete) {
			BoardVo eraseBoard = boardService.getupdateBoard(boarddelete);
			System.out.print(eraseBoard);
			model.addAttribute("eraseBoard", eraseBoard);
		return "eraseBoard";		
		}
}
	
	
	
	


	
	
