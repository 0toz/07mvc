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
            <tr><td>이름 </td><td>$"name"</td> </tr>
            <tr><td>avg </td><td><input type="number" name="kor" required></td> </tr>
            <tr><td>sum </td><td><input type="number" name="eng" required></td> </tr>
            <tr><td>hak </td><td><input type="number" name="math" required></td> </tr>
         </tbody>
         <tfoot>
            <tr><td colspan="2"><input type="submit" value="성적확인"></td></tr>
         </tfoot>
      </table>

</div>



</body>
</html>