package entitys;

public class Mark {
	int id;
	String label;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Mark(int id, String label) {
		super();
		this.id = id;
		this.label = label;
	}
	public Mark() {
		super();
	}
	
	
}
