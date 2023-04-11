
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
	
		new TV();
		TV p = new TV();
		//hiermee is het product aangemaakt in het geheugen. als het ware een variabele gemaakt
		p.grootte = 12;
		p.electrisch = true;
		p.naam = "TV";
		p.versie_nummer = 2;
		p.prijs = 300;
		p.doeIets();
		p.doeIets2();
		p.doeIets3();
		
		p.stelPrijsIn(10);
		p.stelHoeveelheidIn(13);
		p.stelNaamIn("Test");
		
		p.watIsDeNaam();
		p.watIsDePrijs();
		p.watIsDeGrootte();
		
		Wasmachine p2 = new Wasmachine();
		p2.naam = "Wasmachine";
		p2.doeIets();
		p2.doeIets2();
		p2.doeIets3();
		
		p2.stelPrijsIn(20);
		p2.stelHoeveelheidIn(23);
		p2.stelNaamIn("Test2");
		
//		Product p3 = new Product();
//		Product p4 = new Product(1, 2, "Naam", true);
//		Product p5 = new Product(3);
		
		TV tv = new TV();
		Wasmachine wasmachine= new Wasmachine();
		Laptop laptop= new Laptop();
		tv.schermgrootte = 44;
		wasmachine.model = 43;
		laptop.type = "xc";
		
		tv.getPrice();
		tv.getStartTime();
		wasmachine.getPrice();
		wasmachine.getStartTime();
		laptop.getPrice();
		laptop.getStartTime();
		
		String naam = p2.watIsDeNaam();
		p2.watIsDeNaam();
		int prijs = p2.watIsDePrijs();
		p2.watIsDePrijs();
		int grootte = p2.watIsDeGrootte();
		p2.watIsDeGrootte();
		
		System.out.println(naam);
		System.out.println(prijs);
		System.out.println(grootte);
	}

}
