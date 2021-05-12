/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;


public class trabajadores {
    
     private int codigo;
     private String nombres; 
     private double Salario_hora;
     private int cantidad_horas_trabajadas;
     private double total;
     
     
    public trabajadores() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getSalario_hora() {
        return Salario_hora;
    }

    public void setSalario_hora(double Salario_hora) {
        this.Salario_hora = Salario_hora;
    }

    public int getCantidad_horas_trabajadas() {
        return cantidad_horas_trabajadas;
    }

    public void setCantidad_horas_trabajadas(int cantidad_horas_trabajadas) {
        this.cantidad_horas_trabajadas = cantidad_horas_trabajadas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //para calcular salario total
    
    public void totalsalario(){
        total = Salario_hora * cantidad_horas_trabajadas;
    }
     
     
    
}
