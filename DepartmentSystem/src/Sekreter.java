import java.util.Scanner;

public class Sekreter extends Staff {
	Scanner scanner = new Scanner(System.in);
	public Sekreter(int kimlikNo, int calismaSaati, String gorevBilgisi) {
		super(kimlikNo, calismaSaati, gorevBilgisi);
	
	}
	
	@Override
	public void atama() {// ��retmenlere ders atama i�lemi i�in override edilmi� fonksiyon
		Main main = new Main();// main class�ndaki arraylistlere eri�mek i�in obje olu�umu
		if(main.getDers().size()==0) { // olu�turulmu� ders olup olmad���n� kontrol ediyor. courses s�n�f�ndan olu�turdu�umuz objeler ders arraylistinin i�inde tutuluyordu. .size() ile arraylistin i�i bo� mu diye bak�yoruz												
			System.out.println("Ders Atamak ��in �nce Ders Olu�turmal�s�n�z...");
		return;
				
		}
		System.out.println("   ��retmen Ad� Soyad�\t\t��retmen ID'si");
		System.out.println("----------------------------------------------------------------------");
			for(int i = 0;i<main.getEgitmen().size();i++) { // ��retmen bilgilerini ekrana bas�yor. egitmen arraylistinin i�inde bulunan lecturers s�n�f�ndan olu�turdu�umuz objelerin bilgilerini yazd�r�yor
				System.out.println((i+1)+". "+main.getEgitmen().get(i).getName_surname()+"\t\t\t"+main.getEgitmen().get(i).getId());
			}
		
		System.out.println("Ders Atamak �stedi�iniz ��retmeni Se�niz(1-3)");
		int secilen_egitmen = scanner.nextInt(); // ders atamak istedi�imiz ��retmeni se�mek i�in scanner
		
		if(main.getEgitmen().get((secilen_egitmen-1)).ders_sayisi.size()==9) { // lecturers s�n�f�n�n i�inde ders_sayisi referans� ile bir arraylist var. bu arraylist her lecturers objesi i�in ayr� oldu�undan
																	// ��retmenlere atad���m�z dersleri orada tutuyoruz. ders_sayisi adl� arraylist courses s�n�f�ndan olu�turulan objeleri tutuyor
			// bu k�s�mda ise ders_sayisi arraylisti ile her e�itmene ka� ders atand���n� kontrol ediyoruz 9 olmu� ise 10. dersi atarken hata veriyor ve dersi atam�yor. men� ekran�na geri g�nderiyor.
			System.out.println("E�itmen MAX Ders Say�s�na Ula�t�");
			return;
		}
		
		System.out.println("   Ders Ad�\t\t\t\tDers Kodu\t\tDersin Kredisi");
		System.out.println("----------------------------------------------------------------------");
			for(int i = 0; i<main.getDers().size();i++) { // olu�turulan dersleri ve bilgilerini ekrana basmak i�in 
				System.out.println((i+1)+". "+main.getDers().get(i).getDers_ad�()+"\t\t"+main.getDers().get(i).getDers_kodu()+"\t\t\t"+main.getDers().get(i).getKredi());
			}	
		
		System.out.println("Atamak �stedi�iniz Dersi Se�iniz(S�ras�n� Giriniz)");
		int atanan_ders = scanner.nextInt(); // ��retmene atanacak dersi se�mek i�in de�i�ken tan�m� ve scanner ile dersin se�ilmesi
		scanner.nextLine();
		
		
		main.getEgitmen().get((secilen_egitmen-1)).ders_sayisi.add(main.getDers().get(atanan_ders-1));//se�ilen egitmen objesinin (-1 dememizin nedeni ekranda 1 den ba�lamas� ama arraylistin i�inde 0. indexden itibaren depolamas�)
																				  // i�indeki ders_sayisi arraylistinin i�ine se�ilen dersin atanmas�.
		System.out.println(main.getEgitmen().get((secilen_egitmen-1)).getName_surname()+" Adl� E�itmene Ders Atama ��lemi Yap�ld�"); // hangi e�itmene ders atanmas� yap�ld���n�n bildirimesi
	
	}
	
	
	
    

	}


