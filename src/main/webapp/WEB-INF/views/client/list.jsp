<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<head>
<script src="/demo/resources/list.js"></script>
<meta charset="UTF-8">

</head>
<body>
<h2>고객 목록 </h2>
<table id="client-list">
 <thead>
  <tr>
   <th>고객번호&nbsp;</th>
   <th>고객아이디&nbsp;</th>
   <th>고객이름&nbsp;</th>
   <th>성별&nbsp;</th>
   <th>연락처&nbsp;</th>
   <th>생년월일</th>
  </tr>
 </thead>

</table>
<script>
	client.list()
</script>
  <tfoot>
    <tr>
      <th></th>
      <td>
        <button class="btn btn-danger" id="update-btn">고객데이터 수정</button>
        
        <button class="btn btn-danger" id="delete-btn">고객데이터 삭제</button>
      </td>
    </tr>
  </tfoot>


 <p>
<input type="button" value="홈으로" onclick="history.back(-1)">
</p>
<script>
$('#delete-btn').click(function(e){
	e.preventDefault()
    $.ajax({
		url:'/demo/client/delete',
		type:'DELETE',
		data:JSON.stringify({
			cliNum:localStorage.getItem('#cliNum')
		}),
		dataType:'json',
		contentType:'application/json',
		success:
			function(d){
			if(d.message === "SUCCESS"){
				alert("고객정보를 성공적으로 삭제하셨습니다.")
			}else{
				alert("고객정보 삭제를 실패하셨습니다.")
			}
		},
		error:function(e){
			alert("다시 입력해주세요.")
			}
    	})
    })
</script>
</body>
</html>










