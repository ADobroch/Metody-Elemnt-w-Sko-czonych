
public class Jakobian {

    double Jak[][];
    double detJ;

    double point;

    ElementLokalny elem_lok;

    public Jakobian(ElementLokalny elem,int Point,double []x,double[]y){        //elemnt lokalny,punkt całkowania,wsp "X",wsp"Y"

        this.point = Point;
        this.elem_lok=elem;
        Jak = new double [2][2];


        Jak[0][0] = elem_lok.getpochodna_dNdKsi(Point,0) *x[0] +elem_lok.getpochodna_dNdKsi(Point,1)*x[1]+
                elem_lok.getpochodna_dNdKsi(Point,2) * x[2] + elem_lok.getpochodna_dNdKsi(Point,3)*x[3];

        Jak[0][1] = elem_lok.getpochodna_dNdKsi(Point,0) *y[0] +elem_lok.getpochodna_dNdKsi(Point,1)*y[1]+
                elem_lok.getpochodna_dNdKsi(Point,2) * y[2] + elem_lok.getpochodna_dNdKsi(Point,3)*y[3];

        Jak[1][0] = elem_lok.getpochodnadNdEta(Point,0) *x[0] +elem_lok.getpochodnadNdEta(Point,1)*x[1]+
                elem_lok.getpochodnadNdEta(Point,2) * x[2] + elem_lok.getpochodnadNdEta(Point,3)*x[3];

        Jak[1][1] = elem_lok.getpochodnadNdEta(Point,0) *y[0] +elem_lok.getpochodnadNdEta(Point,1)*y[1]+
                elem_lok.getpochodnadNdEta(Point,2) * y[2] + elem_lok.getpochodnadNdEta(Point,3)*y[3];




    }




    double[] pochodna_dNdX(int Point){
        double[] dndx = new double[4];
        for(int i=0;i<4;i++){
            dndx[i]= ((Jak[1][1]*elem_lok.getpochodna_dNdKsi(Point,i))-
                    (Jak[0][1]*elem_lok.getpochodnadNdEta(Point,i)))/detJ;
        }
        return dndx;
    }

    double[] pochodna_dNdY(int Point){
        double[] dndy = new double[4];
        for(int i=0;i<4;i++){
            dndy[i]= ((Jak[0][0]*elem_lok.getpochodnadNdEta(Point,i))-
                    (Jak[1][0]*elem_lok.getpochodna_dNdKsi(Point,i)))/detJ;
        }
        return dndy;
    }
}
