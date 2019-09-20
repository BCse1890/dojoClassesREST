

<html>
<head>
    <title>Create Student</title>
</head>
<body>
   <form action="savestudent" method="post">
   <pre>
   Id: <input type="text" name="id"/>

   Name: <input type="text" name="name"/>
   Email: <input type="text" name="email"/>
         <br/>
   <input type="submit" value="save"/>
   </pre>
   </form>
   ${msg}

   <a href="displayLocations">View All</a>
</body>
</html>