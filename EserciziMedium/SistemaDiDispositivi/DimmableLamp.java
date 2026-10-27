/*
  Device (astratta): costruttore Device(String name, Room room), 
  turnOn(), turnOff(), isOn(), getName(), getRoomName(), e un metodo astratto double getWatts().
  Lamp extends Device: campo maxWatts; getWatts() ritorna maxWatts se accesa, altrimenti 0.
  DimmableLamp extends Lamp: campo brightness (0–100); setBrightness(int) 
  che aggiorna anche on (lampada spenta se brightness = 0); 
  override di turnOn() che, se brightness era 0, la porta a 10 (come nelle slide).
*/

package EserciziMedium.SistemaDiDispositivi;

public class DimmableLamp extends Lamp 
{
    private int brightness;

    public DimmableLamp( String nome, Room stanza, int watts, int brightness)
    {
        super(nome, stanza, watts);
        this.brightness=brightness;
    }

    public void setBrightness(int num)
    {
        if(num>=0&&num<=100)
        {
            if(!isOn())
            {
                turnOn();
            }
            if(isOn()&& num==0)
            {
                turnOff();
            }
            this.brightness=num;
        }
        
    }
    @Override 
    public void turnOn()
    {
        if(this.brightness==0)
        {this.brightness=10;}
        super.turnOn();
    }
}
