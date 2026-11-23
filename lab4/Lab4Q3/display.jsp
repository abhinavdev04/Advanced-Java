<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Records</title>
</head>
<body>

    <h2>Student Records</h2>

    <table border="1" cellpadding="10">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Roll</th>
            <th>Address</th>
            <th>Email</th>
        </tr>

        <%
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/studentdb", "root", "root");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while(rs.next()) {
        %>

        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("name") %></td>
            <td><%= rs.getString("roll") %></td>
            <td><%= rs.getString("address") %></td>
            <td><%= rs.getString("email") %></td>
        </tr>

        <%
            }
            con.close();
        %>

    </table>

    <br>
    <a href="index.jsp">Add New Student</a>

</body>
</html>