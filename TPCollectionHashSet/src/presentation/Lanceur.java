package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comment ajouter des elements � une Set et comment on ajoute des �l�ments au SET
		
				// declarer et initialiser la collection
				Set hash = new HashSet();
				hash.add(12);
				hash.add("stev");
				hash.add("toto");
				hash.add(12.5);
				hash.add(12);
				hash.add("toto");
				hash.add("stev");

				//parcours du set avec un foreach maintenant for avec Java 10
				System.out.println("parcours avec for");
				
				for (Object item : hash) {
					
					System.out.println(item);
					//item.notifyAll();

				}
				
				
				// parcours avec un iterator
				
				System.out.println("parcours avec iterator");

				
				Iterator it=hash.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}

	}

}
