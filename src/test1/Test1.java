package test1;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testjava")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			Color1 cr1 = new Color1();
			cr1.setColor("赤黄青");

			request.setAttribute("cr1", cr1);

			ServletContext sc = getServletContext();

			sc.getRequestDispatcher("/WEB-INF/test1.jsp")
				.forward(request, response);
	}
}