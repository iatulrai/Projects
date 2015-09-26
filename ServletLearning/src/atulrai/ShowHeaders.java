package atulrai;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowHeaders
 */
@WebServlet("/ShowHeaders")
public class ShowHeaders extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("HTTP headers sent by your client:<br>");

		Enumeration<String> show = request.getHeaderNames();
		while (show.hasMoreElements()) {
			String headerName = (String) show.nextElement();
			String headerValue = request.getHeader(headerName);
			out.print("<b>" + headerName + "</b>: ");
			out.println(headerValue + "<br>");
		}

	}
}