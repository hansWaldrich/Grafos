import trabalho1.Exec1;

public class Main {

    public static void main(String[] args){
        Exec1 ex = new Exec1();

        System.out.println(ex.retornaTipo(ex.getMatrizDirigido()));
        System.out.println(ex.retornaTipo(ex.getMatrizNaoDirigido()));
        System.out.println(ex.retornaTipo(ex.getMatrizMultigrafo()));
        System.out.println(ex.retornaTipo(ex.getMatrizMultigrafo2()));

    }
}
