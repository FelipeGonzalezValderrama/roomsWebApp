package cl.felipeGonzalez.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.felipeGonzalez.models.Room;

@Service
public class RoomService {
	
	private static final List<Room> rooms = new ArrayList<Room>();
	
	
	static {
		for (int i = 0; i < 11; i++) {
			rooms.add(new Room(i, "Room " + i, "RM" + i, "Quality" + i, "2PPL"));
		
		}
			
		}
	public List<Room> getAllRooms() { return rooms;}
	
	}


