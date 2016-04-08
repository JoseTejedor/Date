

public class Date {
	
	public Date(int day,int month,int year){
		dia=day;
		mes=month;
		anyo=year;
	    
	}

	private int dia;
	private int mes;
	private int anyo;
	 
	int getDia(){
		return this.dia;
	}
	
	int getMes(){
		return this.mes;
	}
	
	int getAnyo(){
		return this.anyo;
	}

		
	boolean isSameYear(){
		 boolean igual = false;
		 	if(this.anyo == getAnyo()){
		 		igual = true;
		 	}
		 	return igual;
	}

	boolean isSameMonth(){
		boolean igual = false;
			if(this.mes == getMes()){
				igual = true;
			}
			return igual;
	}
			
			
	boolean isSameDay(){
		boolean igual = false;
			if(this.dia == getDia()){
				igual = true;
			}
			return igual;
	}
	
	
	boolean isSame(){
		boolean igual = false;
			if((this.dia == getDia()) && (this.mes == getMes()) && (this.anyo == getAnyo())){
				igual = true;
			}
			return igual;
	}
	
	public void ImprimirMes(){
		
		switch(this.mes){
			case 1: System.out.println("Enero"); break;
			case 2: System.out.println("Febrero"); break;
			case 3: System.out.println("Marzo"); break;
			case 4: System.out.println("Abril"); break;
			case 5: System.out.println("Mayo"); break;
			case 6: System.out.println("Junio"); break;
			case 7: System.out.println("Julio"); break;
			case 8: System.out.println("Agosto"); break;
			case 9: System.out.println("Septiembre"); break;
			case 10: System.out.println("Octubre"); break;
			case 11: System.out.println("Noviembre"); break;
			case 12: System.out.println("Diciembre"); break;
		}
		
	}
		
	public void ComprobarDia(){
		
		switch(this.mes){
		case 1: 
			if ((this.dia<1) || (this.dia>31)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		case 2: 
			if ((this.dia<1) || (this.dia>28)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		case 3: 
			if ((this.dia<1) || (this.dia>31)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		case 4: 
			if ((this.dia<1) || (this.dia>30)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		case 5: 
			if ((this.dia<1) || (this.dia>31)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		case 6: 
			if ((this.dia<1) || (this.dia>30)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		case 7: 
			if ((this.dia<1) && (this.dia>31)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		case 8: 
			if ((this.dia<1) || (this.dia>31)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		case 9: 
			if ((this.dia<1) || (this.dia>30)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		case 10: 
			if ((this.dia<1) || (this.dia>31)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
		}
		case 11: if ((this.dia<1) || (this.dia>30)){ 
			System.out.println("El formato de día que ha sido introducido no es correcto");
			break;
		}
		case 12:
			if ((this.dia<1) || (this.dia>31)){ 
				System.out.println("El formato de día que ha sido introducido no es correcto");
				break;
			}
		
		}
		
	}
		
	public void ComprobarEstacion (){
		switch(this.mes){
			case 1: System.out.println("Invierno"); break;
			case 2: System.out.println("Invierno"); break;
			case 3: System.out.println("Invierno"); break;
			case 4: System.out.println("Primavera"); break;
			case 5: System.out.println("Primavera"); break;
			case 6: System.out.println("Primavera"); break;
			case 7: System.out.println("Verano"); break;
			case 8: System.out.println("Verano"); break;
			case 9: System.out.println("Verano"); break;
			case 10: System.out.println("Otoño"); break;
			case 11: System.out.println("Otoño"); break;
			case 12: System.out.println("Otoño"); break;
		}	
	}
	
	public int DiasDelMes (int contador){
		
		switch(this.mes){
			case 1: contador=31;break;
			case 2: contador=28;break;
			case 3: contador=31;break;
			case 4: contador=30;break;
			case 5: contador=31;break;
			case 6: contador=30;break;
			case 7: contador=31;break;
			case 8: contador=31;break;
			case 9: contador=30;break;
			case 10: contador=31;break;
			case 11: contador=30;break;
			case 12: contador=31;break;
		}	
		return contador;
	}
	
	public void FinAño (){
		
		int i=this.mes+1;
		for (this.mes=i;this.mes<13;this.mes++){
			ImprimirMes();
		}	
		
	}
	
	public void ImprimirFecha(){

		System.out.println(this.dia + "/" + this.mes + "/" + this.anyo);
		
	}
	
	public void IprimirFinFecha (){
		
		
		int i=this.dia+1;
		for (this.dia=i;this.dia<=DiasDelMes(this.mes);this.dia++){
			ImprimirMes ();
		}
		
	}
	
	public void MismosDias(){
		
		int valor=DiasDelMes(this.mes);
		int i;
		for (i=1;i<13;i++){
			if(DiasDelMes(i)==valor){
				ImprimirMes();
			}
		}
	}	
	
	public void PrincipioAño(){
	
		int contador=0;	

		for(int i=1;i<this.mes;i++){
			contador=contador+DiasDelMes(i);
			
		}
		System.out.println(contador);
		contador=contador+this.dia;
		System.out.println(contador);
		
		
	}
}
	