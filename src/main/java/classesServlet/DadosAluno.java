package classesServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DadosAluno
 */
@WebServlet("/DadosAluno")
public class DadosAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DadosAluno() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</body>");
        out.println("<meta charset=\"ISO-8859-1\">");
        out.println("<title>Insert title here</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> EXERCICIO 1 </h1>");
        
		int codigo1 = Integer.parseInt(request.getParameter("codigo"));
		
		switch (codigo1) {
		case 1: {
			out.println("<h1> CODIGO: " + codigo1 + " || Categoria: Informática </h1>");
			break;

		}
		case 2:{
			out.println("<h1> CODIGO: " + codigo1 + " || Categoria: Celulares </h1>");
			break;

		}
		
		case 3: {
			out.println("<h1> CODIGO: " + codigo1 + " || Categoria: Eletrodomésticos </h1>");
			break;

		}
		
		case 4: {
			out.println("<h1> CODIGO: " + codigo1 + " || Categoria: Moda </h1>");
			break;

		}
		default:
			out.println("<h1> Categoria Inexistente</h1> ");
			break;
		}
		
		out.println("<br>");
		out.println("</body>");
        out.println("</html>");
        out.close();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
