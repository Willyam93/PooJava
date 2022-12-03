package cesmac.ads.poo.cinema;

    public class IngressoVip extends Ingresso implements Lanchonete{

        @Override
        public void acessoLanchonete() {
            System.out.println("\nIngresso categoria Vip: acesso à lanchonete liberado!");
        }
}
