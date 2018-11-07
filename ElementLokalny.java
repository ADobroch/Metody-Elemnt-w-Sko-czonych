
public class ElementLokalny {

    LocalNode[] ID_lokalne;

    double pochodna_dNdKsi[][];
    double pochodnad_NdEta[][];


    double N[][];             //funkcje kształtu

    public ElementLokalny(){

        pochodnad_NdEta = new double[4][4];
        pochodna_dNdKsi = new double[4][4];
        ID_lokalne = new LocalNode[4];
        N =  new double[4][4];

        ID_lokalne[0]= new LocalNode(-0.577,-0.577);
        ID_lokalne[1]= new LocalNode(-0.577,0.577);
        ID_lokalne[2]= new LocalNode(0.577,-0.577);
        ID_lokalne[3]= new LocalNode(0.577,0.577);


        for(int i=0;i<4;i++)
        {
            N[i][0]= N1(ID_lokalne[i].getKsi(), ID_lokalne[i].getEta());
            N[i][1]= N2(ID_lokalne[i].getKsi(), ID_lokalne[i].getEta());
            N[i][2]= N3(ID_lokalne[i].getKsi(), ID_lokalne[i].getEta());
            N[i][3]= N4(ID_lokalne[i].getKsi(), ID_lokalne[i].getEta());

        }

        for (int i =0;i<4;i++)
        {
            pochodna_dNdKsi[i][0] = dN1_dKsi(ID_lokalne[i].getEta());
            pochodna_dNdKsi[i][1] = dN2_dKsi(ID_lokalne[i].getEta());
            pochodna_dNdKsi[i][2] = dN3_dKsi(ID_lokalne[i].getEta());
            pochodna_dNdKsi[i][3] = dN4_dKsi(ID_lokalne[i].getEta());
        }

        for (int i=0;i<4;i++)
        {
            pochodnad_NdEta[i][0] = dN1_dKsi(ID_lokalne[i].getKsi());
            pochodnad_NdEta[i][1] = dN2_dKsi(ID_lokalne[i].getKsi());
            pochodnad_NdEta[i][2] = dN3_dKsi(ID_lokalne[i].getKsi());
            pochodnad_NdEta[i][3] = dN4_dKsi(ID_lokalne[i].getKsi());
        }


    }


    public double getpochodna_dNdKsi(int x, int y) {
        return pochodna_dNdKsi[x][y];
    }
    double getpochodnadNdEta(int x, int y) {
        return pochodnad_NdEta[x][y];
    }
    public double getN(int i, int j){
        return N[i][j];
    }

    //funkcje kształtu
    double N1(double ksi, double eta) {
        return 0.25 * (1 - ksi) * (1 - eta);
    }
    double N2(double ksi, double eta) {
        return 0.25 * (1 + ksi) * (1 - eta);
    }
    double N3(double ksi, double eta) {
        return 0.25 * (1 + ksi) * (1 + eta);
    }
    double N4(double ksi, double eta) {
        return 0.25 * (1 - ksi) * (1 + eta);
    }
    //pochodne funkcji kształtu po ksi
    double dN1_dKsi(double eta) {
        return -0.25 * (1 - eta);
    }
    double dN2_dKsi(double eta) {
        return 0.25 * (1 - eta);
    }
    double dN3_dKsi(double eta) {
        return 0.25 * (1 + eta);
    }
    double dN4_dKsi(double eta) {
        return -0.25 * (1 + eta);
    }
    //pochodne funkcji kształtu  po eta
    double dN1_dEta(double ksi) {
        return -0.25 * (1 - ksi);
    }
    double dN2_dEta(double ksi) {
        return -0.25 * (1 + ksi);}

    double dN3_dEta(double ksi) {
        return 0.25 * (1 + ksi);
    }
    double dN4_dEta(double ksi) {
        return 0.25 * (1 - ksi);
    }


}
