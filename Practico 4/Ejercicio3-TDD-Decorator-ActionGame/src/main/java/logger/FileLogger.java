package logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import characters.Entity;
import weapons.Weapon;

public class FileLogger implements Observer {

  @Override
  public void updateDeath(Entity fighter, Entity fighter2) {
    String msg = "";
    if (fighter.getHealth() == 0) {
      msg = "Player 1 MURIO. PLAYER 2 GANA!";
    } else {
      msg = "Player 2 MURIO. PLAYER 1 GANA!";
    }
    writeFile(msg);
  }

  @Override
  public void updateDamage(Entity fighter, Entity fighter2) {
    writeFile("El peleador: " + fighter.getName() + "Daño a " + fighter2.getName());
    writeFile("El daño causado fue: " + fighter.getWeapon().get_damage());
  }

  @Override
  public void updateFighter(Entity fighter) {
    Weapon weapon = fighter.getWeapon();
    String msg = "El Peleador es: " + fighter.getName() +
        " De tipo: " + fighter.get_FighterType() +
        "con arma: " + weapon.getName();
    writeFile(msg);
  }

  private void writeFile(String msg) {
    String fileName = "CombatText.txt";
    try {
      FileWriter fileWriter = new FileWriter(fileName, true);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      bufferedWriter.write(msg);
      bufferedWriter.newLine();

      bufferedWriter.close();

    } catch (IOException e) {
      System.err.println("Error al abrir/escribir en el archivo: " + e.getMessage());
    }
  }

}
