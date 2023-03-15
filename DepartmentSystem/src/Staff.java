// Staff class�
public class Staff {
	
	private int kimlikNo; // �al��anlar� kimlik numaras�n� tutmak i�in de�i�ken
	private int calismaSaati; // �al��anlar�n �al��ma saatini tutmak i�in de�i�ken
	private String gorevBilgisi; // �al��anlar�n t�r�n� (sekreter, teknik eleman, temizlik g�revlisi) tutmak i�in de�i�ken
	
	public Staff(int kimlikNo, int calismaSaati,String gorevBilgisi) {
		
		this.kimlikNo = kimlikNo;
		this.calismaSaati = calismaSaati;
		this.gorevBilgisi = gorevBilgisi;
	}

	public int getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(int kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public int getCalismaSaati() {
		return calismaSaati;
	}

	public void setCalismaSaati(int calismaSaati) {
		this.calismaSaati = calismaSaati;
	}

	public String getGorevBilgisi() {
		return gorevBilgisi;
	}

	public void setGorevBilgisi(String gorevBilgisi) {
		this.gorevBilgisi = gorevBilgisi;
	}
	
	public void atama() {
	System.out.println("Yaln�zca Sekreter Atama Yapabilir");	
	}
	
}
