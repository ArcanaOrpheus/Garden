package Garden;

public class Declinus extends Planta{

	boolean creix=true;
	boolean flag=false;
	Declinus() {
		super();
		altura=0;
		esViva=true;
	}

	char getChar(int nivell) {
		if(nivell==getAltura()) {
			return '*';
		}
		if(nivell>getAltura()) {
			return ' ';
		}
		return ':';
	}

	Llavor creix() {
		if(!flag) flag=true;
		else {
		if(creix==true) {
			altura+=1;
		}
		if(creix==false) {
			altura-=1;
		}
		if(getAltura()==4 || getAltura()==3 && creix==false) {
			creix=false;
			return new Llavor(new Declinus());
		}
		if(getAltura()==0 && creix==false) {
			esViva=false;
		}
		
	}
	return null;
	}

}