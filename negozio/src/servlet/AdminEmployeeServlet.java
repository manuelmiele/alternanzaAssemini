package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebService

public class AdminEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String sessionUsername;  
	int sessionRole;

    public AdminEmployeeServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        HttpSession session = request.getSession();
	        sessionUsername=(String)session.getAttribute("username");
	        out.println("contenuto di sessionUsername: ( "+sessionUsername+" )");
	        sessionRole=(int)session.getAttribute("role");
	        out.println("contenuto di sessionRole: ( "+sessionRole+" )");
	        switch(sessionRole) {
	        case 0:
	        	RequestDispatcher ra = request.getRequestDispatcher("EditAmministratore.jsp");
	        	ra.forward(request, response);
	        break;
	        case 1:
	        	RequestDispatcher rm = request.getRequestDispatcher("EditMedico.jsp");
	        	rm.forward(request, response);
	        break;
	        case 2:
	        	RequestDispatcher rd = request.getRequestDispatcher("ProfiloDipendente.jsp");
	        	rd.forward(request, response);
	        break;	
	        }
	}
}
