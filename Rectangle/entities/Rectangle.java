package entities;

import java.text.Format;

public class Rectangle {

    public double largura;
    public  double altura;


    public double area(){
        return altura * largura;

    }

    public  double perimetro(){
        return 2 * (altura * largura);
    }

    public double diagonal(){
        return Math.sqrt(altura * altura) + (largura * largura);
    }

    @Override
    public String toString() {
        return  String.format("Area: %.2f \n", area())
                +
                  String.format("perimetro: %.2f \n", perimetro())
                +
                  String.format("diagonal: %.2f \n ", diagonal());

    }
}
