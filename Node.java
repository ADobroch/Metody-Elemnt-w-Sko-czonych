
public class Node {

    int id_wezla;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    double x;
   double y;

    public boolean isInside() {
        return isInside;
    }

    public void setInside(boolean inside) {
        isInside = inside;
    }



    boolean isInside;

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    double temperatura;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   boolean status;

    public int getID(int i) {
        return ID[i];
    }

    public void setID(int i, int j) {
        ID[0]=i;
        ID[1]=j;
    }

    int ID[];

    Node(){
        this.id_wezla = 0;
        this.x = 0;
        this.y = 0;
        this.status = false;
        this.temperatura = 0.;
        ID = new int[2];

    }
    Node(int _id, float _x, float _y, double _t, boolean _st){
        this.id_wezla = _id;
        this.x = _x;
        this.y = _x;
        this.temperatura = _t;
        this.status = _st;
    }
}
