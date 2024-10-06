package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {


	@Test
	void testCalculoNominaBruta() {
		
	}

	@Test
	void testCalculoNominaNeta() {
	}
	
  // Pruebas para el método calculoNominaBruta

		@Test
		void testCalculoNominaBruta_Vendedor_LimiteInferiorSinPrima(TestInfo info){
// al ponerlo como parametro junit le proporciona la informacion de la prueba que se esta ejecutando 
			float expected = 2000;
			float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 999, 0);
	        assertEquals(expected, actual);
	    }

	    @Test
	    void testCalculoNominaBruta_Vendedor_LimiteSuperiorSinPrima(TestInfo  info) {
	    	float expected = 2100;
	    	float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1000, 0);
	        assertEquals(expected, actual);
	    }

	    @Test
	    void testCalculoNominaBruta_Vendedor_LimiteInferiorPrima200(TestInfo  info) {
	    	float expected = 2100;
	    	float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1499, 0);
	        assertEquals(expected, actual);
	    }

	    @Test
	    void testCalculoNominaBruta_Vendedor_LimiteSuperiorPrima200(TestInfo  info) {
	    	float expected = 2200;
	    	float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1500, 0);
	        assertEquals(expected, actual );
	    }

	    @Test
	    void testCalculoNominaBruta_Vendedor_ConHorasExtra(TestInfo  info) {
	    	float expected = 2230;
	    	float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1500, 1);
	        assertEquals(expected, actual);
	    }

	    // Pruebas para el tipo Encargado
	    @Test
	    void testCalculoNominaBruta_Encargado_LimiteInferiorSinPrima(TestInfo  info) {
	    	float expected = 2100;
	    	float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 999, 0);
	        assertEquals(expected, actual );
	    }

	    @Test
	    void testCalculoNominaBruta_Encargado_LimiteSuperiorSinPrima(TestInfo  info) {
	    	float expected = 2100;
	    	float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 0);
	        assertEquals(expected, actual);
	    }

	    @Test
	    void testCalculoNominaBruta_Encargado_LimiteInferiorPrima200(TestInfo  info) {
	    	float expected = 2600;
	    	float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1499, 0);
	        assertEquals(expected, actual );
	    } 

	    @Test
	    void testCalculoNominaBruta_Encargado_LimiteSuperiorPrima200(TestInfo  info) {
	    	float expected = 2700;
	    	float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1500, 0);
	        assertEquals(expected, actual );
	    }

	    @Test
	    void testCalculoNominaBruta_Encargado_ConHorasExtra(TestInfo  info) {
	    	float expected = 2730;
	    	float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1500, 1);
	        assertEquals(expected, actual);
	    }

	    // Pruebas para el método calculoNominaNeta

	    @Test
	    void testCalculoNominaNeta_SinRetencion_LimiteInferior(TestInfo  info) {
	    	float expected = 2099;
	    	float actual = Empleado.calculoNominaNeta(2099);
	        assertEquals(expected, actual);
	    }

	    @Test
	    void testCalculoNominaNeta_ConRetencion15_LimiteInferior(TestInfo  info) {
	    	float expected = 1785;
	    	float actual = Empleado.calculoNominaNeta(1785);
	        assertEquals(expected, actual);
	    }

	    @Test
	    void testCalculoNominaNeta_ConRetencion15_LimiteSuperior(TestInfo  info) {
	    	float expected = 2499;
	    	float actual =  Empleado.calculoNominaNeta(2499);
	        assertEquals(expected, Empleado.calculoNominaNeta(2499), 0.01);
	    }

	    @Test
	    void testCalculoNominaNeta_ConRetencion18_Limite(TestInfo  info) {
	    	float expected = 2050;
	    	float actual = Empleado.calculoNominaNeta(2050);
	        assertEquals(expected, actual);
	    }

	    @Test
	    void testCalculoNominaNeta_ConRetencion18_JustoPorEncimaDelLimite(TestInfo  info) {
	    	float expected = 2050;
	    	float actual = Empleado.calculoNominaNeta(2050);
	        assertEquals(expected,actual) ;
	    }
	

	
}
