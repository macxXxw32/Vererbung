package Vererbung;

public class Haustier
{
	

	private String name;
	private int alter;
	private double gewicht;
	
	public Haustier(){}
	
	public Haustier(String name, int alter, double gewicht)
	{
		
		this.name = name;
		this.alter = alter;
		this.gewicht = gewicht;
	}
	
	public void print()
	{
		
		System.out.println("Name: " + this.name);
		System.out.println("Alter: " + this.alter);
		System.out.println("Gewicht: " + this.gewicht);
	}
	
	public double fressen(double menge)
	{
		
		return gewicht += menge;
	}
	
	public void gebeLaut()
	{}

	
	
	
	//getter + setter
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}


}