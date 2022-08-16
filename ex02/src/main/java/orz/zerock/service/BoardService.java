package orz.zerock.service;

import java.util.List;

import orz.zerock.controller.Criteria;
import orz.zerock.domain.BoardVO;

public interface BoardService {

	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public boolean modfiy(BoardVO board);
	
	public boolean remove(Long bno);
	
	// public List<BoardVO> getList();
	
	public List<BoardVO> getList(Criteria cri);
}
