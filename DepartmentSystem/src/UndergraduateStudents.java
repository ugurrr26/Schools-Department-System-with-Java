
public class UndergraduateStudents extends Students{
	
	private String tur;
	public UndergraduateStudents(String tc, String ad_soyad, int y�l,String tur) {
		super(tc, ad_soyad, y�l);
		this.tur=tur;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	
}
