
public class OtobüsTest {

	public static void main(String[] args) {
		Otobüs BursaAnkara=new Otobüs();
		
		BursaAnkara.aktif=true;
		BursaAnkara.kapasite=20;
		BursaAnkara.nereden="Bursa";
		BursaAnkara.nereye="Ankara";
		
		for(int i=0;i<30;i++){
			BursaAnkara.YolcuAl();
		}
		BursaAnkara.BilgiAl();
	
		BursaAnkara.YolcuÇýkar();
		BursaAnkara.YolcuÇýkar();
		BursaAnkara.BilgiAl();
	}
	
}
