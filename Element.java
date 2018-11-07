
public class Element {

    public Node[] getID() {
        return ID;
    }

    Node [] ID;
    boolean []flag;
    boolean  []czyZewnetrzna;

    int []globalID;

    public Element() {
        ID = new Node[4];
        czyZewnetrzna = new boolean[4];
        globalID = new int[4];
    }

    void setID(Node a, Node b, Node c, Node d){
        ID[0]=a; ID[1]=b; ID[2]=c; ID[3]=d;
    }

    Node getID(int i){
        return ID[i];
    }




    public boolean getIsExternalSurface(int i) {
        return czyZewnetrzna[i];
    }

    public void setIsExternalSurface(int i, boolean b) {
        czyZewnetrzna[i] = b;
    }

    public int getgID(int i) {
        return globalID[i];
    }

    public void setgID(int a, int b, int c, int d){
        globalID[0]=a; globalID[1]=b; globalID[2]=c; globalID[3]=d;
    }
}
