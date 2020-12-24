package entitys;

public class Car {
	int id;
	int nbrch;
	String color;
	Model model;
	String addDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNbrch() {
		return nbrch;
	}
	public void setNbrch(int nbrch) {
		this.nbrch = nbrch;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public String getAddDate() {
		return addDate;
	}
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}
	public Car(int id, int nbrch, String color, Model model, String addDate) {
		super();
		this.id = id;
		this.nbrch = nbrch;
		this.color = color;
		this.model = model;
		this.addDate = addDate;
	}
	public Car() {
		super();
	}
	
	
	
}
