package aplicacion;

import mates.Funciones;
import persona.Persona;
import personas.Personas;

import java.time.LocalDate;
import java.util.List;
import java.util.function.DoubleUnaryOperator;

import static mates.Funciones.calculateIntegral;
import static mates.Funciones.integrateRectangles;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Ejercicio 13");
        DoubleUnaryOperator function = x -> Math.exp(x * x);
        int n = 100;
        double a = 0.1;
        double b = 1;
        double h = (b - a) / n;
        System.out.println("La integral vale aproximadamente" + integrateRectangles(function, a, b, n, h));

        System.out.println("Ejercicio 14");
        Funciones.apartado1();
        Funciones.apartado2();
        Funciones.apartado3();
        Funciones.apartado4();

        System.out.println("Ejercicio 15");
        System.out.println("1) La suma de los números hasta el 10 es " + Funciones.suma(10));
        System.out.println("2) El factorial del 5 es " + Funciones.factorial(5));
        System.out.println("3) La potencia n-ésima de un número es " + Funciones.potencia(2,2));
        List<Integer> lista1 = List.of(1,2,3,4);
        List<Double> lista2 = List.of(1.0,2.0,3.0,4.0);
        System.out.println("4) La suma de los elementos de la lista es " + Funciones.lista(lista1));
        System.out.println("5) La media de los elementos de la lista es " + Funciones.media(lista2));
        Funciones.desviacion(lista2);
        System.out.println("7) La suma de los primeros números pares hasta n asumiendo n ≥ 2 es " + Funciones.sumapares(9));
        System.out.println("8) La suma de los elementos pares de una lista de enteros " + Funciones.listaenteros(lista1));
        System.out.println("9) La nueva lista de números pares es " + Funciones.obtenerlistaenteros(lista1));
        System.out.println("10) La lista de los primeros números pares hasta n asumiendo n ≥ 2 son " + Funciones.listapares(9));
        List<Integer> lista3 = List.of(1,2,3);
        List<Integer> lista4 = List.of(2,4,6);
        System.out.println("11) Producto escalar: " + Funciones.productoescalar(lista3,lista4));
        System.out.println("12) Término n-ésimo de Fibonacci: " + Funciones.fibonachi(9));

        System.out.println("Ejercicio 16");
        System.out.println("La integral vale aproximadamente: " + calculateIntegral(function, a, b, n));

        System.out.println("Ejercicio 17");
        Persona.calcularEdad("Paco", LocalDate.of(1998, 4,23));
        Persona.calcularEdad("Ernesto", LocalDate.of(1987, 8,23));
        Personas persona1=new Personas("Paco", LocalDate.of(1998, 4,23));
        Personas persona2=new Personas("Ernesto", LocalDate.of(1987, 8,23));
        Personas.annadirPersona(persona1);
        Personas.annadirPersona(persona2);
        Personas.Mostrar();
        System.out.println("Persona más joven: " + Personas.masJoven() + ".");
        System.out.println("Suma de todas las edades: " + Personas.calcularSumaEdades()+ " años.");
        System.out.println("Edad mínima: " + Personas.calcularEdadMinima() + " años.");
        System.out.println("Edad media: " + Personas.calcularEdadMedia() + " años.");
    }
}