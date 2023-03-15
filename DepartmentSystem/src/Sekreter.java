import java.util.Scanner;

public class Sekreter extends Staff {
	Scanner scanner = new Scanner(System.in);
	public Sekreter(int kimlikNo, int calismaSaati, String gorevBilgisi) {
		super(kimlikNo, calismaSaati, gorevBilgisi);
	
	}
	
	@Override
	public void atama() {// öðretmenlere ders atama iþlemi için override edilmiþ fonksiyon
		Main main = new Main();// main classýndaki arraylistlere eriþmek için obje oluþumu
		if(main.getDers().size()==0) { // oluþturulmuþ ders olup olmadýðýný kontrol ediyor. courses sýnýfýndan oluþturduðumuz objeler ders arraylistinin içinde tutuluyordu. .size() ile arraylistin içi boþ mu diye bakýyoruz												
			System.out.println("Ders Atamak Ýçin Önce Ders Oluþturmalýsýnýz...");
		return;
				
		}
		System.out.println("   Öðretmen Adý Soyadý\t\tÖðretmen ID'si");
		System.out.println("----------------------------------------------------------------------");
			for(int i = 0;i<main.getEgitmen().size();i++) { // öðretmen bilgilerini ekrana basýyor. egitmen arraylistinin içinde bulunan lecturers sýnýfýndan oluþturduðumuz objelerin bilgilerini yazdýrýyor
				System.out.println((i+1)+". "+main.getEgitmen().get(i).getName_surname()+"\t\t\t"+main.getEgitmen().get(i).getId());
			}
		
		System.out.println("Ders Atamak Ýstediðiniz Öðretmeni Seçniz(1-3)");
		int secilen_egitmen = scanner.nextInt(); // ders atamak istediðimiz öðretmeni seçmek için scanner
		
		if(main.getEgitmen().get((secilen_egitmen-1)).ders_sayisi.size()==9) { // lecturers sýnýfýnýn içinde ders_sayisi referansý ile bir arraylist var. bu arraylist her lecturers objesi için ayrý olduðundan
																	// öðretmenlere atadýðýmýz dersleri orada tutuyoruz. ders_sayisi adlý arraylist courses sýnýfýndan oluþturulan objeleri tutuyor
			// bu kýsýmda ise ders_sayisi arraylisti ile her eðitmene kaç ders atandýðýný kontrol ediyoruz 9 olmuþ ise 10. dersi atarken hata veriyor ve dersi atamýyor. menü ekranýna geri gönderiyor.
			System.out.println("Eðitmen MAX Ders Sayýsýna Ulaþtý");
			return;
		}
		
		System.out.println("   Ders Adý\t\t\t\tDers Kodu\t\tDersin Kredisi");
		System.out.println("----------------------------------------------------------------------");
			for(int i = 0; i<main.getDers().size();i++) { // oluþturulan dersleri ve bilgilerini ekrana basmak için 
				System.out.println((i+1)+". "+main.getDers().get(i).getDers_adý()+"\t\t"+main.getDers().get(i).getDers_kodu()+"\t\t\t"+main.getDers().get(i).getKredi());
			}	
		
		System.out.println("Atamak Ýstediðiniz Dersi Seçiniz(Sýrasýný Giriniz)");
		int atanan_ders = scanner.nextInt(); // öðretmene atanacak dersi seçmek için deðiþken tanýmý ve scanner ile dersin seçilmesi
		scanner.nextLine();
		
		
		main.getEgitmen().get((secilen_egitmen-1)).ders_sayisi.add(main.getDers().get(atanan_ders-1));//seçilen egitmen objesinin (-1 dememizin nedeni ekranda 1 den baþlamasý ama arraylistin içinde 0. indexden itibaren depolamasý)
																				  // içindeki ders_sayisi arraylistinin içine seçilen dersin atanmasý.
		System.out.println(main.getEgitmen().get((secilen_egitmen-1)).getName_surname()+" Adlý Eðitmene Ders Atama Ýþlemi Yapýldý"); // hangi eðitmene ders atanmasý yapýldýðýnýn bildirimesi
	
	}
	
	
	
    

	}


