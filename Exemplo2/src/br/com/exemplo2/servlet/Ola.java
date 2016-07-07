package br.com.exemplo2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ola
 */
@WebServlet("/ola")
public class Ola extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ola() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//resposta a chamada do servlet
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		//isso nao se faz hj em dia mais
		//writer.println("eeeeeeeeeeeeeeee soooooonnnnnnnnoooooooo");
		writer.println("<html>");
		writer.println("<head></head>");
		writer.println("<body>");
		writer.println("<head>EEEEEEEEEEEEEEEE SSOOOOOOOOOOONNNNNNNNNOOOOOOOOOOOOOOOOOO</head>");
		writer.println("</body>");
		writer.println("</html>");
		
		
		writer.close();
		

	}

}
