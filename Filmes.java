package cesmac.ads.poo.cinema;

import java.util.Scanner;

public class Filmes {

    Scanner input = new Scanner(System.in);
    boolean filmes3D;
    int escolhaResumo;

    String[] AOrigem = {"3D","A Origem", "Diretor: Christopher Nolan", "Gênero: Ação/Suspense","Dom Cobb é um ladrão com a rara habilidade de roubar segredos do inconsciente, obtidos durante o estado de sono. Impedido de retornar para sua família, ele recebe a oportunidade de se redimir ao realizar uma tarefa aparentemente impossível: plantar uma ideia na mente do herdeiro de um império."};
    String[] Velozesefuriosos = {"3D","Velozes e furiosos","Gênero: Ação","Direção: Vin Diesel, Justin Lin", "Brian O'Conner é um policial que se infiltra no submundo dos rachas de rua para investigar uma série de furtos. Enquanto tenta ganhar o respeito e a confiança do líder Dom Toretto, ele corre o risco de ser desmascarado."};
    String[] Interestelar = {"3D","Interestelar","Gênero: Ficção científica/Aventura","Diretor: Christopher Nolan", "As reservas naturais da Terra estão chegando ao fim e um grupo de astronautas recebe a missão de verificar possíveis planetas para receberem a população mundial, possibilitando a continuação da espécie. Cooper é chamado para liderar o grupo e aceita a missão sabendo que pode nunca mais ver os filhos"};
    String[] MadMax = {"3D","Mad Max","Genero: Ação/Aventura","Direção: George Ogilvie, George Miller", "Mad Max, se passando em um vasto deserto de um futuro pós-apocalíptico onde gasolina e água são bens valiosos. Ele segue a história de Max Rockatansky, que se junta a Imperatriz Furiosa para fugir do líder cultista Immortan Joe e seu exército dentro de um caminhão tanque."};

    String[][] filmes = {AOrigem, Velozesefuriosos, Interestelar, MadMax};

    String[] sessao = {"\nSessões:", "1 - 13:00", "2 - 15:00", "3 - 16:00", "4 - 20:00", "5 - 21:00"};

    String selecaofilme(){

        System.out.println("Em cartaz");
        exibir();
        System.out.println("Escolha o filme desejado: ");
        int escolha1 = input.nextInt()-1;
        escolhaResumo = escolha1;
        if (filmes3D){
            return filmes[escolha1][0] + " " + filmes[escolha1][1];
        }else{
            return filmes[escolha1][1];
        }
    }

   void exibir() {

        if (filmes3D) {

            for (int i = 0; i < filmes.length; i++) {
                for (int j = 0; j < filmes.length; j++) {
                    if (j == 0) System.out.println((i+1)+" - "+filmes[i][j]+" "+filmes[i][1]);
                }
            }
        }else{
            for (int i = 0; i < filmes.length; i++) {
                for (int j = 0; j < filmes.length; j++) {
                    if (j == 1) System.out.println((i+1)+" - "+filmes[i][j]);
                }
            }

        }

    }

    public String escolhaDeSessão() {
        for (String num:sessao) {
            System.out.println(num);
        }

        System.out.println("Escolha a sessão desejada: ");
        int escolha = input.nextInt();

        return sessao[escolha];
    }

    public void filmeResumo() {
        int x = 0;
        for (String[] ignored : filmes) {

            x++;
            if (x > 5) break;
            if (x == 1) System.out.println("Filme: "+filmes[escolhaResumo][x]);
            else System.out.println(filmes[escolhaResumo][x]);
        }
    }

}





