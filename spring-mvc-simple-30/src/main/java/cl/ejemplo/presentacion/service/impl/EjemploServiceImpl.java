package cl.ejemplo.presentacion.service.impl;

import org.springframework.stereotype.Service;

import cl.ejemplo.presentacion.service.IEjemploService;


@Service
public class EjemploServiceImpl implements IEjemploService {

    @Override
    public String getBienvenida(String language ) throws Exception {

    	//dummy sample:
    	return language;
    }


}

