public class Warlock extends Character {
    //Warlock constructor inherits character class
    Warlock(String name,int healthPoints,int level,int manaPoints) {
        super(name);
        characterName = name;
        hP = healthPoints;
        lvl = level;
        mP = manaPoints;
    }
    //Warlock Spells method class
    //Two Warlock spell  with damage and mana reduction upon cast
    public void fireProwler(Character turnCharacter, Character enemyCharacter) {
        System.out.println("\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with Fire Prowler!\n" + enemyCharacter.characterName + " receives 40 damage!");
        int manaCost = 100;
        int damagePoints = 40;

        manaDeduction(turnCharacter, manaCost);
        damageTarget(enemyCharacter, damagePoints);
    }

    public void nightFall(Character turnCharacter, Character enemyCharacter) {
        System.out.println("\n"+super.characterName + " casts night Fall to " + enemyCharacter.characterName + "!\n" + enemyCharacter.characterName + " receives 35 damage!");
        int manaCost = 90;
        int damagePoints = 35;

        manaDeduction(turnCharacter, manaCost);
        damageTarget(enemyCharacter, damagePoints);
    }
    //Warlock spell to recover health and mana points
    public void healingOrb(Character turnCharacter) {
        System.out.println("\n"+super.characterName + " used Healing Orb!\n" + super.characterName + "restores 100mp and 50 hp!");
        recover(turnCharacter);
    }
}