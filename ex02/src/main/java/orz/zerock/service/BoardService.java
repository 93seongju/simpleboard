package orz.zerock.service;

import orz.zerock.domain.BoardVO;

public interface BoardService {

	
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
}
