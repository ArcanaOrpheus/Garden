package Garden;

public class Jardi{
	static Planta jardi[];
	
	Jardi(int mesura){
		if(mesura<=0) {
			jardi = new Planta[10];
		}
		else {
			jardi= new Planta[mesura];
		}
	}
	
	void temps() {
		for(int i= 0; i<jardi.length;i++) {
			if(jardi[i]!=null) { Planta p =jardi[i].creix();
				if(p instanceof Llavor) {
					int l=i+jardi[i].escampaLlavor();
					boolean flag=false;
					boolean place=false;
					while(!flag) {
						if(jardi[l]!=null) {
							if(l==jardi.length-1) place=false;
							if(l==0) place=true;
							if(place) l+=1;
							if(!place) l-=1;
						}
						else flag=true;
						plantaLlavor(p,l);
					}
				}
					else {
						if(p instanceof Planta) {
							jardi[i]=p;
						}
					}
				if(!jardi[i].esViva()) {
					jardi[i]=null;
				}
				
			}
		}
	}
	
	
	public String toString() {
		String res = "";

		for (int j = 10; j > 0; j--) {
			for (int i = 0; i < jardi.length; i++) {
				if (jardi[i] == null) {
					res = res + " ";
				} else {
					res = res + jardi[i].getChar(j);
				}
			}
			res = res + "\n";
			if (j == 1) {
				for (int k = 0; k < jardi.length; k++) {
					res = res + "_";
				}
			}

		}

		return res;

	}
	
	static boolean plantaLlavor (Planta novaPlanta, int pos) {
		jardi[pos]=novaPlanta;
		return true;
	}

	
	

}
