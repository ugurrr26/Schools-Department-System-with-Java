
public class MastersStudents extends Students{
	private String tur;
	public MastersStudents(String tc, String ad_soyad, int yıl,String tur) {
		super(tc, ad_soyad, yıl);
		this.tur = tur;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	
}
