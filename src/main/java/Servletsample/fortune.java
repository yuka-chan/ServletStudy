package Servletsample;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fortune
 */
@WebServlet("/fortune")
public class fortune extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fortune() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//fortune results list
		String[] results = {"super lucky","lucky","so so" ,"bad","so bad"};
		
		//do fortune
		int index = (int)Math.random() * (results.length);	
		String result = results[index];
		
		//Date
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String today = sdf.format(date);
		
		//make response
		response.setContentType("text/html; chrset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<head>");
		out.println("<title>fortune telling</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Your fortune on " + today + " is " + result);
		out.println("</body>");
		out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	*/
}
