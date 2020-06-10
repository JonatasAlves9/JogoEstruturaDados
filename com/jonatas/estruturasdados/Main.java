package com.jonatas.estruturasdados;

import mvc.controller.ControllerInicial;
import mvc.view.TelaInicial;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		TelaInicial tela1 = new TelaInicial();
		tela1.setVisible(true);
		new ControllerInicial(tela1);
		
		
		
	}

}
