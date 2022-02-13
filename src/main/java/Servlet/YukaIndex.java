package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SiteEV;
import model.SiteEVLogic;

/**
 * Servlet implementation class YukaIndex
 */
@WebServlet("/YukaIndex")
public class YukaIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YukaIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext application = this.getServletContext();
		SiteEV siteEV = (SiteEV)application.getAttribute("siteEV");
		
		//first access
		if(siteEV == null) {
			siteEV = new SiteEV();
		}
		
		//click like or dislike
		String action = request.getParameter("action");
		SiteEVLogic selogic = new SiteEVLogic();
		if((action != null) && (action.equals("like"))) {
			selogic.addLike(siteEV);
		} else if ((action != null) && (action.equals("dislike"))) {
			selogic.addDislike(siteEV);
		}
		
		//set ev to application scope
		application.setAttribute("siteEV", siteEV);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/yukaIndex.jsp");
		rd.forward(request, response);
		
	}
}
