import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Students> ogrenci = new ArrayList<Students>();// student sýnýfýndan oluþturduðumuz objeleri tutmak için arraylist . oluþturduðumuz öðrencileri tutuyor
	private static ArrayList<Courses> ders = new ArrayList<Courses>(); // courses sýnýfýndan oluþturduðumuz objeleri tutmak için arraylist . oluþturduðumuz dersleri tutuyor.
	private static ArrayList<Lecturers> egitmen = new ArrayList<Lecturers>(); // lecturers sýnýfýndan oluþturduðumuz objeleri tutmak için arraylist . oluþturduðumuz eðitim görevlilerini tutuyor
	private static ArrayList<Staff> calisan = new ArrayList<Staff>(); // staff sýnýfýndan oluþturduðumuz objeleri tutmak için arraylist . oluþturduðumuz stafflarý tutuyor
	
	public static void main(String[] args) {
		//eðitim görevlisi oluþturmamýza gerek olmadýðý için lecturers sýnýfýndan önceden oluþturduðumuz objeler ve bu objeleri egitmen adlý arraylistte tutuyoruz. 
		egitmen.add(new Lecturers(349,"Aybike DÝLBAZ"));
		egitmen.add(new Lecturers(350,"Buket ERGÜN"));
		egitmen.add(new Lecturers(351,"Ahmet AKIN"));
		egitmen.add(new Lecturers(352,"Duygu KOÞMA"));
		
		//çalýþan oluþturmamýza gerek olmadýðý için staff sýnýfýndan önceden oluþturduðumuz objeler ve bu objeleri calisan adlý arraylistte tutuyoruz. 
		calisan.add(new Sekreter(123456,20,"Sekreter"));
		calisan.add(new TeknikEleman(654525,15,"Teknik Eleman"));
		
		
		// menü için string deðiþkeni 
		String islemler = "*****************************\n"+
					   "1. Öðrenci Kayýt\n"+
					   "2. Kayýtlý Öðrencileri Görüntüleme\n"+
					   "3. Ders Oluþturma\n"+
					   "4. Oluþturulan Dersleri Görüntüleme\n"+
					   "5. Öðretmenlerin Bilgileri ve Ders Atama\n"+
					   "6. Öðretmenlere Atanmýþ Dersleri Görme\n"+
					   "7. Öðrencilere Ders Atama\n"+
					   "8. Öðrencilere Atanmýþ Dersleri Görme\n"+
					   "Çýkýþ için q ya basýnýz.\n"+
					   "*****************************\n"+
					   "Ýþlem Seçiniz:";
		System.out.println("*****************************");
		System.out.println("Department System");
		
		
		Scanner scanner = new Scanner(System.in); //kullanýcýdan deðer almak için scanner tanýmý
		
		
		while(true) { // menü seçimi için while döngüsü
			System.out.print(islemler);
			String islem = scanner.nextLine();
			
			if(islem.equals("1")) { // öðrenci sýnýfýndan obje oluþtrmak için yani öðrenci kaydý yapmak için bölüm
				boolean a = true;
				System.out.print("Öðrencinin Adý ve Soyadýný Giriniz: ");
				String ad_soyad = scanner.nextLine();
				System.out.print("Öðrencinin TC Kimlik Numarasýný Giriniz: ");
				String tc = scanner.nextLine();
				System.out.print("Öðrenci Yýlýný Giriniz: ");
				int yýl = scanner.nextInt();
				scanner.nextLine();// enter deðerini string sonraki iþlemde alacaðýmýz string kabul etmesin diye dummy scanner
				System.out.println("Oluþturulan Öðrenci Ne Öðrencisi?(Master ya da Lisans)");// seçilen öðretim düzeyine göre öðrenci oluþturuluyor
				String tur = scanner.nextLine();
				if(tur.equals("Master")|| tur.equals("master")) {
					for(int i = 0;i<ogrenci.size();i++) {//oluþturulacak öðrencinin tc kimlik numarýsý daha önce sistemde herhangi bir öðrencide var mý kontrol etmek için bakýlýyor.
						if(tc.equals(ogrenci.get(i).getTc())) {
							System.out.println("Bu TC Kimlik Numarsýna Sahip Bir Öðrenci Sistemde Yer Almaktadýr. Kayýt oluþturulamadý.");
							a=false;//ayný tc numarasýna sahip bir öðrenci varsa öncede true olan a deðeri false oluyor ve öðrenci ekleme iþlemi yapýlamýyor.
							break;
						}
					}
					
					while(a) {
						Students stu = new MastersStudents(tc,ad_soyad,yýl,tur); // oluþturduðumuz öðrenci objesi
						ogrenci.add(stu); // oluþturduðumuz öðrenci objesini öðrenci arraylistine ekliyoruz 
						a=false;
					}
				}
				else if(tur.equals("Lisans")|| tur.equals("lisans")) {
					for(int i = 0;i<ogrenci.size();i++) {//oluþturulacak öðrencinin tc kimlik numarýsý daha önce sistemde herhangi bir öðrencide var mý kontrol etmek için bakýlýyor.
						if(tc.equals(ogrenci.get(i).getTc())) {
							System.out.println("Bu Öðrenci Sistemde Yer Almaktadýr. Kayýt oluþturulamadý.");
							a=false;//ayný tc numarasýna sahip bir öðrenci varsa öncede true olan a deðeri false oluyor ve öðrenci ekleme iþlemi yapýlamýyor.
							break;
						}
											
				}
					while (a) {
						Students stu = new UndergraduateStudents(tc,ad_soyad,yýl,tur); // oluþturduðumuz öðrenci objesi
						ogrenci.add(stu); // oluþturduðumuz öðrenci objesini öðrenci arraylistine ekliyoruz
						a=false;
					}
				}
				else {
					System.out.println("Geçersiz Öðretim Düzeyi");
				}
			}
			else if (islem.equals("2")) { // kaydý yapýlan öðrencileri görüntülemek için bölüm
				if(ogrenci.size()==0) { // oluþturduðumuz öðrencileri öðrenci arraylistine ekliyoruz. öðrenci arraylistinin size 0 sa boþtur ve gösterilecek öðrenci yok
					System.out.println("Kayýtlý Öðrenci Yok");
					continue;
					
				}
				System.out.println("   Ad Soyad\t\t\tTC Kimlik Numarasý\t\tYýlý");
				System.out.println("----------------------------------------------------------------------");
				for(int i = 0; i<ogrenci.size();i++) {
					System.out.println((i+1)+". "+ogrenci.get(i).getAd_soyad()+"\t\t\t"+ogrenci.get(i).getTc()+"\t\t\t"+ogrenci.get(i).getYýl());
					                            // döngü oluþturuyoruz ögrenci arraylistinin elemanlarýnýnýn özelliklerini ekrana basýyoruz. i deðeri ile öðrenci arraylistinin tüm deðerlerini geziyoruz.
				}
				
				continue;
			}
			else if (islem.equals("3")) {// ders oluþturmak için courses sýnýfýndan oluþturduðumuz objeler
				System.out.print("Ders Adýný Giriniz: ");
				String ders_adý = scanner.nextLine();
				System.out.print("Ders Kodunu Giriniz: ");
				String ders_kodu = scanner.nextLine();
				System.out.print("Ders Kredisini Giriniz: ");
				int kredi = scanner.nextInt();
				scanner.nextLine();
				Courses courses = new Courses(ders_kodu,ders_adý,kredi);
				ders.add(courses); // oluþturduðumuz dersleri ders arraylistinin içine ekliyoruz.
				continue;
			}
			
			
			else if (islem.equals("4")) {
				if(ders.size()==0) {//ders arraylistinin büyüklüðü 0 sa ders oluþturulmamýþtýr ve continue ile döngünün baþýna gideriz
					System.out.println("Oluþturulan Ders Yok");
					continue;
				}
				System.out.println("   Ders Adý\t\t\tDers Kodu\t\tDersin Kredisi");
				System.out.println("----------------------------------------------------------------------");
					for(int i = 0; i<ders.size();i++) {
						System.out.println((i+1)+". "+ders.get(i).getDers_adý()+"\t\t\t"+ders.get(i).getDers_kodu()+"\t\t\t"+ders.get(i).getKredi());
						//döngü oluþturuyoruz ders arraylistinin elemanlarýnýnýn özelliklerini ekrana basýyoruz. i deðeri ile ders arraylistinin tüm deðerlerini geziyoruz.
					}	
					
			}
			
			else if (islem.equals("5")) {
				// öðretmenlerin bilgilerini ekrana yazdýrmak için ve onlara ders atamak için bölüm
				
				for(int i=0;i<calisan.size();i++) {// önceden oluþturduðumuz çalýþanlarýn bilgilerini ekrana basýyor. id, görevi gibi
					System.out.println((i+1)+". "+calisan.get(i).getGorevBilgisi()+"\t\t\t"+calisan.get(i).getKimlikNo());
				}
				System.out.println("----------------------------------------------------------------------");
				System.out.print("Sisteme Kim Eriþmek Ýstiyor: ");// öðretmene ders atama iþlemini sadece sekreter yapabileceði için sisteme kimin eriþtiðini soruyor.
				int secilen_calisan = scanner.nextInt();
				scanner.nextLine();
				calisan.get(secilen_calisan-1).atama();
		
				
			}
			else if (islem.equals("6")) {
				
				System.out.println("\t\t\tAtanmýþ Ders Bilgileri");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Adý Soyadý\t\t\t\tEðitmenin Verdiði Dersler");
				System.out.println("----------------------------------------------------------------------");
				for(int i=0;i<egitmen.size();i++) { //eðitmenlere atanan dersleri ekrana basmak için döngü
					System.out.print(egitmen.get(i).getName_surname());
					for(int j=0;j<egitmen.get(i).ders_sayisi.size();j++) {
						System.out.println("    \t\t\t\t"+egitmen.get(i).ders_sayisi.get(j).getDers_adý()+"\t"+egitmen.get(i).ders_sayisi.get(j).getDers_kodu()+"\t"+egitmen.get(i).ders_sayisi.get(j).getKredi());
					}
				}
			}
			else if(islem.equals("7")) {
				System.out.println("   Ad Soyad\t\t\tTC Kimlik Numarasý\t\tYýlý");
				System.out.println("----------------------------------------------------------------------");
				for(int i = 0; i<ogrenci.size();i++) {// öðrenci bilgilerini ekrana basmak için döngü 
					System.out.println((i+1)+". "+ogrenci.get(i).getAd_soyad()+"\t\t\t"+ogrenci.get(i).getTc()+"\t\t\t"+ogrenci.get(i).getYýl());
				}
				
				System.out.println("----------------------------------------------------------------------");
				System.out.print("Hangi Öðrenciye Ders Atamak Ýstiyorsunuz?");
				int secilen_ögrenci=scanner.nextInt(); //istenilen öðrenciye ders atamasý yapmak için deðiþken tanýmý
				System.out.print("Hangi Dersi Atamak Ýstiyorsunuz?");
				int secilen_ders = scanner.nextInt(); // atanmak istenen ders için deðiþken tanýmý
				scanner.nextLine();
				ders.get(secilen_ders-1).ders_ekleme.add(ogrenci.get(secilen_ögrenci-1)); // Courses classýnýn içinde students cinsenden objeleri depolayan ders_ekleme adýnda bir arraylist var
				// her courses objesisi için ayrýca bulunan bu arraylistin içine istenilen studentlar atanýyor. 
				System.out.println("Ders Atamasý Baþarýyla yapýldý");
				
				
			}
			
			else if (islem.equals("8")) {
				System.out.println("Dersler ve Alan Öðrenciler");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Ders Adý\t\t\tDersi Alan Öðrenciler");
				System.out.println("----------------------------------------------------------------------");
				for(int i = 0; i<ders.size();i++) {// dersleri hangi öðrencilerin aldýðýný ekrana basmak için döngü.
					System.out.print(ders.get(i).getDers_adý());
					for(int j = 0;j<ders.get(i).ders_ekleme.size();j++) {
						System.out.println("\t\t\t\t"+ders.get(i).ders_ekleme.get(j).getAd_soyad());
						
					}
				}
			}
			
			else if((islem.equals("q")) || (islem.equals("Q")))  { //while döngüsünü programý sonlandýrmak için iþlem
				System.out.println("Sistemden Çýkýlýyor...");
				break; 
			}
			
			else {
				System.out.println("Geçersiz Deðer Girdiniz.");//menüden farklý deðer girince dönen cevap
				continue;
			}
			
			
		}
		
		
	}

	public static ArrayList<Students> getOgrenci() {
		return ogrenci;
	}

	public static void setOgrenci(ArrayList<Students> ogrenci) {
		Main.ogrenci = ogrenci;
	}

	public static ArrayList<Courses> getDers() {
		return ders;
	}

	public static void setDers(ArrayList<Courses> ders) {
		Main.ders = ders;
	}

	public static ArrayList<Lecturers> getEgitmen() {
		return egitmen;
	}

	public static void setEgitmen(ArrayList<Lecturers> egitmen) {
		Main.egitmen = egitmen;
	}

	public static ArrayList<Staff> getCalisan() {
		return calisan;
	}

	public static void setCalisan(ArrayList<Staff> calisan) {
		Main.calisan = calisan;
	}
	
}

