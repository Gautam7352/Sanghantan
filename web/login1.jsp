<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%
    
    if (request.getParameter ("submit") !=null)
    {
       try
       {
   String username= request.getParameter ("username");
String Pass= request.getParameter ("Pass"); 



Connection con;
PreparedStatement pst;
ResultSet rs;
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");
pst=con.prepareStatement("select * from login where username=? and Pass=?");
pst.setString (1, username);
pst.setString (2, Pass);
 rs = pst.executeQuery();
            
            if(rs.next())
            {
                response.sendRedirect("Register.jsp");
                
            }
            else
            {
                 response.sendRedirect("login.jsp?msg=Invalid user or pass");
            }
            con.close();
       }   
        catch(Exception e)
        {
            out.println(e.toString());
        }
       finally
       {
           

    }

    }


%>