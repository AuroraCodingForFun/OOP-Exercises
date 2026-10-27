/*
Animal (astratta): name, protected int energy = 100, astratto String sound(), 
concreto void eat(int amount) che aumenta energy, e void speak() che stampa name + ": " + sound().
  Mammal extends Animal: campo bodyTemperature; override di eat che chiama super.eat(amount) ma con un bonus (es. +10%).
  Dog extends Mammal: sound() ritorna "Woof"; override di speak() che stampa "🐕 " + super.speak().
*/

package EserciziMedium.AnimalMammalDog;

abstract class Animal
{
    private String name;
    protected int energy;
    abstract String sound();

    public void eat(int amount)
    {
      if(this.energy+amount> 100)
      {this.energy=100;}
      else
      {this.energy+= amount;}
    }
    public void speak()
    {System.out.println(this.name + ": " + sound());}
}