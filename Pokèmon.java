public class Pokèmon
{
    String nome;
    int ps;
    int atk;
    int def;

    Pokèmon(String nome, int ps, int atk, int def)
    {
        this.nome= nome;
        this.ps=ps;
        this.atk=atk;
        this.def=def;
    }

    int attack (Pokèmon p2)
    {
        int damage;
        damage=this.atk/p2.def;
        p2.ps= p2.ps-damage;

        System.out.println(this.nome+ " Attacca "+ p2.nome);
        return damage;
    }
    Move cut= new Move();

}