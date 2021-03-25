public class Circulo_Teste{

    public static void main (String[] args)
    {
        Circulo c1 =new Circulo();
        Circulo c2 =new Circulo (1,2,5); 
        Circulo c3 =new Circulo(c2);

        System.out.println ("c3: " +c3.toString());
        System.out.println ("C2 ==C3? " + c2.equals(c3));
        c2.setRaio(10);
        System.out.println ("C2 ==C3? " + c2.equals(c3));
        System.out.println ("C2 area: " + c2.calculaArea());

    }
}