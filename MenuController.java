package cesmac.ads.poo.cinema;

import java.util.Scanner;

public class MenuController {

    static Scanner input = new Scanner(System.in);
    static Ingresso exibir = new Ingresso();

    public static void main(String[] args) {

        Filmes filmes = new Filmes();
        IngressoVip ingressoVip = new IngressoVip();

        exibir.setFilme(filmes.selecaofilme());

        System.out.println(exibir.getFilme());
        exibir.setVipIngresso();
        exibir.comprarIngressos();

        exibir.setSessao(filmes.escolhaDeSessão());

        filmes.filmeResumo();
        System.out.println("\nSessão: "+ exibir.getSessao()+ "\nValor total: "+ exibir.getValorTotal());
        if (exibir.isVipIngresso()) ingressoVip.acessoLanchonete();
        else exibir.acessoLanchonete();



    }

}