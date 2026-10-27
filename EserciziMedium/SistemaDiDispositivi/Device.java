/*
  Device (astratta): costruttore Device(String name, Room room), 
  turnOn(), turnOff(), isOn(), getName(), getRoomName(), e un metodo astratto double getWatts().
  Lamp extends Device: campo maxWatts; getWatts() ritorna maxWatts se accesa, altrimenti 0.
  DimmableLamp extends Lamp: campo brightness (0–100); setBrightness(int) che aggiorna anche on (lampada spenta se brightness = 0); override di turnOn() che, se brightness era 0, la porta a 10 (come nelle slide).
  */

package EserciziMedium.SistemaDiDispositivi;

abstract class Device 
{
    private String name;
    private Room room;
    private boolean state;
    public Device( String name, Room room)
    {
        this.name=name;
        this.room=room;
        this.state=false;
    }
    public void turnOn()
    {
        if(this.state== false)
        {this.state= true;}
        else
        {System.out.println("Already on");}
    }
    public void turnOff()
    {
        if(this.state==true)
        {this.state=false;}
        else
        {System.out.println("Already off");}
    }
    public boolean isOn()
    {
        return this.state;
    }
    public String getName()
    {
        return this.name;
    }
    public String getRoomName()
    {
        return this.room.getRoomName();
    }
    abstract double getWatts();
}