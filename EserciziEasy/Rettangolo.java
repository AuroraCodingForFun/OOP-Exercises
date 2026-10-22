package EserciziEasy;
public class Rettangolo 
{
    private final double base;
    private final double altezza;
    public Rettangolo(int base, int altezza)
    {
        if(base<=0 || altezza<=0)
        {throw new IllegalArgumentException("Base e altezza devono essere > 0");}
        this.base=base;
        this.altezza=altezza;
    }

    public final double area()
    {
        return this.base*this.altezza;
    }

    public final double perimetro()
    {
        return 2*(this.base+this.altezza);
    }
    
}
