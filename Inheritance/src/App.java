public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards Vs Warlocks");
        /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         * 
         * 
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         * 
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and
         * Mana Points
         * 
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         * 
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP
         * and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In
         * Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the
         * current status of the Characters
         * - Create a method to display details for better readability
         */

        /**
         * Example Sequence
         * Wizard Merlin = new Wizard("Merlin");
         * Warlock Saruman = new Warlock("Saruman");
         * 
         * Merlin.firestorm(Saruman); // Saruman HP Deducted
         * Warlock.recover() // Saruman HP and MP increases
         */
        Wizard Jadis = new Wizard("Jadis");
        Warlock Raven = new Warlock("Raven");
        Jadis.HydroPump(Raven);

        System.out.println("\n" + Raven.characterName);
        System.out.println("HP left is " + Raven.healthPoints);
        System.out.println("Mana left is " + Raven.manaPoints);
        System.out.println(" ");

        Raven.multiattacker(Jadis);
        System.out.println("\n" + Jadis.characterName);
        System.out.println("HP left is " + Jadis.healthPoints);
        System.out.println("Mana left is " + Jadis.manaPoints);
        System.out.println(" ");

        Jadis.HydroPump(Raven);

        System.out.println("\n" + Raven.characterName);
        System.out.println("HP left is " + Raven.healthPoints);
        System.out.println("Mana left is " + Raven.manaPoints);
        System.out.println(" ");

        Raven.multiattacker(Jadis);
        System.out.println("\n" + Jadis.characterName);
        System.out.println("HP left is " + Jadis.healthPoints);
        System.out.println("Mana left is " + Jadis.manaPoints);
        System.out.println(" ");

        Jadis.HydroPump(Raven);

        System.out.println("\n" + Raven.characterName);
        System.out.println("HP left is " + Raven.healthPoints);
        System.out.println("Mana left is " + Raven.manaPoints);
        System.out.println(" ");

        Raven.multiattacker(Jadis);
        System.out.println("\n" + Jadis.characterName);
        System.out.println("HP left is " + Jadis.healthPoints);
        System.out.println("Mana left is " + Jadis.manaPoints);
        System.out.println(" ");

        Jadis.HydroPump(Raven);

        System.out.println("\n" + Raven.characterName);
        System.out.println("HP left is " + Raven.healthPoints);
        System.out.println("Mana left is " + Raven.manaPoints);
        System.out.println(" ");

        Raven.recover(Raven);
        System.out.println(Raven.characterName + " has total HP of " + Raven.healthPoints
                + " and total of Mana is " + Raven.manaPoints);
        System.out.println(" ");
        System.out.println(Raven.characterName);
        System.out.println("HP left is " + Raven.healthPoints);
        System.out.println("Mana left is " + Raven.manaPoints);
        System.out.println(" ");

        Jadis.HydroPump(Raven);

        System.out.println("\n" + Raven.characterName);
        System.out.println("HP left is " + Raven.healthPoints);
        System.out.println("Mana left is " + Raven.manaPoints);
        System.out.println(" ");

        Raven.multiattacker(Jadis);
        System.out.println("\n" + Jadis.characterName);
        System.out.println("HP left is " + Jadis.healthPoints);
        System.out.println("Mana left is " + Jadis.manaPoints);
        System.out.println(" ");

        Jadis.HydroPump(Raven);

        System.out.println("\n" + Raven.characterName);
        System.out.println("HP left is " + Raven.healthPoints);
        System.out.println("Mana left is " + Raven.manaPoints);
        System.out.println(" ");

        Raven.multiattacker(Jadis);
        System.out.println("\n" + Jadis.characterName);
        System.out.println("HP left is " + Jadis.healthPoints);
        System.out.println("Mana left is " + Jadis.manaPoints);
        System.out.println(" ");

        Jadis.HydroPump(Raven);

        System.out.println("\n" + Raven.characterName);
        System.out.println("HP left is " + Raven.healthPoints);
        System.out.println("Mana left is " + Raven.manaPoints);
        System.out.println(" ");

        System.out.println(Jadis.characterName + " has level up by " + Character.levelup);

    }
}