package orz.zerock.mapper;

import java.util.List;

import orz.zerock.domain.BoardVO;
import orz.zerock.domain.Criteria;


public interface BoardMapper {

	
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	public int getTotalCount(Criteria cri);
	
}

