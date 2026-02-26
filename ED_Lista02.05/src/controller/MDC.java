package controller;

public class MDC {

	public MDC() {
		super();
	}
	
	public int Primo(int num1, int num2) {
		
		int primo=0, aux, cte;
		
		if(num2>num1) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		// O MDC é calculado pelo produto dos números primos que dividem simultaneamente
		// Todos os números necessário. Portanto precisamos calcular os números primos
		// O número primo que dividirá será sempre menor ou igual ao menor número da conta
		// Portanto passaremos por todos os números, começando em 2, para verificar se é
		// Primo e divisor dos números desejados
		// Caso o contador(cte) passe de num2 (cte<=(num2+1), significa que não ha nenhum
		// Número primo menor que num2, logo este será o fim da operação
		for(cte=2; cte<=(num2+1); cte++) {
			
			if(num2%cte==0 && num1%cte==0) {
				primo = cte;
				break;
			}
		}
		
		if(cte>num2) return 1;
		
		return primo;
	}
	
	public int calcular(int num1, int num2) {
		
		int primo = Primo(num1, num2);
		
		// O ponto de parada é definido quando primo for igual a 1, pois significa que não
		// Há mais um número primo que seja divisor dos números desejados
		if(primo==1) return 1;
		
		return primo*calcular(num1/primo, num2/primo);
	}

}
