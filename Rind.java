package Vererbung;

public class Rind extends Haustier{
	

	private int ID;
	private boolean Hörner;
	public static int muhZahl;
	
	public Rind(String name, int alter, double gewicht, int ID, boolean Hörner)
	{
		super(name, alter, gewicht);
		this.ID = ID;
		this.Hörner = Hörner;
	}
	
	public void print()
	{
		super.print();
		System.out.println("ID: " + ID);
		System.out.println("Hörner: " + Hörner);
	}
	
	public void gebeLaut(int wieoft)
	{
		for(int i = 0; i < wieoft; i++) {
			System.out.println("muuuuuhhhh");
			muhZahl++;
		}
	}
	
	public void muhZählen() 
	{
		System.out.println("So oft hat " + super.getName() + " gemuht: " + muhZahl);
	}
	
	public void wiederkauen()
	{
		System.out.println("mjam");
	}

	
	
	//getter + setter
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public boolean isHörner() {
		return Hörner;
	}

	public void setHörner(boolean hörner) {
		Hörner = hörner;
	}
	
	
}