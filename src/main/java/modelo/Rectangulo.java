package modelo;

public class Rectangulo {
    private int altura;
    private int base;

    public Rectangulo() {
    }
    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getArea(){
        return this.altura*this.base;
    }
}
