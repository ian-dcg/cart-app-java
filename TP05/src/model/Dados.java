package model;

/**
 * Esta classe cont�m dados que ser�o inseridos ou modificados na execu��o do programa.
 * @author Ian e Jo�o
 * @version 1.0 (28/04/2021)
 */

public class Dados {
	private Itens[] itens = new Itens[50];
	private int qtdItens = 0;
	
	/**
	 * m�todo que preenche o JList com dados aleat�rios pr� cadastrados
	 */
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			if (i == 0) {
				itens[i] = new Itens("Arroz", 20, "Comidas", "Pacote", 2);		
			} else if (i == 1){
				itens[i] = new Itens("Feij�o", 10, "Comidas", "Pacote", 1);	
			} else if (i == 2){
				itens[i] = new Itens("Leite", 5, "Lact�cinios", "Caixa", 5);	
			} else if (i == 3) { 
				itens[i] = new Itens("P�o", 2, "Padaria", "Unidades", 10);	
			}  else if (i == 4) { 
				itens[i] = new Itens("Carne", 20, "A�ougue", "kg", 1);	
			}
			//CASOS GERAIS
			//itens[i] = new Itens("Produto"+i, (i+1)*100, "Setor"+i, "Unidade"+i, (i+1)*1);	
				
		}
		
		qtdItens = 5;
		
	}


	public Itens[] getItens() {
		return itens;
	}


	public void setItens(Itens[] itens) {
		this.itens = itens;
	}
	 
	/**
	 * m�todo que acrescenta em 1 o n�mero de itens para cada item criado
	 * @param i
	 * @param pos
	 */
	public void inserirEditaItem(Itens i, int pos) {
		this.itens[pos] = i;
		if(pos == qtdItens) qtdItens++;
	}


	public int getQtdItens() {
		return qtdItens;
	}


	public void setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
	}

	
}
