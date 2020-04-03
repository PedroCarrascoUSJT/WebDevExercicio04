package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fluminense
 */
@WebServlet("/fluminense.do")
public class Fluminense extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fluminense() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("ERRO 404");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qReq = request.getParameter("req");
		String qSes = request.getParameter("ses");
		String qApp = request.getParameter("app");
		
		request.setAttribute("flu1", qReq);
		request.getSession().setAttribute("flu2", qSes);
		getServletContext().setAttribute("flu3", qApp);
		
		RequestDispatcher view = request.getRequestDispatcher("listaAtributos.jsp");
		view.forward(request, response);
	}

}
