
public class TeknikEleman extends Staff {

	public TeknikEleman(int kimlikNo, int calismaSaati, String gorevBilgisi) {
		super(kimlikNo, calismaSaati, gorevBilgisi);
		
		
	}

	@Override
	public void atama() {//��retmenlere ders atamas� i�lemini sadece sekreter class� yapabilece�i i�in override etti�imiz fonksiyonu de�i�tirmeye gerek yok
	
		super.atama();
	}

}
