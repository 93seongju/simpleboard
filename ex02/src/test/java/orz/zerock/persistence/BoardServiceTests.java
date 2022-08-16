package orz.zerock.persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import orz.zerock.controller.Criteria;
import orz.zerock.domain.BoardVO;
import orz.zerock.mapper.BoardMapper;
import orz.zerock.service.BoardService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	@Test
	public void testExist() {
		
		log.info(service);
		assertNotNull(service);
	}
	
	
	@Test
	public void testRegister() {
		BoardVO board =new BoardVO();
		board.setTitle("새로작성하는글");
		board.setContent("새로 작성하는 내용");
		board.setWriter("newbie");
		
		service.register(board);
		
		log.info("생성되는 게시물 번호 : " + board.getBno());
	}
	
	@Test
	public void testGet() {
		log.info(service.get(1L));
		
	}
	
	@Test
	public void testDelete() {
		
		// 게시물의 번호존재여부를 확인하고 테스트할것
		log.info("REMOVE RESULT : " + service.remove(2L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = service.get(1L);
		
		if(board ==null) {
			return;
		}
		board.setTitle("수정한 제목");
		log.info("MODIFY RESULT : " + service.modfiy(board));
	}
	
	@Test 
	public void testGetList() {
		
		// service.getList().forEach(board -> log.info(board));
		service.getList(new Criteria(2,10)).forEach(board -> log.info(board));
		
	}
}
