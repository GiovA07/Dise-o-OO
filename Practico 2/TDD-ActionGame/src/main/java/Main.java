import battleArena.BattleArena;
import characters.Entity;
import characters.MagicFighter.Wizard;
import characters.MeleeFighter.Knight;
import characters.RangedFighter.Archer;
import weapons.AstralBall;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Entity character1 = new Knight();
        Entity character2 = new Archer();


        System.out.println("Inicia la batalla entre: " + character1.getName() + " y " + character2.getName());
        BattleArena battle = new BattleArena();
        String win = battle.battle(character1, character2);
        System.out.println(win);

        character1 = new Wizard();
        character1.setWeapon(new AstralBall());

        character2 = new Knight();
        character2.setWeapon(new Sword());

        System.out.println("Inicia la batalla entre: " + character1.getName() + " y " + character2.getName());
        win = battle.battle(character1, character2);
        System.out.println(win);
    }
}
