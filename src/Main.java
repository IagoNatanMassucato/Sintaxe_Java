import POO.Model.Pessoas.Cliente;
import POO.Enum.Cargos;
import POO.Enum.TipoCliente;
import POO.Model.Pessoas.Funcionario;
import POO.Model.Produtos.Verdura;


public class Main {
    public static void main(String[] args) {
        /*
        Tipos Primitivos, Constante, Concatenação e Operadores.
         */
        System.out.println();
        System.out.println("Tipos Primitivos, Constante, Concatenação e Operadores");
        System.out.println();
        byte idade = 19;
        short velocidade = 180;
        int anoAtual = 2023;
        long documento = 48793120595L;
        float horario = 20.43F;
        double saldo = 3200;
        final double salario = 1300;
        int numero = 10;
        boolean ok = true;
        String comparacao = idade == velocidade ? "Sim" : "Não";
        System.out.println(comparacao);

        velocidade = (int)  300;
        System.out.println("Velocidade => "+velocidade+"Km");
        System.out.println("Valor Positivo => "+anoAtual);
        anoAtual = - anoAtual;
        System.out.println("Valor Negativo => "+anoAtual);
        anoAtual = anoAtual * -1;
        System.out.println("Valor => "+anoAtual);
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(--numero);
        System.out.println(ok);
        System.out.println(!ok);
        System.out.println("-----------------------------------");
        System.out.println();

        /*
        Programação Orientado a Objeto.
         */

        System.out.println("POO => Abstração, Encapsulamento, Herança, Enum, Interface e Polimorfismo");
        System.out.println();
        System.out.println("Funcionarios Cadastrados");
        System.out.println();
        Funcionario pessoa1 = new Funcionario("Iago Natan", 34879625495L, 687431286L, "Barra Bonita - SP",
                "27/01/2004", Cargos.TEC_INFORMATICA, "24/08/2022");
        Funcionario pessoa2 = new Funcionario("Lucas Ribeiro", 87642384195L, 741589461L, "Bauru - SP",
                "15/06/2000", Cargos.ALMOXARIFADO, "02/11/2013");
        Funcionario pessoa3 = new Funcionario("Matheus Oliveira", 19457835895L, 2147359768L, "Jaú - SP",
                "26/06/1995", Cargos.CONTADOR, "18/05/2018");
        Funcionario[] funcionarios = {pessoa1, pessoa2, pessoa3};
        pessoa1.infPessoa();
        pessoa2.infPessoa();
        pessoa3.infPessoa();

        System.out.println("Clientes Cadastrados");
        System.out.println();
        Cliente pessoa4 = new Cliente("Larisa de Cruz", 7531284691L, 247893075L, "Criciúma - RS",
                "24/06/1999", TipoCliente.PESSOA_FISICA);
        Cliente pessoa5 = new Cliente("Diego Soares", 6512789735L, 71328642L, "Salvador - BH",
                "08/11/2001", TipoCliente.PESSOA_FISICA);
        Cliente pessoa6 = new Cliente("Alan Fernando", 5389420103L, 749230801L, "Porto Velho - RO",
                "19/02/1986", TipoCliente.PESSOA_FISICA);
        Cliente pessoa7 = new Cliente("Beatriz de Luz", 9463080795L, 781255661L, "Criciúma - RS",
                "28/09/1992", TipoCliente.PESSOA_FISICA);
        Cliente[] clientes = {pessoa4, pessoa5, pessoa6};
        pessoa4.infPessoa();
        pessoa5.infPessoa();
        pessoa6.infPessoa();
        pessoa7.infPessoa();
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("Produtos Cadastrados");
        System.out.println();
        Verdura alface = new Verdura("Alface", "05/04/2023", "08/04/2023", 2.00, 150, 5);
        Verdura repolho = new Verdura("Repolho", "05/04/2023", "10/04/2023", 2.25, 150, 5);
        Verdura cebolinha = new Verdura("Cebolinha", "05/04/2023", "02/04/2023", 0.75, 200, 5);
        alface.infProduto();
        repolho.infProduto();
        cebolinha.infProduto();

        System.out.println();
        Verdura tomate = new Verdura("Tomate", "05/04/2023", "10/04/2023", 0.50, 220, 5);
        Verdura laranja = new Verdura("Laranja", "05/04/2023", "17/04/2023", 0.40, 400, 5);
        Verdura uva = new Verdura("Uva", "05/04/2023", "12/04/2023", 0.60, 250, 7);
        tomate.infProduto();
        laranja.infProduto();
        uva.infProduto();
        Verdura[] verduras = {alface, repolho, cebolinha};

    }
}