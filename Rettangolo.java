public class Rettangolo 
{
    private final int base;
    private final int altezza;
    public Rettangolo(int base, int altezza)
    {
        if(base<=0 || altezza<=0)
        {throw new IllegalArgumentException("Base e altezza devono essere > 0");}
        this.base=base;
        this.altezza=altezza;
    }

    public final int area()
    {
        return this.base*this.altezza;
    }

    public final int perimetro()
    {
        return 2*(this.base+this.altezza);
    }
    
}
