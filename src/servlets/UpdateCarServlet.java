package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entitys.Car;
import metier.CarsManager;

/**
 * Servlet implementation class UpdateCarServlet
 */
@WebServlet("/UpdateCarServlet")
public class UpdateCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		
		CarsManager c = new CarsManager();
		
		Car car = new Car();
		
		car = c.getCarById(id);
		
		request.setAttribute("car", car);
		request.setAttribute("idc", id);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/update.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idc"));
		int idmodel = Integer.parseInt(request.getParameter("modelid")) ;
		int ph = Integer.parseInt(request.getParameter("ph")) ;
		
		String color = request.getParameter("color") ;
		
		CarsManager c = new CarsManager();
		
		c.updateCarById(id,ph,color,idmodel);
		
		 c.updateCarsList();
		
		request.setAttribute("cars", c.getCars());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/cars.jsp").forward(request, response);
		
		
	}

}
