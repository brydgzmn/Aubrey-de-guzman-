public class Wizard extends Character{
    //Wizard constructor inherits character class
    Wizard(String name, int healthPoints,int level,int manaPoints){
        super(name);
        characterName = name;
        hP = healthPoints;
        lvl = level;
        mP = manaPoints;
    }
    //Wizard Spells method class
    //Two Wizard spell  with damage and mana reduction upon cast
    public void blastPack(Character turnCharacter, Character enemyCharacter){
        System.out.println("\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with Blast Pack!\n" +enemyCharacter.characterName + " receives 35 damage!");
        int manaCost = 80;
        int damagePoints = 35;

        manaDeduction(turnCharacter, manaCost);
        damageTarget(enemyCharacter, damagePoints);
    };

    public void showStopper(Character turnCharacter, Character enemyCharacter){
        System.out.println("\n"+super.characterName + " attacks " + enemyCharacter.characterName + " with Show Stopper!\n" +enemyCharacter.characterName + " receives 30 damage!");
        int manaCost = 70;
        int damagePoints = 30;

        manaDeduction(turnCharacter, manaCost);
        damageTarget(enemyCharacter, damagePoints);
    }
    //Wizard spell to recover health and mana points
    public void empressOrb(Character turnCharacter){
        System.out.println("\n"+super.characterName + " used Empress Orb!\n" + super.characterName + " restores 100mp and 50 hp!");
        recover(turnCharacter);
    }
}