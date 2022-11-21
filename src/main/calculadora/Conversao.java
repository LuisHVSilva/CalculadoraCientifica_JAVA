package main.calculadora;

public class Conversao {
    double retorno;
    boolean flag = true;

    public double getRetorno() {
        return retorno;
    }

    public void setRetorno(double retorno) {
        this.retorno = retorno;
    }

    @Override
    public String toString() {
        if(flag){
            return "A temperatura é: " + getRetorno() + " F";
        }

        return "A temperatura é: " + getRetorno() + " K";
    }

    public void kelvin(double x){
        flag = false;
        setRetorno(x + 273.15);
    }

    public void fahrenheit (double x){
        setRetorno(((x - 32)*5)/9);
    }
}
