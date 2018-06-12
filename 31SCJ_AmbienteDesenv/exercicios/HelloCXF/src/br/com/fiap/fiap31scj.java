package br.com.fiap;

import javax.jws.WebService;

@WebService(targetNamespace = "http://fiap.com.br/", endpointInterface = "br.com.fiap.fiap31scjSEI", portName = "fiap31scjPort", serviceName = "fiap31scjService")
public class fiap31scj implements fiap31scjSEI {
	public String WhatIsTheAnswer(String interviewer) {
		return "The Answer, " + interviewer + " is 42 ";
	}
}