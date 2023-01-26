public class Main {
    public static void main(String[] args) {
        Director d1 = new Director("Director Principal Danina");
        Director d2 = new Director("Director1.1 Danina");
        Fisiere f1 = new Fisiere("F1");
        Fisiere f2 = new Fisiere("F2");
        Fisiere f3 = new Fisiere("F3");
        Fisiere f4 = new Fisiere("F4");

        d1.add(f1);
        d1.add(f2);
        d2.add(f3);
        d2.add(f4);
        d1.add(d2);

        FIsierTXT f11 = new FIsierTXT("Tema Matematica");
        FisierMP3 f22 = new FisierMP3("Queen");
        FisierSVG f33 = new FisierSVG("Image1");
        FIsierTXT f44 = new FIsierTXT("New Tasks");
        FisierSVG f55 = new FisierSVG("Image2");
        FisierMP3 f66 = new FisierMP3("Music1");
        FIsierTXT f77 = new FIsierTXT("Tema SP");


        f1.add(f11);
        f1.add(f22);
        f1.add(f33);

        f2.add(f44);
        f2.add(f55);

        f3.add(f66);
        f4.add(f77);

        VisitorStatistics vs = new VisitorStatistics();
        d1.accept(vs);
        d1.print();
        System.out.println();
        vs.print();
    }
}
