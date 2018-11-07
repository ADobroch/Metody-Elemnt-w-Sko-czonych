import java.io.FileNotFoundException;

public class main  {

    public static void main(String[] args) throws FileNotFoundException {
        globalData gData = new globalData();
        Grid grid = new Grid(gData.getnH(), gData.getnB());
        grid.setDane(gData);
        grid.generate(gData.getnH(), gData.getnB(), gData.getH(), gData.getB());
        grid.printGrid();

        double[] x = new double[4];
        double[] y = new double[4];
        int size = gData.getnH() * gData.getnB(); //ilosc wezlow w siatce

        double[][] H = new double[size][size];
        double[] P = new double[size];

        double[][] dn_dx = new double[4][4];
        double[][] dn_dy = new double[4][4];
        double[][] tmp_H = new double[4][4];
        double[] tmp_P = new double[4];
        double t0 = 0.0, c_matrix_i = 0.0;
        double[] t1 = new double[size];
        double dt = gData.getDt();



        for (int t = 0;t<gData.getTproc();t+=dt){                   ///po czasie

            for (int el = 0; el < grid.getNe(); el++){              //po elementach

            }
        }

    }

}
