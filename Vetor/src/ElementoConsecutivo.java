
public class ElementoConsecutivo {
	
	int[] vetor;
	int result;
	
	int i = 0;
	
	public ElementoConsecutivo()
	{
		
	}
	//podia fazer com while
	public int elementoConsecutivo(int[] valor) //seu pedido é uma ordem meu patrão.
	{
		while( i <valor.length)
		
		//for(int i = 0; i < valor.length; i++)
		{
			
			 
			if(valor[i] > valor[i+1])
			{
				//System.out.println("");
				i++;
				result = valor[i] + valor[i+1];
				
				if(valor[i] > valor[i+1])
				{
					
					result = result + valor[i+1];
					i++;
		//			this.elementoConsecutivo(valor);
					
				}
				//else
				//{
					//System.out.print("\nFim do elemento consecituvo.");
				//}
			
			}
			//percorrendo sistem mentalmente desgasta
			if(valor[i]< valor[i+1])
			{
				
				result = valor[i] + valor[i+1];
				i++;
				if(valor[i]< valor[i+1])
				{
					result = result + valor[i+1];
					i++;
	//				this.elementoConsecutivo(valor);
				}
	
				
			}
			
		}
	
		return result;
		
	}
	

}
