import java.util.ArrayList;
//Öðretim Görevlileri için Lecturers classý

public class Lecturers {
	ArrayList<Courses> ders_sayisi= new ArrayList<Courses>(); //
	private int id; // öðretim göevlilerinin id sini tutmak için deðiþken
	private String name_surname; // öðretim göevlilerinin adý soyadý için deðiþken tanýmý
	
	
	public Lecturers(int id, String name_surname) {
	
		this.id = id;
		this.name_surname = name_surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_surname() {
		return name_surname;
	}

	public void setName_surname(String name_surname) {
		this.name_surname = name_surname;
	}

	
	
	
}
