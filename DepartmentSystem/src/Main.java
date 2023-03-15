import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Students> ogrenci = new ArrayList<Students>();// student s�n�f�ndan olu�turdu�umuz objeleri tutmak i�in arraylist . olu�turdu�umuz ��rencileri tutuyor
	private static ArrayList<Courses> ders = new ArrayList<Courses>(); // courses s�n�f�ndan olu�turdu�umuz objeleri tutmak i�in arraylist . olu�turdu�umuz dersleri tutuyor.
	private static ArrayList<Lecturers> egitmen = new ArrayList<Lecturers>(); // lecturers s�n�f�ndan olu�turdu�umuz objeleri tutmak i�in arraylist . olu�turdu�umuz e�itim g�revlilerini tutuyor
	private static ArrayList<Staff> calisan = new ArrayList<Staff>(); // staff s�n�f�ndan olu�turdu�umuz objeleri tutmak i�in arraylist . olu�turdu�umuz stafflar� tutuyor
	
	public static void main(String[] args) {
		//e�itim g�revlisi olu�turmam�za gerek olmad��� i�in lecturers s�n�f�ndan �nceden olu�turdu�umuz objeler ve bu objeleri egitmen adl� arraylistte tutuyoruz. 
		egitmen.add(new Lecturers(349,"Aybike D�LBAZ"));
		egitmen.add(new Lecturers(350,"Buket ERG�N"));
		egitmen.add(new Lecturers(351,"Ahmet AKIN"));
		egitmen.add(new Lecturers(352,"Duygu KO�MA"));
		
		//�al��an olu�turmam�za gerek olmad��� i�in staff s�n�f�ndan �nceden olu�turdu�umuz objeler ve bu objeleri calisan adl� arraylistte tutuyoruz. 
		calisan.add(new Sekreter(123456,20,"Sekreter"));
		calisan.add(new TeknikEleman(654525,15,"Teknik Eleman"));
		
		
		// men� i�in string de�i�keni 
		String islemler = "*****************************\n"+
					   "1. ��renci Kay�t\n"+
					   "2. Kay�tl� ��rencileri G�r�nt�leme\n"+
					   "3. Ders Olu�turma\n"+
					   "4. Olu�turulan Dersleri G�r�nt�leme\n"+
					   "5. ��retmenlerin Bilgileri ve Ders Atama\n"+
					   "6. ��retmenlere Atanm�� Dersleri G�rme\n"+
					   "7. ��rencilere Ders Atama\n"+
					   "8. ��rencilere Atanm�� Dersleri G�rme\n"+
					   "��k�� i�in q ya bas�n�z.\n"+
					   "*****************************\n"+
					   "��lem Se�iniz:";
		System.out.println("*****************************");
		System.out.println("Department System");
		
		
		Scanner scanner = new Scanner(System.in); //kullan�c�dan de�er almak i�in scanner tan�m�
		
		
		while(true) { // men� se�imi i�in while d�ng�s�
			System.out.print(islemler);
			String islem = scanner.nextLine();
			
			if(islem.equals("1")) { // ��renci s�n�f�ndan obje olu�trmak i�in yani ��renci kayd� yapmak i�in b�l�m
				boolean a = true;
				System.out.print("��rencinin Ad� ve Soyad�n� Giriniz: ");
				String ad_soyad = scanner.nextLine();
				System.out.print("��rencinin TC Kimlik Numaras�n� Giriniz: ");
				String tc = scanner.nextLine();
				System.out.print("��renci Y�l�n� Giriniz: ");
				int y�l = scanner.nextInt();
				scanner.nextLine();// enter de�erini string sonraki i�lemde alaca��m�z string kabul etmesin diye dummy scanner
				System.out.println("Olu�turulan ��renci Ne ��rencisi?(Master ya da Lisans)");// se�ilen ��retim d�zeyine g�re ��renci olu�turuluyor
				String tur = scanner.nextLine();
				if(tur.equals("Master")|| tur.equals("master")) {
					for(int i = 0;i<ogrenci.size();i++) {//olu�turulacak ��rencinin tc kimlik numar�s� daha �nce sistemde herhangi bir ��rencide var m� kontrol etmek i�in bak�l�yor.
						if(tc.equals(ogrenci.get(i).getTc())) {
							System.out.println("Bu TC Kimlik Numars�na Sahip Bir ��renci Sistemde Yer Almaktad�r. Kay�t olu�turulamad�.");
							a=false;//ayn� tc numaras�na sahip bir ��renci varsa �ncede true olan a de�eri false oluyor ve ��renci ekleme i�lemi yap�lam�yor.
							break;
						}
					}
					
					while(a) {
						Students stu = new MastersStudents(tc,ad_soyad,y�l,tur); // olu�turdu�umuz ��renci objesi
						ogrenci.add(stu); // olu�turdu�umuz ��renci objesini ��renci arraylistine ekliyoruz 
						a=false;
					}
				}
				else if(tur.equals("Lisans")|| tur.equals("lisans")) {
					for(int i = 0;i<ogrenci.size();i++) {//olu�turulacak ��rencinin tc kimlik numar�s� daha �nce sistemde herhangi bir ��rencide var m� kontrol etmek i�in bak�l�yor.
						if(tc.equals(ogrenci.get(i).getTc())) {
							System.out.println("Bu ��renci Sistemde Yer Almaktad�r. Kay�t olu�turulamad�.");
							a=false;//ayn� tc numaras�na sahip bir ��renci varsa �ncede true olan a de�eri false oluyor ve ��renci ekleme i�lemi yap�lam�yor.
							break;
						}
											
				}
					while (a) {
						Students stu = new UndergraduateStudents(tc,ad_soyad,y�l,tur); // olu�turdu�umuz ��renci objesi
						ogrenci.add(stu); // olu�turdu�umuz ��renci objesini ��renci arraylistine ekliyoruz
						a=false;
					}
				}
				else {
					System.out.println("Ge�ersiz ��retim D�zeyi");
				}
			}
			else if (islem.equals("2")) { // kayd� yap�lan ��rencileri g�r�nt�lemek i�in b�l�m
				if(ogrenci.size()==0) { // olu�turdu�umuz ��rencileri ��renci arraylistine ekliyoruz. ��renci arraylistinin size 0 sa bo�tur ve g�sterilecek ��renci yok
					System.out.println("Kay�tl� ��renci Yok");
					continue;
					
				}
				System.out.println("   Ad Soyad\t\t\tTC Kimlik Numaras�\t\tY�l�");
				System.out.println("----------------------------------------------------------------------");
				for(int i = 0; i<ogrenci.size();i++) {
					System.out.println((i+1)+". "+ogrenci.get(i).getAd_soyad()+"\t\t\t"+ogrenci.get(i).getTc()+"\t\t\t"+ogrenci.get(i).getY�l());
					                            // d�ng� olu�turuyoruz �grenci arraylistinin elemanlar�n�n�n �zelliklerini ekrana bas�yoruz. i de�eri ile ��renci arraylistinin t�m de�erlerini geziyoruz.
				}
				
				continue;
			}
			else if (islem.equals("3")) {// ders olu�turmak i�in courses s�n�f�ndan olu�turdu�umuz objeler
				System.out.print("Ders Ad�n� Giriniz: ");
				String ders_ad� = scanner.nextLine();
				System.out.print("Ders Kodunu Giriniz: ");
				String ders_kodu = scanner.nextLine();
				System.out.print("Ders Kredisini Giriniz: ");
				int kredi = scanner.nextInt();
				scanner.nextLine();
				Courses courses = new Courses(ders_kodu,ders_ad�,kredi);
				ders.add(courses); // olu�turdu�umuz dersleri ders arraylistinin i�ine ekliyoruz.
				continue;
			}
			
			
			else if (islem.equals("4")) {
				if(ders.size()==0) {//ders arraylistinin b�y�kl��� 0 sa ders olu�turulmam��t�r ve continue ile d�ng�n�n ba��na gideriz
					System.out.println("Olu�turulan Ders Yok");
					continue;
				}
				System.out.println("   Ders Ad�\t\t\tDers Kodu\t\tDersin Kredisi");
				System.out.println("----------------------------------------------------------------------");
					for(int i = 0; i<ders.size();i++) {
						System.out.println((i+1)+". "+ders.get(i).getDers_ad�()+"\t\t\t"+ders.get(i).getDers_kodu()+"\t\t\t"+ders.get(i).getKredi());
						//d�ng� olu�turuyoruz ders arraylistinin elemanlar�n�n�n �zelliklerini ekrana bas�yoruz. i de�eri ile ders arraylistinin t�m de�erlerini geziyoruz.
					}	
					
			}
			
			else if (islem.equals("5")) {
				// ��retmenlerin bilgilerini ekrana yazd�rmak i�in ve onlara ders atamak i�in b�l�m
				
				for(int i=0;i<calisan.size();i++) {// �nceden olu�turdu�umuz �al��anlar�n bilgilerini ekrana bas�yor. id, g�revi gibi
					System.out.println((i+1)+". "+calisan.get(i).getGorevBilgisi()+"\t\t\t"+calisan.get(i).getKimlikNo());
				}
				System.out.println("----------------------------------------------------------------------");
				System.out.print("Sisteme Kim Eri�mek �stiyor: ");// ��retmene ders atama i�lemini sadece sekreter yapabilece�i i�in sisteme kimin eri�ti�ini soruyor.
				int secilen_calisan = scanner.nextInt();
				scanner.nextLine();
				calisan.get(secilen_calisan-1).atama();
		
				
			}
			else if (islem.equals("6")) {
				
				System.out.println("\t\t\tAtanm�� Ders Bilgileri");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Ad� Soyad�\t\t\t\tE�itmenin Verdi�i Dersler");
				System.out.println("----------------------------------------------------------------------");
				for(int i=0;i<egitmen.size();i++) { //e�itmenlere atanan dersleri ekrana basmak i�in d�ng�
					System.out.print(egitmen.get(i).getName_surname());
					for(int j=0;j<egitmen.get(i).ders_sayisi.size();j++) {
						System.out.println("    \t\t\t\t"+egitmen.get(i).ders_sayisi.get(j).getDers_ad�()+"\t"+egitmen.get(i).ders_sayisi.get(j).getDers_kodu()+"\t"+egitmen.get(i).ders_sayisi.get(j).getKredi());
					}
				}
			}
			else if(islem.equals("7")) {
				System.out.println("   Ad Soyad\t\t\tTC Kimlik Numaras�\t\tY�l�");
				System.out.println("----------------------------------------------------------------------");
				for(int i = 0; i<ogrenci.size();i++) {// ��renci bilgilerini ekrana basmak i�in d�ng� 
					System.out.println((i+1)+". "+ogrenci.get(i).getAd_soyad()+"\t\t\t"+ogrenci.get(i).getTc()+"\t\t\t"+ogrenci.get(i).getY�l());
				}
				
				System.out.println("----------------------------------------------------------------------");
				System.out.print("Hangi ��renciye Ders Atamak �stiyorsunuz?");
				int secilen_�grenci=scanner.nextInt(); //istenilen ��renciye ders atamas� yapmak i�in de�i�ken tan�m�
				System.out.print("Hangi Dersi Atamak �stiyorsunuz?");
				int secilen_ders = scanner.nextInt(); // atanmak istenen ders i�in de�i�ken tan�m�
				scanner.nextLine();
				ders.get(secilen_ders-1).ders_ekleme.add(ogrenci.get(secilen_�grenci-1)); // Courses class�n�n i�inde students cinsenden objeleri depolayan ders_ekleme ad�nda bir arraylist var
				// her courses objesisi i�in ayr�ca bulunan bu arraylistin i�ine istenilen studentlar atan�yor. 
				System.out.println("Ders Atamas� Ba�ar�yla yap�ld�");
				
				
			}
			
			else if (islem.equals("8")) {
				System.out.println("Dersler ve Alan ��renciler");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("Ders Ad�\t\t\tDersi Alan ��renciler");
				System.out.println("----------------------------------------------------------------------");
				for(int i = 0; i<ders.size();i++) {// dersleri hangi ��rencilerin ald���n� ekrana basmak i�in d�ng�.
					System.out.print(ders.get(i).getDers_ad�());
					for(int j = 0;j<ders.get(i).ders_ekleme.size();j++) {
						System.out.println("\t\t\t\t"+ders.get(i).ders_ekleme.get(j).getAd_soyad());
						
					}
				}
			}
			
			else if((islem.equals("q")) || (islem.equals("Q")))  { //while d�ng�s�n� program� sonland�rmak i�in i�lem
				System.out.println("Sistemden ��k�l�yor...");
				break; 
			}
			
			else {
				System.out.println("Ge�ersiz De�er Girdiniz.");//men�den farkl� de�er girince d�nen cevap
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

