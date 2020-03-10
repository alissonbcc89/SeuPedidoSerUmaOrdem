import java.awt.print.Printable;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iniciaValores = {-12,6,-7,-8,1,-10,13,-14,-5,9,12,19,-17,19,0,-15,17,-12,-4,-4};
		
		ArrayList<Integer> somaConsec = new ArrayList<Integer>(); 
		int maximo = 0; 
		int result= 0;
		
		for(int i = 0; i < iniciaValores.length; i++)
		{ 
			System.out.print("\nValor de i:" + i + "\tResultado" + resultado);  
			for(int j = 19; j > 0; j--)
			{ 
				//System.out.print("\n Valor de j:" + j);
				if(j == 19)
				{
					
				result = iniciaValores[i] + iniciaValores[j];
				//System.out.print("\n Valor de j:" + j + "\tValor Soma:"+ result);
				}
				if(j<19)
				{
					result = result + iniciaValores[j];
				//	System.out.print("\n Valor de j:" + j + "\tValor Soma:"+ result);
				}
				if( j==i )
				{
			//		System.out.print("\n Valor de j:" + j + "\tValor Soma:"+ result);
					somaConsec.add(result);
				}				
			}
			
		}
		
		for(int i = 0; i < somaConsec.size(); i++)
		{
			if(i == 0)
			{
			maximo = somaConsec.get(i);
			}
			if(i > 0 &&  maximo < somaConsec.get(i))
			{
				maximo = somaConsec.get(i);
			}
			if(i > 0 &&  maximo > somaConsec.get(i))
			{
				maximo = maximo;
			}
		}
		
		
		System.out.print(maximo);
	}

}