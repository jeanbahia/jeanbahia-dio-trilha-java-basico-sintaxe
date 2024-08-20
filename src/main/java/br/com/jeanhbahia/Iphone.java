package br.com.jeanhbahia;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
    private String modelo;
    
    private int capacidadeArmazenamento;

    public Iphone(String modelo, int capacidadeArmazenamento) {
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public void tocar() {
        System.out.println("Tocando m�sica...");
    }

    public void pausar() {
        System.out.println("Pausando m�sica...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando m�sica: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo p�gina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando p�gina...");
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}

	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
}
