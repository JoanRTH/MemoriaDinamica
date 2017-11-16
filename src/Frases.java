import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Frases {
    public void Uni (){
        ArrayList <String> Pregunta = new ArrayList<String>();
        String Fra, Res;
        do {            
            Fra = JOptionPane.showInputDialog(null,"Ingrese una palabra: ");
            Pregunta.add(Fra);
            
            Res=JOptionPane.showInputDialog(null, "¿Ingresara otra frase? SI/NO");
            Res = Res.toUpperCase();
        } while (!Res.equals("NO"));
        
        for(int i=0; i < Pregunta.size(); i++){
            System.out.println(Pregunta.get(i));
        }
        
    }   
}
