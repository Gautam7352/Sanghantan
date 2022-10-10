<%@page import="javax.swing.text.Position"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<%
    
    if (request.getParameter ("submit") !=null)
    {
        String Name=request.getParameter("Name");
   String Enrollment= request.getParameter ("Enrollment");
String Sex= request.getParameter ("Sex"); 
String Event= request.getParameter ("Event");
String Stream=request.getParameter("Stream");
String Position=request.getParameter("Position");
String Year=request.getParameter("Year");


Connection con;
PreparedStatement pst;
ResultSet rs;
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");
pst=con.prepareStatement("insert into Sang values(?,?,?,?,?,?,?)");
pst.setString(1,Name);
pst.setString (2, Enrollment);
pst.setString (3,Sex );
pst.setString (4,Event);
pst.setString(5,Stream);
pst.setString(6,Position);
pst.setString(7,Year);

pst.executeUpdate();
response.sendRedirect("Register.jsp");

%>

<script>
    
    alert("Record Added");
    
    </script>
    
    
    
    
    <%

    }


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        <link href="bootstrap-5.1.3-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <body background="1.jpg">
        
        <h1><center>Player Registration Form</center></h1>
        
        <div class="row">
            <div class="col-sm-5">
                <form style="justify-content: center" class="" method="POST" action="#">
                    <div alight="left">
            <label class="form-label">Enrollment</label>
<input type="text" class="form-control" placeholder="Enrollment" name="Enrollment" id="Enrollment" required > 
                    </div>
                    <div align="left">
                      <label class="form-label">Student Name</label>
                     <input type="text" class="form-control" placeholder=" Student Name" name="Name" id="Name" required >
                      </div>
                          
                       <div alight="left">
            <label class="form-label">Stream</label>
<input type="text" class="form-control" placeholder="Stream" name="Stream" id="Stream" required > 

                      </div>
    
                    <div alight="left">

<label class="form-label">Position</label>
<input type="text" class="form-control" placeholder="Position" name="Position" id="Position" required >

 </div>
    
                    <div alight="left">

<label class="form-label">Event</label>
<input type="text" class="form-control" placeholder="Event" name="Event" id="Event" required >
               </div>
    
                    <div alight="left">

<label class="form-label">Sex</label>
<input type="text" class="form-control" placeholder="Sex" name="Sex" id="Sex" required >
                    </div>
    
                    <div alight="left">

<label class="form-label">Year</label>
<input type="numer" class="form-control" placeholder="Year" name="Year" id="Year" required >
            
    <div alight="center">
         </br>
<input type="submit" id="submit" value="Submit" name="submit" class="btn btn-info">
        <input type="reset" id="reset" value="Reset" name="reset" class="btn btn-warning">
        
    </div>
                </form>                                      
            </div>
                    <h4>To view Registered Student List <a href="category.jsp" target="blank" class="btn1">Click Here</a></h4>
                </body>
    </html>
