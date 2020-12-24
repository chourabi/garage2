package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CarsManager;

/**
 * Servlet implementation class AddCarsServlet
 */
@WebServlet("/AddCarsServlet")
public class AddCarsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCarsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/add.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idmodel = Integer.parseInt(request.getParameter("modelid")) ;
		int ph = Integer.parseInt(request.getParameter("ph")) ;
		
		String color = request.getParameter("color") ;
		
		CarsManager c = new CarsManager();
		
		c.addNewCar(idmodel, color, ph);
		
		 c.updateCarsList();
		
		request.setAttribute("cars", c.getCars());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/cars.jsp").forward(request, response);
		
		
	}

}
