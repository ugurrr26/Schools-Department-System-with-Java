import java.util.ArrayList;
//��retim G�revlileri i�in Lecturers class�

public class Lecturers {
	ArrayList<Courses> ders_sayisi= new ArrayList<Courses>(); //
	private int id; // ��retim g�evlilerinin id sini tutmak i�in de�i�ken
	private String name_surname; // ��retim g�evlilerinin ad� soyad� i�in de�i�ken tan�m�
	
	
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
