
public class Otob�s {

	int kapasite;
	String nereden;
	String nereye;
	
	int kaydedilenYolcu;
	boolean aktif;

	public void YolcuAl() {
		
		if (aktif) {
			
			if (kaydedilenYolcu>kapasite) {
				System.out.println("Otob�s Doldu..");
			}else kaydedilenYolcu++;		
		}else
			System.out.println("Otob�s garajda");
	}

	public void Yolcu��kar() {
		
		kaydedilenYolcu--;
		if (kaydedilenYolcu>0) {
			
		}else System.out.println("Otob�s Zaten bo�..");
		
	}
	public void  BilgiAl() {
		System.out.println("Kapasite"+kapasite);
		System.out.println("Kaydedilen Yolcu"+kaydedilenYolcu);
		System.out.println("Nereden: "+nereden);
		System.out.println("Nereye: "+nereye);
		System.out.println("Otob�s�n Durumu"+aktif);
		
		
	}
}
