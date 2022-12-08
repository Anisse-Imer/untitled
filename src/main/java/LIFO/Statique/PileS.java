package LIFO.Statique;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class PileS {
    private final int taille;
    private int index;
    private int[] contenu;

    public PileS(int taille) throws InvalidParameterException{
        if(taille <= 0 )
            throw new InvalidParameterException("Taille invalide");
        index = -1;
        this.taille = taille;
        contenu = new int[taille];
    }

    public void Push(int val) throws StackFullException {
        if(StackFull())
            throw new StackFullException("Stack is full");
        index++;
        contenu[index] = val;
    }

    public void Pop() throws EmptyException{
        if(Empty())
            throw new EmptyException("Stack is empty");
        contenu[index] = 0;
        index = index - 1;
    }

    public boolean Empty(){
        return (index == -1 );
    }

    public boolean StackFull(){
        return (index == taille - 1);
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
