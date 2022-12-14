<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<%@include file="../includes/header.jsp" %>
            
            
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Board Reader</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Board Read Page
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="form-group">
                            	<label>Bno</label>	
                            	<input class="form-control" name='bno' value='<c:out value="${board.bno}"/>' readonly="readonly">
                            </div>
                             
                             <div class="form-group">
                            	<label>Title</label>	
                            	<input class="form-control" name='title' value='<c:out value="${board.title}"/>' readonly="readonly">
                            </div>
                            
                            <div class="form-group">
                            	<label>Text area</label>	
                            	<textarea class="form-control" name='content' readonly="readonly"><c:out value="${board.content}" /></textarea>
                            </div>
                            
                            <div class="form-group">
                            	<label>Writer</label>	
                            	<input class="form-control" name='writer' value='<c:out value="${board.writer}"/>' readonly="readonly">
                            </div>
                            
                            <button data-oper='modify' class="btn btn-default" onclick="location.href='/board/modify?bno=<c:out value="${board.bno}"/>'">Modify</button>
                            <button data-oper='list' class="btn btn-info" onclick="location.href='/board/list?bno=<c:out value="${board.bno}"/>&pageNum=<c:out value="${cri.pageNum}"/>&amount=<c:out value="${cri.amount}"/>'">List</button>                                  
                            
                            <form id='operForm' action="/board/modify" moethod="get">
                            	<input type='hidden' id='bno' name='bno' value='<c:out value="${board.bno}"/>'>
                            	<input type='hidden' name='pageNum' value='<c:out value="${cri.pageNum}"/>'>
                            	<input type='hidden' name='amount' value='<c:out value="${cri.amount}"/>'>
                            </form>
                        </div>
                        <!-- end panel-body -->
                    </div>
                    <!-- end panel -->
                </div>
            </div>
            <!-- /.row -->
        
<%@include file="../includes/footer.jsp" %>
<script type="text/javascript">
$(document).ready(function(){
	var operForm = $("#operForm");
	
	$("button[data-oper='modify']").on(click),function(e){
		orerForm.find("#bno").remove();
		operForm.attr("action","/board/list")
		operForm.submit();
	}
});

</script>
    