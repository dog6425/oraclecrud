package gdu.test.oraclecrud.vo;

public class BoardVo {
	private int boardId;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private String boardupdate;
	private String boarddelete;
	private String boardinsert;
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardupdate() {
		return boardupdate;
	}
	public void setBoardupdate(String boardupdate) {
		this.boardupdate = boardupdate;
	}
	public String getBoarddelete() {
		return boarddelete;
	}
	public void setBoarddelete(String boarddelete) {
		this.boarddelete = boarddelete;
	}
	public String getBoardinsert() {
		return boardinsert;
	}
	public void setBoardinsert(String boardinsert) {
		this.boardinsert = boardinsert;
	}
	@Override
	public String toString() {
		return "BoardVo [boardId=" + boardId + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriter=" + boardWriter + ", boardupdate=" + boardupdate + ", boarddelete=" + boarddelete
				+ ", boardinsert=" + boardinsert + "]";
	}

	
	
	
}