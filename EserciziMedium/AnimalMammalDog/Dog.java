/*
Animal (astratta): name, protected int energy = 100, astratto String sound(), 
concreto void eat(int amount) che aumenta energy, e void speak() che stampa name + ": " + sound().
  Mammal extends Animal: campo bodyTemperature; override di eat che chiama super.eat(amount) ma con un bonus (es. +10%).
  Dog extends Mammal: sound() ritorna "Woof"; override di speak() che stampa "🐕 " + super.speak().
*/
package EserciziMedium.AnimalMammalDog;

public class Dog extends Mammal{
    
    public Dog(String name, int energy, double bodyTemperature)
    {
        super(name, energy, bodyTemperature);
    }
    public String sound()
    {
        return "Woof";
    }

    @Override 
    public void speak()
    {
        System.out.println("🐕 ");
        super.speak();
    }
}
