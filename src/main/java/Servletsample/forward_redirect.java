package Servletsample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class foward_redirect
 */
@WebServlet("/forward_redirect")
public class forward_redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forward_redirect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//foward
		//RequestDispatcher dp = request.getRequestDispatcher("/fortune.jsp");
		//dp.forward(request, response);
		
		//redirect
		response.sendRedirect("/ServletStudy/fortune.jsp");
		
	}

}
