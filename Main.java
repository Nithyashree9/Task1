import java.util.ArrayList;
import java.util.Hashmap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class Main {
	public static void main(String[] args) {
		//Map<String, List<ElectronicDevice>> empMap = new LinkedHashMap<>();
   Electronicdevice e1 = new Electronic("Dell","Sony","Symphony");
 ElectronicDevice e2 = new ElectronicDevice("HP","Samsung","Hitachi");
   ElectronicDevice e3 = new ElectronicDevice("Lenovo","Moto","BlueStar");
   
List<ElectronicDevice> DeviceList = new ArrayList<>();
  DeviceList.add(e1);
  DeviceList.add(e2);
  DeviceList.add(e3);
  
System.out.println(e1);
	}
	
private class ElectronicDevice {
//Variable declaration
String Laptop;
String Mobile;
String AC;
//default constructor
public ElectronicDevice() {
}
//primary constructor
public ElectronicDevice(String LAptop, String Mobile; String AC) {
	this.Lsptop = Laptop;
	this.Mobile = Mobile;
	this.AC = AC;
}
}
//end of main
}
