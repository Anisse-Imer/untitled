package LIFO.Statique;
public class UtilisationPileS {

    public void DATAOUT(){

    }
    public static void main(String[] args) {
        try {
            PileS p = new PileS(4);
            System.out.println(p.toString());
            p.Push(2);
            p.Push(7);
            p.Push(2);
            p.Push(7);
            System.out.println(p.toString());
        } catch (Exception e){
            System.out.println(e);
        }
        try {
            PileD d = new PileD();
            d.Push("La ");
            d.Push("sauvagerie ");
            d.Push("au micro");
            d.Push(".");
            System.out.println(d.toString());
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
