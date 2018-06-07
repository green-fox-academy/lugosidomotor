import java.util.ArrayList;
import java.util.List;

public class Carrier {

  private int ammoOfCarrier;
  private int healtOfCarrier;
  private List<Aircraft> aircrafts;

  public Carrier(int ammo, int healtPoint) {
    this.setAmmoOfCarrier(ammo);
    this.setHealtOfCarrier(healtPoint);
    this.setAircrafts(new ArrayList<>());
  }

  public void add(Aircraft aircraft) {
    aircrafts.add(aircraft);
  }

  public void fill() {
    int neededAmmo = 0;
    for (Aircraft aircraft : aircrafts) {
      neededAmmo += aircraft.getMaxAmmo() - aircraft.getCurrentAmmo();
      System.out.println(neededAmmo);
    }

    if (neededAmmo < ammoOfCarrier) {
      for (Aircraft aircraft : aircrafts) {
        aircraft.setCurrentAmmo(aircraft.getMaxAmmo());
      }
    } else if (neededAmmo > ammoOfCarrier) {
      for (Aircraft aircraft : aircrafts) {
        if (aircraft.isPriority()) {
          aircraft.setCurrentAmmo(aircraft.getMaxAmmo());
        } else {
          System.out.println("u are fucked");
        }
      }
    }
  }

  public void fight(Carrier enemy) {
    int attack = 0;

    for (Aircraft aircraft : aircrafts) {
      if (enemy.healtOfCarrier > 0) {
        attack += aircraft.getMaxAmmo() * aircraft.getBaseDamage();
        enemy.healtOfCarrier = enemy.healtOfCarrier - attack;
      } else {
        System.out.println("It's dead Jim :(");
      }
    }
  }

public void getSatus(){
    if (aircrafts.size() != 0) {

      for (Aircraft aircraft : aircrafts) {
        System.out.println("Type: " + aircraft.getType() + ", Ammo: " + aircraft.getCurrentAmmo() +
                " , Base Damage: " + aircraft.getBaseDamage() + " All Damage: " + aircraft.getAllDamage());
      }
    }else{
      System.out.println("Carrier is empty.");
      }
    }

  // ************* getters - setters ****************

  public int getAmmoOfCarrier() {
    return ammoOfCarrier;
  }

  public void setAmmoOfCarrier(int ammoOfCarrier) {
    this.ammoOfCarrier = ammoOfCarrier;
  }

  public int getHealtOfCarrier() {
    return healtOfCarrier;
  }

  public void setHealtOfCarrier(int healtOfCarrier) {
    this.healtOfCarrier = healtOfCarrier;
  }

  public List<Aircraft> getAircrafts() {
    return aircrafts;
  }

  public void setAircrafts(List<Aircraft> aircrafts) {
    this.aircrafts = aircrafts;
  }
}