package presentation;

import java.util.List;
import java.util.Vector;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comment ajouter des elements � une List et comment on ajoute des �l�ments � la liste
		
		// declarer et initialiser la collection
		List vect = new Vector();
		vect.add(12);
		vect.add("toto");
		vect.add(12.5);
		vect.add(12);
		
		// Parcours de la list
		
		for(int i=0; i<vect.size(); i++)
		{
			System.out.println("Donn�e � l'indice " + i + " = " + vect.get(i));
		}
		
		//parcours de la liste avec un foreach maintenant for avec Java 10
		
		for (Object item : vect) {
			
			System.out.println(item);
			//item.notifyAll();

		}
	}

}
