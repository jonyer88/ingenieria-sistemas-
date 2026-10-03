package poo_noche8.Semana4;


public class CuentaBancaria {
    
    
    
    // Atributos de la clase CuentaBancaria
     
    private double saldo;
    private String titular;
    private  int numerocuenta;
    private String tipocuenta;
    private int clave;
    

    //constructor de la clese CuentaBancaria

    public CuentaBancaria(double saldo,String titular,int numerocuenta,String tipocuenta,int clave){

        this.saldo = saldo;
        this.titular = titular;
        this.numerocuenta = numerocuenta;
        this.tipocuenta = tipocuenta;
        this.clave = clave;



    }
    public String toString() {
        return "CuentaBancaria [ saldo: " + saldo + ", titular: " + titular + ", numero cuenta: " + numerocuenta + ", tipo cuenta: " + tipocuenta + ", clave: " + clave + " ]";
    }
}

