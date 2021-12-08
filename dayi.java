package day05_matematikselIslemler;

public class dayi {

	public static void main(String[] args) {
		// verilen 12345
		
		int sayi=12345;
		int birler=sayi%10;
		int onlar=(sayi/10)%10;
		int yüzler=(sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onBinler=(sayi/10000)%10;
		
		System.out.println(onBinler);
		System.out.println(binler);
		System.out.println(yüzler);
		System.out.println(onlar);
		System.out.println(birler);

		// consolda alt satıra yazdırmak için "\n" komutu kullanılır
		
		System.out.println(onBinler+"\n"+binler+"\n"+yüzler+"\n"+onlar+"\n"+birler);
		
		
		
	}

}
