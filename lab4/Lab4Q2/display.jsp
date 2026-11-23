<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<body>

    <h2>Student Details</h2>

    <%
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
    %>

    Name: <%= name %><br><br>
    Roll: <%= roll %><br><br>
    Address: <%= address %><br><br>
    Email: <%= email %>

</body>
</html>