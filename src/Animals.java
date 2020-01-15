

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Animals
 */
@WebServlet("/Animals")
public class Animals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Animals() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		/* Create the start of the output */
		out.append("<body>");
		out.append("<h3>Animals are cute!</h3>");
		out.append("<form action=\"Animals\" method=\"post\">");
		
		/* Add radio buttons for all handled animals */
		out.append("<input type=\"radio\" name=\"animal\" value=\"cat\"> Cat");
		out.append("<input type=\"radio\" name=\"animal\" value=\"koala\"> Koala");
		out.append("<input type=\"radio\" name=\"animal\" value=\"dog\"> Dog");
		out.append("<input type=\"radio\" name=\"animal\" value=\"giraffe\"> Giraffe");
		
		/* Create the end of the output */
		out.append("<br>");
		out.append("<input type=\"submit\" value=\"Get a picture of your chosen animal!\">");
		out.append("</form></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String animal = request.getParameter("animal");
		String img = animal + ".jpg";
		
		response.setContentType("text/html");
		
		out.print("<html><body>");
		out.print("<h3>Picture of a " + animal + "</h3>");
		
		out.print("<img src=\"" + img + "\">");
		out.print("</body></html>");
	}

}
