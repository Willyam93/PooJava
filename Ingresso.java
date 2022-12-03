package cesmac.ads.poo.cinema;

import java.util.Scanner;

public class Ingresso implements Lanchonete {
    Scanner input = new Scanner(System.in);
    boolean vipIngresso;
    private int valorTotalM;
    private int valorTotalI;
    private String filme;
    private String sessao;
    private int valorTotal;
    private int ingressoMeia = 12;
    private int ingressoInteira = 24;
    int comprarIngressos() {

        System.out.println("------Ingressos------\n" + "meia entra = R$ 12,00 / inteira = R$24,00");
        System.out.print("Digite quantos ingressos meia: ");
        int ingressoM = input.nextInt();
        System.out.print("Digite quantos ingressos inteira: ");
        int ingressoI = input.nextInt();
        if (!vipIngresso) {
            valorTotalM = ingressoMeia * ingressoM;
            valorTotalI = ingressoInteira * ingressoI;
        }else{
            valorTotalM = (ingressoMeia * 2) * ingressoM;
            valorTotalI = (ingressoInteira * 2) * ingressoI;
        }
        setValorTotal();
        return 0;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getFilme() {
        return filme;
    }

    public void setVipIngresso() {
        System.out.println("\nDeseja comprar igresso Vip: 1 - Sim / 2 - Não");
        int vipIngresso = input.nextInt();
        if (vipIngresso == 1) this.vipIngresso = true;

    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getSessao() {
        return sessao;
    }

    public boolean isVipIngresso() {
        return vipIngresso;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        this.valorTotal = valorTotalM+valorTotalI;
    }

    @Override
    public void acessoLanchonete() {
        System.out.println("\nO ingresso da categoria comum não possui acesso à lanchonete.");
    }
}
