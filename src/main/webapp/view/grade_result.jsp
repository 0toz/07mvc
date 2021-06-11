<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    String name = request.getParameter("name");
    String kor = request.getParameter("kor");
    String eng = request.getParameter("eng");
    String math = request.getParameter("math");
    
    function avg(String kor, String eng, String math){
    	int avg=(int)((kor + eng + math)/3);
    	
    }
    function sum(String kor, String eng, String math){
    	int avg=(int)(kor + eng + math);
    	
    }
    function avg(){
    	int avg=(int)((kor + eng + math)/3);
    	
    }
    
    
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>성정공개</h1>
<div>
	<table>
         <tbody>
         <li> 이름: ${name } </li>
         <li> 국어: ${kor } </li>
         <li> 수학: ${math } </li>
         <li> 영어: ${eng } </li>
         <li> 총점: ${sum } </li>
         <li> 평균: ${avg } </li>
         <li> 학점: ${hak } </li>
         
         
          </tbody>
         </table>

</div>



</body>
</html>