public abstract class Aircraft {

  private int maxAmmo;
  private int baseDamage;
  private int currentAmmo;
  private int allDamage;
  private String type;
  private boolean priority;


  public String getStatus() {
    return "Type: " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " +
            allDamage;
  }

  public void fight() {
    allDamage = this.currentAmmo * this.baseDamage;
  }

  public void refill(int number) {
    if (maxAmmo <= currentAmmo + number) {
      currentAmmo = maxAmmo;
    } else {
      currentAmmo += number;
    }
  }

  //-----------getters - setters-----------------

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public String getType() {
    return type;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int getAllDamage() {
    return allDamage;
  }

  public void setAllDamage(int allDamage) {
    this.allDamage = allDamage;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setPriority(boolean priority) {
    this.priority = priority;
  }

  public boolean isPriority() {
    return priority;
  }
}


