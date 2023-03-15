// Staff classý
public class Staff {
	
	private int kimlikNo; // çalýþanlarý kimlik numarasýný tutmak için deðiþken
	private int calismaSaati; // çalýþanlarýn çalýþma saatini tutmak için deðiþken
	private String gorevBilgisi; // çalýþanlarýn türünü (sekreter, teknik eleman, temizlik görevlisi) tutmak için deðiþken
	
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
	System.out.println("Yalnýzca Sekreter Atama Yapabilir");	
	}
	
}
