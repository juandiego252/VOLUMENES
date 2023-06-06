public class Figuras3D {
    private float lado;
    private float altura;
    private float base;
    private float radio;
    private double pi= 3.1416;

    public Figuras3D(float lado, float altura, float base, float radio) {
        this.lado = lado;
        this.altura = altura;
        this.base = base;
        this.radio = radio;
    }

    public Figuras3D(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }

    //setters and getters publicos el resto privado


    public Figuras3D(float lado) {
        this.lado = lado;
    }


    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float volumenCubo(int lado){
        return this.lado*this.lado*this.lado;
    }

    public float volumenPiramide(float base, float altura){
        return ((1/3)*this.altura*this.base);
    }

    public double voloumenEsfera(float radio){
        return ((4/3)*pi*this.radio*this.radio*this.radio);

    }

    public double volumenCilindo(float radio, float altura){
        return pi*this.radio*this.radio*altura;
    }

}
