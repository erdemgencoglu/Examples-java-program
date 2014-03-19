
public class Otobüs {

	int kapasite;
	String nereden;
	String nereye;
	
	int kaydedilenYolcu;
	boolean aktif;

	public void YolcuAl() {
		
		if (aktif) {
			
			if (kaydedilenYolcu>kapasite) {
				System.out.println("Otobüs Doldu..");
			}else kaydedilenYolcu++;		
		}else
			System.out.println("Otobüs garajda");
	}

	public void YolcuÇýkar() {
		
		kaydedilenYolcu--;
		if (kaydedilenYolcu>0) {
			
		}else System.out.println("Otobüs Zaten boþ..");
		
	}
	public void  BilgiAl() {
		System.out.println("Kapasite"+kapasite);
		System.out.println("Kaydedilen Yolcu"+kaydedilenYolcu);
		System.out.println("Nereden: "+nereden);
		System.out.println("Nereye: "+nereye);
		System.out.println("Otobüsün Durumu"+aktif);
		
		
	}
}
