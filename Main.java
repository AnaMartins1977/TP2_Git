public class Main {
    public static void main(String[] args) {
        Automovel a1 = new Automovel("25-AB-41", "Toyota", 1400);
        System.out.println(a1.toString());
        ;
        System.out.println(a1.getMatricula());
        System.out.println(Automovel.getTotalAutomoveis());

        Automovel a2 = new Automovel("54-LV-29", "Fiat");
        System.out.println(a2.getMatricula());
        a2.setCilindrada(1800);
        System.out.println(a2.toString());
        System.out.println(Automovel.getTotalAutomoveis());

        System.out.println(a1.calcularDiferencaCilindrada(a2));
        if (a1.isCilindradaMaior(a2)) {
            System.out.println(a1.getMatricula());
        } else {
            System.out.println(a2.getMatricula());
        }
        System.out.println(a1.isCilindradaMaior(2000));

    }
}
