<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 고객 목록 </title>
</head>
<body>

</body>

<table>
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
 
 <tbody>
	  <c:forEach items="${list}" var="list">
	 <tr>
	  <td>${list.cli_num}</td>
	  <td>${list.cli_id}</td>
	  <td>${list.name}</td>
	  <td>${list.gender}</td>
	  <td>${list.phone_num}</td>
	  <td>${list.reg_date}</td>
	 </tr>
	</c:forEach>
 </tbody>
</table>
</html>