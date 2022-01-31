package Servletsample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userResistration
 */
@WebServlet("/userRegistration")
public class userRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String msg = "";
		
		//get request parameter
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		String start_time = request.getParameter("start_time");
		
		//check parameter
		if(name == null || name.length() == 0) {
			msg = "Please enter youe name.<br/>";
		}
		if(gender == null || gender.length() == 0){
			msg += "Please check your gender.";
		}
		if(password == null || password.length() == 0){
			msg += "Please check your password.";
		} else{
			//make Pattern
			Pattern pattern = Pattern.compile("^\\w{4}$");
			//Comparison
			if(!pattern.matcher(password).matches()) {
				msg += "Please make your Password from 4 alphanumeric characters.";
			}
		}
		
		//make scceed text
		if(msg == "") {
			//check gender
			if(gender.equals("0")){gender = "male";};
			if(gender.equals("1")){gender = "female";};
			
			msg = "We finish the registration of " + name + "(" + gender + ").";
			
			System.out.println("The password is " + password + ".");
		}
		
		//make html
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>user resistration</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body>");
		out.println("</html>");
		
		//get taken time
		long end_time = System.currentTimeMillis();
		long time = end_time - Long.parseLong(start_time);
		System.out.println("The time required is " + time + " millisecond.");
	}

}
