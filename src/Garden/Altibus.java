package Garden;

public class Altibus extends Planta{

	
	Altibus() {
		super();
		altura=0;
		esViva=true;
	}

	char getChar(int nivell) {
		if(nivell==getAltura()) {
			return 'O';
		}
		if(nivell>getAltura()) {
			return ' ';
		}
		return '|';
	}

	Llavor creix() {
		if(esViva) {
		altura+=1;
		}
		else {
			altura=0;
		}
		if(altura==7) {
			return new Llavor(new Altibus());
		}
		if(altura==10) {
			esViva=false;
		}
		return null;
	}

}
