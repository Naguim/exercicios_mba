package br.com.fiap.main;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import org.apache.camel.builder.RouteBuilder;

public class ReadQueue {

	public static void main(String[] args) throws Exception {
		CamelContext ctx = new DefaultCamelContext();
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://0.0.0.0:61616");

		ctx.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		ctx.addRoutes(new RouteBuilder() {
			public void configure() {
				from("jms:fiap31scj")
				.to("file:/home/ibm/Exercicios/OutputFolder");
			}
		});
		
		ctx.start();
		Thread.sleep(100000);
		ctx.stop();

	}

}
