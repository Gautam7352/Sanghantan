<%-- 
    Document   : BA1
    Created on : 30 Mar, 2022, 9:20:27 PM
    Author     : ADITI SINHA
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Teamview</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="teamview (2).css"  />
</head>
<body>
    <h4> <a href="index.html" target="blank" class="btn1">LOG OUT</a></h4>
    
    <h4> <a href="category.jsp" target="blank" class="btn1">BACK</a></h4>
<div class='container'>
<table class="styled-table">
<caption>Cricket</caption>
    <thead>
        <tr>
            <th>Enrollment</th>
			<th>Name</th>
            <th>Position</th>
			
        </tr>
    </thead>
    <tbody>
        <tr>
            <td></td>
			<td></td>
			<td></td>
        </tr>
       <%
    
    Connection con;
PreparedStatement pst;
ResultSet rs;
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String query="select * from Sang where Event='Cricket' and Stream='BA' and Sex='Female' order by Enrollment";
  Statement st=con.createStatement();
  rs=st.executeQuery(query);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      %>
      
  
    
<tr>
    <td><%=rs.getString("Enrollment") %></td>
    <td><%=rs.getString("Name") %></td>
<td><%=rs.getString("Position") %></td>

</tr>

<%
    
    
    }

%>

        
    </tbody>
</table>

<table class="styled-table">
<caption>Football</caption>
    <thead>
		 <tr>
            <th>S.no</th>
			<th>Name</th>
            <th>Position</th>
			
        </tr>
    </thead>
    <tbody>
        <tr>
            <td></td>
			<td></td>
			<td></td>
        </tr>
         <%
   
    Connection on;
PreparedStatement t;
ResultSet s;
Class.forName("oracle.jdbc.driver.OracleDriver");
on = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String sql="select * from Sang where Event='Football' and Stream='BA' and Sex='Female' order by Enrollment";
 Statement stt=con.createStatement();
  rs=st.executeQuery(sql);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      %>
      
  
    
<tr>
    <td><%=rs.getString("Enrollment") %></td>
    <td><%=rs.getString("Name") %></td>
<td><%=rs.getString("Position") %></td>
<%
    
    
    }

%>


    </tbody>
</table>

<table class="styled-table">
<caption>Volleyball</caption>
    <thead>
	     <tr>
            <th>Enrollment</th>
			<th>Name</th>
            <th>Position</th>
			
        </tr>
    </thead>
    <tbody>
        <tr>
            <td></td>
			<td></td>
			<td></td>
        </tr>
        <%
   
    Connection c;
PreparedStatement p;
ResultSet r;
Class.forName("oracle.jdbc.driver.OracleDriver");
c = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String sq="select * from Sang where Event='VolleyBall' and Stream='BA' and Sex='Female' order by Enrollment";
 Statement y=c.createStatement();
  rs=st.executeQuery(sq);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      %>
      
  
    
<tr>
    <td><%=rs.getString("Enrollment") %></td>
    <td><%=rs.getString("Name") %></td>
<td><%=rs.getString("Position") %></td>
<%
    
    
    }

%>

    </tbody>
</table>
</div>
<div class='container2'>
<table class="styled-table">
<caption>Kabbadi</caption>
    <thead>
        <tr>
            <th>Enrollment</th>
			<th>Name</th>
            <th>Position</th>
			
        </tr>
    </thead>
    <tbody>
        <tr>
            <td></td>
			<td></td>
			<td></td>
        </tr>
       <%
   
    Connection cn;
PreparedStatement q;
ResultSet o;
Class.forName("oracle.jdbc.driver.OracleDriver");
cn = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String ql="select * from Sang where Event='Kabaddi' and Stream='BA' and Sex='Female' order by Enrollment";
 Statement yu=cn.createStatement();
  rs=st.executeQuery(ql);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      %>
      
  
    
<tr>
    <td><%=rs.getString("Enrollment") %></td>
    <td><%=rs.getString("Name") %></td>
<td><%=rs.getString("Position") %></td>
<%
    
    
    }

%>

    </tbody>
</table>

<table class="styled-table">
<caption>Individual Event</caption>
    <thead>
        <tr>
            <th>S.no</th>
			<th>Name</th>
            <th>Event Name</th>
			
        </tr>
    </thead>
    <tbody>
        <tr>
            <td></td>
			<td></td>
			<td></td>
                       
        </tr>
        <%
   
    Connection co;
PreparedStatement a;
ResultSet re;
Class.forName("oracle.jdbc.driver.OracleDriver");
co = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String l="select * from Sang where Event IN('Chess','TableTennis','Carrom','Badminton')  and Stream='BA' and Sex='Female' order by Enrollment";
 Statement yun=co.createStatement();
  rs=st.executeQuery(l);
  
  
  while(rs.next())
  {
      String Enrollment=rs.getString("Enrollment");
 
      
      %>
      
  
    
<tr>
    <td><%=rs.getString("Enrollment") %></td>
    <td><%=rs.getString("Name") %></td>
<td><%=rs.getString("Event") %></td>
<%
    
    
    }

%>

		
    </tbody>
</table>
</div>
</body>
</html>