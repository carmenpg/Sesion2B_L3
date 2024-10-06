package pkg;


public class Empleado {
	
	public enum TipoEmpleado {Vendedor, Encargado};
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventaMes, float horasExtra) {
		
		
		float salarioBase = 0;
		float primas = 0;
		float extras = 0;
		
		//Determinar el salario base
		if(tipo ==TipoEmpleado.Encargado) {	
			
			salarioBase = 2500;
			
		}else if (tipo == TipoEmpleado.Vendedor) {
			
			salarioBase = 2000;
		}
		
		//Determinar las primas
		if(ventaMes >= 1500) {
			primas = 200;
		}else if(ventaMes >=1000) {
			primas = 100;
		}else {
			primas = 0;
		}
		
		
		//Determinar las horas extras
		extras = horasExtra *30;
		
		
		return salarioBase + primas + extras;
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		
		if(nominaBruta <0)
			nominaBruta = 0;
		float salarioNeto = 0, retencion = 0;
	
		if (nominaBruta >=2500) {
			retencion = 0.18f;
		}else if (nominaBruta > 2100 && nominaBruta < 2500) {
			retencion = 0.15f;
		}else if (nominaBruta <= 2100){
			retencion = 0;
			
		}
		return nominaBruta*(1-retencion);
	}

}

