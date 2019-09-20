<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>

<html>
<head>
    <title>Create Location</title>
</head>
<body>
   <form action="updateStudent" method="post">
   <pre>
   Id: <input type="text" name="id" value="${student.id}" readonly/>
   Name: <input type="text" name="name" value="${student.name}"/>
   Email: <input type="text" name="email" value="${student.email}"/>
         <br/>
   <input type="submit" value="save"/>
   </pre>
   </form>

</body>
</html>