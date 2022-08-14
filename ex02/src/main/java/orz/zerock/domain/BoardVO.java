package orz.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
 private Long bno; //게시글 번호
 private String title; //제목
 private String content; //내용
 private String writer; //글쓴이
 private Date regdate; //등록일
 private Date updateDate; //수정일 
}
