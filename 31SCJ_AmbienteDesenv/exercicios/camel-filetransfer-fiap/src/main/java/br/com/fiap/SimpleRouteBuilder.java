package br.com.fiap;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		from("file:/home/ibm/Exercicios/inputFolder?noop=true").to("file:/home/ibm/Exercicios/outputFolder");
	}
}
