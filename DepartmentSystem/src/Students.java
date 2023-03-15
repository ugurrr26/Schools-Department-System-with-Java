// Öðrenciler için Students classý
public class Students {
	private String tc; //Öðrencilerin tc kimlik numarasýný tutmak için deðiþken(long veri tipinde olmalý tc kimlik numarasý 11 haneli olduðu için)
	private String ad_soyad; //Öðrencilerin adý soyadýný tutmak için deðiþken
	private int yýl; //öðrencilerin giriþ yýlýný tutmak için deðiþken
	
	public Students(String tc, String ad_soyad, int yýl) {
		
		this.tc = tc;
		this.ad_soyad = ad_soyad;
		this.yýl = yýl;
	}

	public String getTc() {
		return tc;
	}

	public String getAd_soyad() {
		return ad_soyad;
	}

	public int getYýl() {
		return yýl;
	}
	
	
	
	
	
}
