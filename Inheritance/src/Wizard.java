public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void HydroPump(Character enemyCharacter) {
        System.out.println(
                super.characterName + " attacks " + enemyCharacter.characterName + " with HydroPump (Damage - 30)");
        int manacost = 25;
        int damagePoints = 20;
        damageTarget(enemyCharacter, damagePoints, manacost);
    };
}