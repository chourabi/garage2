package metier;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import entitys.Car;
import entitys.Mark;
import entitys.Model;

public class CarsManager {

	private ArrayList<Car> cars;
	
	private Bd con;
	
	public ArrayList<Car> getCars() {
		return cars;
	}


	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}


	public CarsManager(){
		cars = new ArrayList<Car>();
		con = new Bd();
		updateCarsList();
	}
	
	
	public void updateCarsList(){
		String query = "SELECT * FROM `car`,models,marks WHERE car.id_model=models.id_model_main AND models.id_m=marks.id_mark";
		
		
	this.cars.clear();
		
		try{
			Statement stmt = con.getConnection().createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				
				
				// generating mark
				Mark m = new Mark();
				m.setLabel(rs.getString("label_mark"));
				m.setId( rs.getInt("id_mark") );
				
				//generating model
				Model model = new Model();
				model.setMark(m);
				model.setId(rs.getInt("id_model_main"));
				model.setLabel(rs.getString("label_model"));
				
				// generating car
				Car c = new Car();
				c.setModel(model);
				c.setColor(rs.getString("color"));
				c.setAddDate(rs.getString("date_ajout"));
				c.setNbrch(rs.getInt("nbrch"));
				c.setId(rs.getInt("id"));
				
				this.cars.add(c);
				
				
			}
			
			
			
			
			
		}catch(SQLException e){
			System.out.println(e);
		}
		
	}
	
	
	public void addNewCar(int idmodel,String color,int ph){
		String q = "INSERT INTO `car`( `nbrch`, `color`, `id_model`) VALUES ("+ph+", '"+color+"',"+idmodel+" )";
		try{
			// create a Statement from the connection
			Statement statement = con.getConnection().createStatement();

			// insert the data
			statement.executeUpdate(q);                                             
			 
		}catch(SQLException e){
			System.out.println(e);
		}
	}
	
	
	public void deleteCar(int id){
		String q = "DELETE FROM `car` WHERE `id`="+id;
		try{
			// create a Statement from the connection
			Statement statement = con.getConnection().createStatement();

			// insert the data
			statement.executeUpdate(q);                                             
			 
		}catch(SQLException e){
			System.out.println(e);
		}	
	}
	
	public void updateCarById(int id,int nbrch,String color,int idmodel){
		
		String q = "UPDATE `car` SET `nbrch`="+nbrch+",`color`='"+color+"',`id_model`="+idmodel+" WHERE id="+id;
		try{
			// create a Statement from the connection
			Statement statement = con.getConnection().createStatement();

			// insert the data
			statement.executeUpdate(q);                                             
			 
		}catch(SQLException e){
			System.out.println(e);
		}

	}
	
	public Car getCarById(int id){
		String query = "SELECT * FROM `car`,models,marks WHERE car.id_model=models.id_model_main AND models.id_m=marks.id_mark AND car.id="+id;
		
			
			try{
				Statement stmt = con.getConnection().createStatement();
				
				ResultSet rs = stmt.executeQuery(query);
				
				while (rs.next()) {
					
					
					// generating mark
					Mark m = new Mark();
					m.setLabel(rs.getString("label_mark"));
					m.setId( rs.getInt("id_mark") );
					
					//generating model
					Model model = new Model();
					model.setMark(m);
					model.setId(rs.getInt("id_model_main"));
					model.setLabel(rs.getString("label_model"));
					
					// generating car
					Car c = new Car();
					c.setModel(model);
					c.setColor(rs.getString("color"));
					c.setAddDate(rs.getString("date_ajout"));
					c.setNbrch(rs.getInt("nbrch"));
					c.setId(rs.getInt("id"));
					
					return c;
					
					
				}
				
				
				
				
				
			}catch(SQLException e){
				System.out.println(e);
			}
			
			return null;
	}
	
	

}
