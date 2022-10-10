
package Servelts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Models.AccountService;

/**
 *
 * @author Lynden Kidd
 */
public class HomeServet extends HttpServlet {

 
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        
         String login1 = request.getParameter("username");
        String login2 = request.getParameter("username");
        String password = request.getParameter("password");
     
        
     if(login1 == login1 || password == password) {
                request.setAttribute("login1", "abe");
                request.setAttribute("hello", true);
              getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response);
    
            }
     else if(login2 == login2 || password == password) {
                request.setAttribute("login1", "barb");
                request.setAttribute("hello2", true);
              getServletContext().getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request,response);
    
            }
     
    }

}
