package servlet;

import com.pega.tutorial.Credential;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/signup")
public class Signup extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException
    {
        String fname = request.getParameter("fname");
        String sname = request.getParameter("sname");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");

//        Credential credential = new Credential(name, password);

//        try {
//            Class.forName("org.postgresql.Driver");
//            Connection connection = null;
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://10.20.92.42:3306/FollowTheGenre", "username", "password");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        

    }

}
