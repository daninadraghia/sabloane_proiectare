public class VisitorStatistics implements Visitor{

    int nrTXT=0;
    @Override
    public void visitDirector(Director _Director) {

    }

    @Override
    public void visitFisier(Fisiere _Fisier) {

    }

    //de fiecare data cand se viziteaza un visier TXT
    @Override
    public void visitFisierTXT(FIsierTXT _FisierTXT) {
        nrTXT += 1;
    }

    @Override
    public void visitFisierMP3(FisierMP3 _FisierMP3) {

    }

    @Override
    public void visitFisierSVG(FisierSVG _FisierSVG) {

    }

    public void print(){
        System.out.println("Numar fisiere txt: " + nrTXT);
    }
}
