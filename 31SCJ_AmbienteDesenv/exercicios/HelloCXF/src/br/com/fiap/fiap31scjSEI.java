package br.com.fiap;

import javax.jws.WebService;

@WebService(name = "fiap31scjSEI", targetNamespace = "http://fiap.com.br/")
public interface fiap31scjSEI {

	String WhatIsTheAnswer(String interviewer);

}