import java.util.ArrayList;
//dersler i�in courses s�n�f�
public class Courses {
	private String ders_kodu;
	private String ders_ad�;
	private int kredi;

	ArrayList<Students> ders_ekleme = new ArrayList<Students>();
	
	
	
	public Courses(String ders_kodu, String ders_ad�, int kredi) {
		
		this.ders_kodu = ders_kodu;
		this.ders_ad� = ders_ad�;
		this.kredi = kredi;
		
	
	}



	public String getDers_kodu() {
		return ders_kodu;
	}



	public void setDers_kodu(String ders_kodu) {
		this.ders_kodu = ders_kodu;
	}



	public String getDers_ad�() {
		return ders_ad�;
	}



	public void setDers_ad�(String ders_ad�) {
		this.ders_ad� = ders_ad�;
	}



	public int getKredi() {
		return kredi;
	}



	public void setKredi(int kredi) {
		this.kredi = kredi;
	}



	
	



	
	
	
}
