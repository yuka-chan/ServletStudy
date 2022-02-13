package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserConfirmLogic;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fowardPath = "";
		
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		
		if(action == null) {
			//top page
			fowardPath = "WEB-INF/jsp/registerForm.jsp";
		} else if(action.equals("done")){
			//get infomation from session scope
			HttpSession session = request.getSession();
			User user = (User)session.getAttribute("user");
			
			//register
			UserConfirmLogic confirm = new UserConfirmLogic();
			confirm.execute(user);
			
			//remove session
			session.removeAttribute("user");
			
			//result page
			fowardPath = "WEB-INF/jsp/registerResult.jsp";
		}
		
		if(fowardPath != null) {
			RequestDispatcher rd = request.getRequestDispatcher(fowardPath);
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get infomation from request parameters
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		//set information to session scope
		User user = new User(id, password, name);
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		//foward
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/registerConfirm.jsp");
		rd.forward(request, response);
	}
}
