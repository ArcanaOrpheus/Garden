package Garden;

public abstract class Planta {


	Planta (){
		super();
		esViva=true;
		altura=0;
	}
	
	boolean esViva;
	int altura;
	
	abstract char getChar(int nivell);
	
	int escampaLlavor() {
		int i= (int) (Math.random()*4-2);
		return i;		
	}
	
	Planta creix(){
		altura+=1;
		if(altura==10) {
			esViva=false;
		}
		return null;
	}
	
	int getAltura() {
		return altura;
	}
	
	boolean esViva() {
		return esViva;
	}
}
