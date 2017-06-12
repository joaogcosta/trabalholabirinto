import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.senac.SimpleJava.Console;

public class Run extends Room{
	public Room room[] = new Room[31];
	public int indice = 31;
	int index = 0;
	String coordenate;
	int roomNow = 0;
	
		public void run(){
		this.coordenate = "Labirinto.txt";
		rideRoom(coordenate);
			
		roomNow = room[0].getRoomNumber();
		
		do{
			Console.print("You are in room: "+roomNow);
			String showRoom = checkRoom(roomNow);
			Console.println(showRoom);
			
		}while(roomNow > 0);
			
			
			}//Final Run

			
		private String checkRoom(int roomNow2) {
			for(int i=0; i< room.length; i++){
				
			}
			return null;
		}


		public void readArchive() throws FileNotFoundException{
			Scanner read = new Scanner(new FileInputStream("Labirinto.txt"));
			
			while (read.hasNext()){
				int number = 0;
				String dateRoom = read.nextLine();
			room[number] = rideRoom(dateRoom);
				number++;
				
			}
		}


		private Room rideRoom(String dateRoom) {
			Scanner nRoom = new Scanner(dateRoom);
				Room room = new Room();
				while(nRoom.hasNext()){
					String direction = nRoom.next();
						if(direction.equalsIgnoreCase("room")){;
							room.setRoomNumber(nRoom.nextInt());
						}
							else if(direction.equalsIgnoreCase("south")){
							room.setSouthNumber(nRoom.nextInt());
							room.setRoomName("South");
							}
							else if(direction.equalsIgnoreCase("north")){
								room.setNorthNumber(nRoom.nextInt());
								room.setRoomName("North");
							}
							else if(direction.equalsIgnoreCase("east")){
								room.setEastNumber(nRoom.nextInt());
								room.setRoomName("East");
							}
							else if(direction.equalsIgnoreCase("west")){
								room.setWestNumber(nRoom.nextInt());
								room.setRoomName("West");
							}
							else if(direction.equalsIgnoreCase("up")){
								room.setUpNumber(nRoom.nextInt());
								room.setRoomName("Up");
							}
							
							else if(direction.equalsIgnoreCase("down")){
								room.setDownNumber(nRoom.nextInt());
								room.setRoomName("Down");
							}
					
						
						
				}//Final while
				
			return room;
		
	}//Final metodo
			
			
			
}//Final Class