package Vererbung;

public class Milchkuh extends Rind
{
	
	public Milchkuh(String name, int alter, double gewicht, int ID, boolean Hörner)
	{
		super(name, alter, gewicht, ID, Hörner);
	}
	
	
	public double milchgeben(double liter)
	{
		return super.getGewicht()-liter;
	}
	
	
	
}