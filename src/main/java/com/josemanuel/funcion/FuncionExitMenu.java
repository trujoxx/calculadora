package com.josemanuel.funcion;

import java.util.Scanner;
import java.util.function.Function;

import com.josemanuel.menu.ExitMenuException;

// Funcion para salir del menu de la calculadora
public class FuncionExitMenu implements Function<Scanner, Void>{

    @Override
    public Void apply(Scanner t) {
        
        throw new ExitMenuException();

        //return null;
    }
    
}
