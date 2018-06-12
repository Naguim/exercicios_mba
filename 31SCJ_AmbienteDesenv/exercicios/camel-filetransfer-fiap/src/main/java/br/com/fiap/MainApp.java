package br.com.fiap;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
		CamelContext ctx = new DefaultCamelContext();
				
		try {
			ctx.addRoutes(routeBuilder);
			ctx.start();
			Thread.sleep(5*60*100);
			ctx.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
