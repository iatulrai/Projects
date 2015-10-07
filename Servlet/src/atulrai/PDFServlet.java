// write data into PDF using servlet

package atulrai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.darwinsys.spdf.MoveTo;
import com.darwinsys.spdf.PDF;
import com.darwinsys.spdf.Page;
import com.darwinsys.spdf.Text;

/**
 * Servlet implementation class PDFServlet
 */
@WebServlet("/PDFServlet")
public class PDFServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("application/pdf");
		PrintWriter out = response.getWriter();

		response.setHeader("Content-disposition",
				"inline; filename=AtulRai.pdf");

		PDF p = new PDF(out);
		Page p1 = new Page(p);

		p1.add(new MoveTo(p, 200, 700));
		p1.add(new Text(p, "Hello Atul Rai"));
		p1.add(new Text(p, "welcome"));

		p.add(p1);
		p.setAuthor("RaiAtul");

		p.writePDF();

	}

}
