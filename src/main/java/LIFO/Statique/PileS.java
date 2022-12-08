package LIFO.Statique;

import java.util.Arrays;

public class PileS {
    private int taille;
    private int index;
    private int[] contenu;

    public PileS(int taille) throws Exception{
        if(taille <= 0 )
            throw new Exception("Taille invalide");
        index = -1;
        this.taille = taille;
        contenu = new int[taille];
    }

    public void Push(int val) throws Exception {
        if(StackFull())
            throw new Exception("Stack is full");
        index++;
        contenu[index] = val;
    }

    public void Pop() throws Exception{
        if(Empty())
            throw  new Exception("Stack is empty");
        contenu[index] = 0;
        index = index - 1;
    }

    public boolean Empty(){
        if(index == -1 ){
            return true;
        }
        return false;
    }

    public boolean StackFull(){
        if(index == taille - 1){
            return true;
        }
        return false;
    }

    //Equivalent de Print
    @Override
    public String toString() {
        return "PileS{" +
                "taille=" + taille +
                ", index=" + index +
                ", contenu=" + Arrays.toString(contenu) +
                '}';
    }

}
