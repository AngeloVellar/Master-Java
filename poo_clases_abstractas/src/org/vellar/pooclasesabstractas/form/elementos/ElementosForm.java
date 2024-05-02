package org.vellar.pooclasesabstractas.form.elementos;

abstract public class ElementosForm {
    protected String valor;
    protected String nombre;

   public ElementosForm() {
   }

   public ElementosForm(String nombre) {
      this();
      this.nombre = nombre;
   }

   public void setValor(String valor) {
      this.valor = valor;
   }


   //Los meteodos de tipo abstractos NO LLEVAN LLAVES, solo ";"
   abstract public String dibujarHtml();
}
