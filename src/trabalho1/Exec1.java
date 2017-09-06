package trabalho1;

public class Exec1 {

    private Integer[][] matrizDirigido;
    private Integer[][] matrizNaoDirigido;
    private Integer[][] matrizMultigrafo;
    private Integer[][] matrizMultigrafo2;

    public Exec1() {
        matrizNaoDirigido = new Integer[4][4];
        matrizDirigido = new Integer[4][4];
        matrizMultigrafo = new Integer[4][4];
        matrizMultigrafo2 = new Integer[4][4];

        matrizNaoDirigido[0][0] = 0; matrizNaoDirigido[0][1] = 1; matrizNaoDirigido[0][2] = 1; matrizNaoDirigido[0][3] = 1;
        matrizNaoDirigido[1][0] = 1; matrizNaoDirigido[1][1] = 0; matrizNaoDirigido[1][2] = 1; matrizNaoDirigido[1][3] = 0;
        matrizNaoDirigido[2][0] = 1; matrizNaoDirigido[2][1] = 1; matrizNaoDirigido[2][2] = 0; matrizNaoDirigido[2][3] = 1;
        matrizNaoDirigido[3][0] = 1; matrizNaoDirigido[3][1] = 0; matrizNaoDirigido[3][2] = 1; matrizNaoDirigido[3][3] = 0;

        matrizDirigido[0][0] = 0; matrizDirigido[0][1] = 0; matrizDirigido[0][2] = 0; matrizDirigido[0][3] = 1;
        matrizDirigido[1][0] = 1; matrizDirigido[1][1] = 0; matrizDirigido[1][2] = 0; matrizDirigido[1][3] = 0;
        matrizDirigido[2][0] = 0; matrizDirigido[2][1] = 1; matrizDirigido[2][2] = 0; matrizDirigido[2][3] = 0;
        matrizDirigido[3][0] = 0; matrizDirigido[3][1] = 1; matrizDirigido[3][2] = 1; matrizDirigido[3][3] = 0;

        matrizMultigrafo[0][0] = 0; matrizMultigrafo[0][1] = 1; matrizMultigrafo[0][2] = 1; matrizMultigrafo[0][3] = 1;
        matrizMultigrafo[1][0] = 1; matrizMultigrafo[1][1] = 0; matrizMultigrafo[1][2] = 1; matrizMultigrafo[1][3] = 0;
        matrizMultigrafo[2][0] = 1; matrizMultigrafo[2][1] = 1; matrizMultigrafo[2][2] = 1; matrizMultigrafo[2][3] = 1;
        matrizMultigrafo[3][0] = 1; matrizMultigrafo[3][1] = 0; matrizMultigrafo[3][2] = 1; matrizMultigrafo[3][3] = 0;

        matrizMultigrafo2[0][0] = 0; matrizMultigrafo2[0][1] = 1; matrizMultigrafo2[0][2] = 1; matrizMultigrafo2[0][3] = 2;
        matrizMultigrafo2[1][0] = 1; matrizMultigrafo2[1][1] = 0; matrizMultigrafo2[1][2] = 1; matrizMultigrafo2[1][3] = 0;
        matrizMultigrafo2[2][0] = 1; matrizMultigrafo2[2][1] = 1; matrizMultigrafo2[2][2] = 0; matrizMultigrafo2[2][3] = 1;
        matrizMultigrafo2[3][0] = 2; matrizMultigrafo2[3][1] = 0; matrizMultigrafo2[3][2] = 1; matrizMultigrafo2[3][3] = 0;

    }

    public String retornaTipo(Integer[][] matriz){
        String retorno = "";
        int linha = 0;
        int coluna = 0;

        outerloop:

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (((i == j) && (matriz[i][j] > 0)) || (matriz[i][j] > 1)) {
                    retorno = "Multigrafo";
                    break outerloop;
                } else {
                    retorno = "Simples";
                }
            }
        }

        int index = 0;
        boolean dirigido = false;
        while(index < matriz.length){

            for (int i = 0; i < matriz.length; i++) {
                linha += matriz[i][index];
                coluna += matriz[index][i];
            }

            if(linha != coluna){
                dirigido = true;
            }

            index++;

        }

        if(dirigido){
            retorno += ", Dirigido";
        } else {
            retorno += ", Não Dirigido";
        }

        return retorno;

    }

    public Integer[][] getMatrizDirigido() {
        return matrizDirigido;
    }

    public void setMatrizDirigido(Integer[][] matrizDirigido) {
        this.matrizDirigido = matrizDirigido;
    }

    public Integer[][] getMatrizNaoDirigido() {
        return matrizNaoDirigido;
    }

    public void setMatrizNaoDirigido(Integer[][] matrizNaoDirigido) {
        this.matrizNaoDirigido = matrizNaoDirigido;
    }

    public Integer[][] getMatrizMultigrafo() {
        return matrizMultigrafo;
    }

    public void setMatrizMultigrafo(Integer[][] matrizMultigrafo) {
        this.matrizMultigrafo = matrizMultigrafo;
    }

    public Integer[][] getMatrizMultigrafo2() {
        return matrizMultigrafo2;
    }

    public void setMatrizMultigrafo2(Integer[][] matrizMultigrafo2) {
        this.matrizMultigrafo2 = matrizMultigrafo2;
    }
}
