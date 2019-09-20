<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<html>
<head>
<title>Display Students</title>
</head>
<body>

<h2>Students</h2>
<table>
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
</tr>

<c:forEach items="${students}" var="student">
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.email}</td>
<td><a href="deleteStudent?id=${student.id}">delete</a>
<td><a href="showUpdate?id=${student.id}">edit</a>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add Record</a>
</body>
</html>