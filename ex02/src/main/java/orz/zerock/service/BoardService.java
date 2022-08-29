package orz.zerock.service;

import java.util.List;

import orz.zerock.domain.BoardVO;
import orz.zerock.domain.Criteria;

public interface BoardService {

	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public boolean modfiy(BoardVO board);
	
	public boolean remove(Long bno);
	
	// public List<BoardVO> getList();
	
	public List<BoardVO> getList(Criteria cri);
	
	// 게시물의 전체갯수를 가져옴
	public int getTotal(Criteria cri);
}
