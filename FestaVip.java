// SO QUEM TA NA CLASSE VIP CONSEGUE COMER E BEBER
public class FestaVip{
    // <modificador> <tipo> <nome-atributo>
    private int quantidadeRefri = 30;
    private int quantidadeSalgado = 50;


    public void entrar(){ // metodo entra cahma os metodos privados
        beberRefri();
        comerSalgado();
        beberRefri();
    }

    // <modificador> <retorno-metodo> <nome_método>
    private void beberRefri(){
        quantidadeRefri--;
        System.out.println("Bebeu 1 copo de refri");
    }

    private void comerSalgado(){
        quantidadeSalgado--;
        System.out.println("Comeu 5 salgados");
    }
}