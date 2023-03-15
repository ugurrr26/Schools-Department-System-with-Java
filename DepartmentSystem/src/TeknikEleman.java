
public class TeknikEleman extends Staff {

	public TeknikEleman(int kimlikNo, int calismaSaati, String gorevBilgisi) {
		super(kimlikNo, calismaSaati, gorevBilgisi);
		
		
	}

	@Override
	public void atama() {//öðretmenlere ders atamasý iþlemini sadece sekreter classý yapabileceði için override ettiðimiz fonksiyonu deðiþtirmeye gerek yok
	
		super.atama();
	}

}
