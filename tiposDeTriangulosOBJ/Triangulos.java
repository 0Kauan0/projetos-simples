public class Triangulos {
    private int ladoA;
    private  int ladoB;
    private  int ladoC;

    public Triangulos(int ladoA, int ladoB, int ladoc){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoc;
    }

    public int getLadoA(){
        return  ladoA;
    }
    public int getLadoB(){
        return  ladoB;
    }
    public int getLadoC(){
        return  ladoC;
    }

    public String eumTriangulo(){

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            if (ladoA == ladoB && ladoB != ladoC || ladoA == ladoC && ladoC != ladoB || ladoB == ladoC && ladoB != ladoA) {
                return "isósceles";
            } else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
                return "escaleno";
            } else {
                return "equilátero";
            }
        } else {
             return "Isso não é um triângulo";
        }
    }

}
