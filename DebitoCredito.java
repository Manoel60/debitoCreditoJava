import java.util.Scanner;

public class DebitoCredito
{
	private String nome;
	private	float saldo;
	Scanner input = new Scanner( System.in );
	

	//Aqui sera gravada o nome do corretista
	public void setNome( String nomeNovo )
	{	
		
		nome = nomeNovo;

	}

	//Aqui o saldo sera inicializado
	public void setSaldoInicial( float iniSaldo )
	{
		saldo = iniSaldo;
	}

	//
	public void novoLacamentos( int lancamento )
	{
		
		switch ( lancamento )
		{
			case 1:{

				System.out.println("Digite o saldo");
				float novoDebito = input.nextFloat();
				saldo -= novoDebito;
				break; 

			}

			case 2:{
				
				System.out.println("Digite o novo credito");
				float novoCredito = input.nextFloat();
				saldo += novoCredito;
				break;

			}
		}//fim do SWITCH

				
	}//fim do metodo novoLancamentos

	public float getSaldo()
	{
		return saldo;
	}

}//fim da classe