import java.util.Stack;

public class Pila {
    private Stack<Url>pila;

    public Pila() {
        pila = new Stack<>();
    }

    public boolean push(Url dato ){
        if(dato!=null){
            pila.push(dato);
            return true;
        }
        return  false;
    }

    public Url pop() throws Exception {
        if(pila.isEmpty())
            throw new Exception("No existen elementos");
        return  pila.pop();

    }

    public  Url peek() throws Exception {
        if(pila.isEmpty())
            throw new Exception("No hay elementos");
        return  pila.peek();
    }

    public int size(){
        return pila.size();
    }

    public String elementos(){
        StringBuilder sb=new StringBuilder();
        for (int i=pila.size()-1;i>=0;i--){
            sb.append(pila.get(i).toString()+"\n");
        }
        return sb.toString().length()!=0?sb.toString():"Pila vacia";
    }
}
