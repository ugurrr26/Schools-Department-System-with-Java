// ��renciler i�in Students class�
public class Students {
	private String tc; //��rencilerin tc kimlik numaras�n� tutmak i�in de�i�ken(long veri tipinde olmal� tc kimlik numaras� 11 haneli oldu�u i�in)
	private String ad_soyad; //��rencilerin ad� soyad�n� tutmak i�in de�i�ken
	private int y�l; //��rencilerin giri� y�l�n� tutmak i�in de�i�ken
	
	public Students(String tc, String ad_soyad, int y�l) {
		
		this.tc = tc;
		this.ad_soyad = ad_soyad;
		this.y�l = y�l;
	}

	public String getTc() {
		return tc;
	}

	public String getAd_soyad() {
		return ad_soyad;
	}

	public int getY�l() {
		return y�l;
	}
	
	
	
	
	
}
