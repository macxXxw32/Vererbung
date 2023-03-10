package Vererbung;

public class AnwendungHaustier
{
public static void main(String[] args) {
		
	//Objekt "Rind" anlegen	
	Rind Elsa = new Rind("Elsa", 5, 250.8, 007, true);
	
	//Aufruf von Methoden aus "Rind"
	Elsa.gebeLaut(4);
	
	Elsa.muhZählen();
	
	//Aufruf von Methoden aus "Haustier"
	Elsa.fressen(10.0);
	
	//Aufruf von Methoden aus "Milchkuh" nicht möglich
		
		
		
}
}