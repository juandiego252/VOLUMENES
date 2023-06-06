public class main {

    public static void main(String[] args) {

        Figuras3D cubo = new Figuras3D(5);
        Figuras3D piramide = new Figuras3D(3);
        Figuras3D esfera  = new Figuras3D(6);
        Figuras3D cilindro = new Figuras3D(7);

        cubo.setLado(5);
        System.out.println( cubo.volumenCubo(4));

        piramide.setBase(2);
        piramide.setAltura(5);
        System.out.println(piramide.volumenPiramide(2,5));

        esfera.setRadio(2);
        System.out.println(esfera.voloumenEsfera(5));

        cilindro.setRadio(5);
        cilindro.setAltura(7);
        System.out.println(cilindro.volumenCilindo(6,3));
    }



}
