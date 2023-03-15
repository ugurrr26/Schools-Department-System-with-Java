import java.util.ArrayList;
//dersler için courses sýnýfý
public class Courses {
	private String ders_kodu;
	private String ders_adý;
	private int kredi;

	ArrayList<Students> ders_ekleme = new ArrayList<Students>();
	
	
	
	public Courses(String ders_kodu, String ders_adý, int kredi) {
		
		this.ders_kodu = ders_kodu;
		this.ders_adý = ders_adý;
		this.kredi = kredi;
		
	
	}



	public String getDers_kodu() {
		return ders_kodu;
	}



	public void setDers_kodu(String ders_kodu) {
		this.ders_kodu = ders_kodu;
	}



	public String getDers_adý() {
		return ders_adý;
	}



	public void setDers_adý(String ders_adý) {
		this.ders_adý = ders_adý;
	}



	public int getKredi() {
		return kredi;
	}



	public void setKredi(int kredi) {
		this.kredi = kredi;
	}



	
	



	
	
	
}
