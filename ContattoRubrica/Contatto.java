/*
Contatto + Rubrica
Contatto — classe immutabile con nome e numero di telefono (String). Espone solo nome() e numero().
*/
package ContattoRubrica;

public class Contatto {
    private final String nome;
    private final String numero;

    public Contatto( String nome, String numero)
    {
        this.nome=nome;
        this.numero=numero;
    }

    public String getnome()
    {
        return this.nome;
    }

    public String getnumero()
    {
        return this.numero;
    }
}
