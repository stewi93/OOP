
public abstract class Product {
	
	//Properties
	public int prijs;
	public int grootte;
	public int versie_nummer;
	public String naam; 
	public boolean electrisch;

	// constructor
	// public Product() {
	//	System.out.println("In constructor");
	//}
	
	//public Product(int prijs, int grootte, String naam, boolean electrisch) {
	//	this.prijs = prijs;
	//	this.grootte = grootte;
	//	this.naam = naam;
	//	this.electrisch = electrisch;
	//}
	
	//public Product(int grootte) {
	//	this.grootte = grootte;
	//}
	
	//Methods
	public abstract int getPrice();
	public abstract int getStartTime();
	
	public void doeIets() {System.out.println("Prijs is "+ prijs);
	
	}
	public void doeIets2() {System.out.println("Grootte is "+ grootte);
	}
	public void doeIets3() {System.out.println("Electrisch is "+ electrisch);
	}

	public void stelPrijsIn(int prijs) {
		System.out.println("Prijs = " + this.prijs);
		this.prijs = prijs;
		System.out.println(this.prijs);
	}
	public void stelHoeveelheidIn(int grootte) {
		this.grootte = grootte;
		System.out.println(this.grootte);
	}
	public void stelNaamIn(String naam) {
		this.naam = naam;
		System.out.println(this.naam);
	}
	
	
	public String watIsDeNaam() {
		return naam;
	}
	public int watIsDePrijs() {
		return prijs;
	}
	public int watIsDeGrootte() {
		return grootte;
	}
}



