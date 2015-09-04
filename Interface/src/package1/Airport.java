package package1;

public class Airport {

	public static void main(String[] args) {
		
		Airport metro = new Airport();
		Helicopter copter = new Helicopter();
		Seaplane sPlane = new Seaplane();
		
		metro.givePermissionToLand(copter);
		metro.givePermissionToLand(sPlane);
		// TODO Auto-generated method stub

	}
	private void givePermissionToLand(Seaplane sPlane){
		
	}
	private void givePermissionToLand(Helicopter copter){
		
	}

}
