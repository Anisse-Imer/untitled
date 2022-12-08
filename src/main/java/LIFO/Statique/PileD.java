package LIFO.Statique;

import java.util.Arrays;

public class PileD {
    private int index;
    private String[] contenu;

    public PileD(){
        index = -1;
        contenu = null;
    }

    public void Push(String S ) throws Exception {
        if (index == - 1) {
            index++;
            contenu = new String[1];
            contenu[0] = S;
        }
        else{
            index++;
            String[] temp = new String[index + 1];
            for (int i = 0; i < index; i++) {
                temp[i] = contenu[i];
            }
            temp[index] = S;
            contenu = temp;
        }
    }

    public void Pop() throws EmptyException{
        if(Empty())
            throw new EmptyException("Stack is empty");
        contenu[index] = null;
        index = index - 1;
    }

    //bon
    public boolean Empty(){
        return (index == -1 );
    }

    @Override
    public String toString() {
        return "PileD{" +
                "index=" + index +
                ", S=" + Arrays.toString(contenu) +
                '}';
    }
}
