MatematicaDiscreta
==================
Classe que tem por objetivo a manipulação de conjuntos através dos seguintes métodos:

Construtores:

  public Conjunto():
		Cria um conjunto vazio

	public Conjunto(List<T> elementos):
		Cria um conjunto a partir de uma lista genperica de elementos

	public Conjunto(Conjunto conj):
		Cria um novo conjunto com os elementos de um conjunto existente

Manipulação de Conjuntos:

	public boolean estaVazio()
		Retorna true se o conjunto está vazio
	
	public int tamanho()
		Retorna o numero de elementos existentes no conjunto

	public void limparConjunto()
		Remove todos os elementos de um conjunto, deixando-o vazio

	public boolean eIgual(Conjunto conj)
		Compara dois conjuntos e retorna true se um conjunto estiver contido no outro e vice-versa

	public void adicionar(T e)
		Adiciona um elemento e ao conjunto

	public void adicionarTodos(List<T> l)
		Adiciona todos os elementos de uma lista ao conjunto

	public T elemento(int i)
		Retorna o elemento correspondente à posição "i" do conjunto

	public boolean contemElemento(T e)
		Retorna true se o elemento e estiver contido no conjunto

	public boolean estaContido(Conjunto conj)
		Retorna true se o conjunto que chamou o método estiver contido em "conj"

	public Conjunto uniao(Conjunto conj)
		Retorna um conjunto que é a união entre o conjunto que chamou o método e "conj"

	public Conjunto intersecao(Conjunto conj)
		Retorna um conjunto que é a intersecao entre o conjunto que chamou o método e "conj"

	public Conjunto diferenca(Conjunto conj)
		Retorna um conjunto que é a diferenca entre o conjunto que chamou o método e "conj"

	public Conjunto produtoCartesiano(Conjunto conj)
		Retorna um conjunto que é a diferenca entre o conjunto que chamou o método e "conj"


