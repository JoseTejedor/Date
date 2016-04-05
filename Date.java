
public class Date{
	public Date(int day,int month,int year){
		dia=day;
		mes=month;
		anyo=year;
	    
	}

	public int dia;
	public int mes;
	public int anyo;
	
	Date Date2 = new Date(dia,mes,anyo);
	Date Date3 = new Date(dia,mes,anyo);
	 
	int getDia(){
		return this.dia;
	}
	
	int getMes(){
		return this.mes;
	}
	
	int getAnyo(){
		return this.anyo;
	}

		
boolean isSameYear(Date Date2,Date Date3){
		 boolean b_comp = false;
		 if(Date2.getAnyo() == Date3.getAnyo()){
			 b_comp = true;
		 }
		 return b_comp;
		}

boolean isSameMonth(Date Date2,Date Date3){
	boolean b_comp = false;
	 if(Date2.getMes() == Date3.getMes()){
		 b_comp = true;
	 }
	 return b_comp;
	}
			
			
boolean isSameDay(Date Date2,Date Date3){
	boolean b_comp = false;
	 if(Date2.getDia() == Date3.getDia()){
		 b_comp = true;
	 }
	 return b_comp;
	}
	
	
boolean isSame(){
	
	
	
	}
}




