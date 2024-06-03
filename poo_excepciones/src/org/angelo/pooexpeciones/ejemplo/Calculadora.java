package org.angelo.pooexpeciones.ejemplo;

public class Calculadora {
    public double dividir (int numerador, int dividendo) throws DivisionPorCeroException {
        if(dividendo == 0){
            throw new DivisionPorCeroException("no se puede dividir por cero!");
        }
        return numerador / (double)dividendo;
    }

    public double dividir(String numerador,String divisor) throws DivisionPorCeroException,
            FormatoNumeroException{
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num,div);

        } catch(NumberFormatException e){
            throw new FormatoNumeroException("Debe ingresar un numero en el numerador y divisor");
        }



    }
}
