package it.uiip.pagliaro.Rubrica;

public class Smartphone {

	private int id;
	private String name, ram,  cpu;
	private int displayPpi;
	private String displaySize, displayResolution, size;
	private int weight;
	private String notes;
	private int brand, opSys;
	
    //costruttore
	public Smartphone(int id, String name, String ram, String cpu, int displayPpi, String displaySize,
			String displayResolution, String size, int weight, String notes, int brand, int opSys) {
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.cpu = cpu;
		this.displayPpi = displayPpi;
		this.displaySize = displaySize;
		this.displayResolution = displayResolution;
		this.size = size;
		this.weight = weight;
		this.notes = notes;
		this.brand = brand;
		this.opSys = opSys;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getDisplayPpi() {
		return displayPpi;
	}

	public void setDisplayPpi(int displayPpi) {
		this.displayPpi = displayPpi;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	public String getDisplayResolution() {
		return displayResolution;
	}

	public void setDisplayResolution(String displayResolution) {
		this.displayResolution = displayResolution;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public int getOpSys() {
		return opSys;
	}

	public void setOpSys(int opSys) {
		this.opSys = opSys;
	}
	
	
	//get and set
	
}