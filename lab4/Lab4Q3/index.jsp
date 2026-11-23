<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
</head>
<body>

    <h2>Student Registration Form</h2>

    <form action="StudentServlet" method="post">

        Name: <input type="text" name="name" required><br><br>

        Roll: <input type="text" name="roll" required><br><br>

        Address: <input type="text" name="address" required><br><br>

        Email: <input type="email" name="email" required><br><br>

        <input type="submit" value="Register">

    </form>

</body>
</html>