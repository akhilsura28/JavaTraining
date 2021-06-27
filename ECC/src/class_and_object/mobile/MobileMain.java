package class_and_object.mobile;

public class MobileMain {

	public static void main(String[] args) {
		
		//Nokia
		
		//ClassName ObjectName = new ClassName() ;
		
		Mobile Nokia = new Mobile();
		
		Nokia.camera = 15.3f ;
		
		Nokia.OS = "Android 10";
		
		Nokia.BatteryCapacity = 3200 ;
		
		Nokia.Processor = "SnapDragon665" ;
		
		Nokia.RAM = 4 ;
		
		Nokia.Storage = 32 ;
		
		
		System.out.println("Nokia Processor :" + Nokia.Processor);
		
///////////////////////////////////////////////////////////////////
		
		//Samsung
		
		Mobile Samsung = new Mobile();
		
		Samsung.camera = 17.6f ;
		
		Samsung.OS = "Android 11";
		
		Samsung.RAM = 6 ;
		
		Samsung.Processor = "SnapDragon665";
		
		Samsung.Storage = 64 ;
		
		Samsung.BatteryCapacity = 4500 ;
		
		System.out.println("Samsung RAM :" + Samsung.RAM);
		
		System.out.println("Samsung OS :" + Samsung.OS);

	}

}
