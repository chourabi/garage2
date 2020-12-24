package entitys;

public class Model {
	int id;
	Mark mark;
	String label;
	public Model() {
		super();
	}
	
	

	public Mark getMark() {
		return mark;
	}



	public void setMark(Mark mark) {
		this.mark = mark;
	}



	public Model(int id, Mark mark, String label) {
		super();
		this.id = id;
		this.mark = mark;
		this.label = label;
	}



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
	
}
