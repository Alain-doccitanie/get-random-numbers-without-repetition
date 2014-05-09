//-----------------------------------------------------------------------
//  AUTHOR	: Jean-Francois GAZET
//  WEB 	: http://www.jeffprod.com
//  TWITTER	: @JeffProd
//  MAIL	: jeffgazet@gmail.com
//  LICENCE	: Apache License Version 2.0, January 2004
//-----------------------------------------------------------------------

package random;

public class random {

	public static void main(String[] args)
		{
		// On cré une liste de x nombres (de 1 à x)
		Pioche maListe=new Pioche(3);
		
		// On en tire par exemple 6 au hasard
		// (la liste est réinitialisée automatiquement en fin de tirage)
		for(int i=0;i<6;i++)
			{
			System.out.println(maListe.getPif());
			// affichera par exemple : 3,1,2,1,3,2
			}
		}
	
}
