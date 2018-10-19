package Garden;

public class Llavor extends Planta{	
	Planta planta;
	int temps;
	
	Llavor(Planta planta){
		super();
		this.planta=planta;
		this.temps=0;
			if(planta instanceof Llavor) {
				throw new IllegalArgumentException("Les llavors no poden crear llavors");
			}
	}
	
	
	char getChar(int nivell) {
		if(nivell==1) {
			return '.';
		}
		return ' ';
	}

	Planta creix() {
		if(temps<5){
			temps+=1;
			return null;
		}
		else {
			return planta;
		}
		
	}
	
}
