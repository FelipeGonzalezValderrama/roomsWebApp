package cl.felipeGonzalez.models;

public class Room {
	private long id;
	private String number;
	private String name;
	private String info;
	private String guestAccomodations;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Room(long id, String number, String name, String info, String guestAccomodations) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.info = info;
		this.guestAccomodations = guestAccomodations;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getGuestAccomodations() {
		return guestAccomodations;
	}

	public void setGuestAccomodations(String guestAccomodations) {
		this.guestAccomodations = guestAccomodations;
	}
}


