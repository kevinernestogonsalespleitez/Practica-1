/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Entrada extends Procesamiento {
    void Obtencion(){
        int exponente;
        float base;
        Scanner ob1 = new Scanner(System.in);
        System.out.println("Digite el exponente.(Entero)");
        exponente = ob1.nextInt();
        System.out.println("Digite la base.(Decimal)");
        base = ob1.nextFloat();
        Procesamiento ob3 = new Procesamiento();
        ob3.operacion(exponente, base);
    }
}
