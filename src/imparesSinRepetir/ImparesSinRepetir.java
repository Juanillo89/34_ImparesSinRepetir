package imparesSinRepetir;

import java.util.Scanner;

public class ImparesSinRepetir
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[12];
		int aux;
		boolean repetido;
		for(int i = 0; i < numeros.length; i++) // Dará 12 vueltas cuando encuentre 12 impares no repetidos
		{
			do
			{
				System.out.print("Introduzca número: ");
				aux = sc.nextInt();
				repetido = false;
				if(aux % 2 != 0) // Si es impar se busca si está repetido
				{
					for(int j = 0; j < i && !repetido; j++)
					{
						if(numeros[j] == aux)
						{
							repetido = true;
						}
					}
					if(!repetido) // Si no está repetido se guarda en el array
					{
						numeros[i] = aux;
					}
				}
			}
			while(aux % 2 == 0 || repetido); // Si es par o esta repetido se vuelve a pedir número
		}
		sc.close();
	}
}

