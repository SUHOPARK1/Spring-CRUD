<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<head>
<script src="/demo/resources/list.js"></script>
<meta charset="UTF-8">
<title> 고객 목록 </title>
</head>
<body>
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
</body>
</html>







