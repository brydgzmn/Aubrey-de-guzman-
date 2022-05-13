public class Character {
    public String characterName;
    public int lvl;
    public int hP;
    public int mP;

    Character(String name,int healthPoints,int level,int manaPoints){
        characterName = name;
        hP = healthPoints;
        lvl = level;
        mP = manaPoints;
    }

    //Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
    public Character(String name) {
    }

    public void info(Character c1, Character c2){
        System.out.println("\n"+c1.characterName+"\nhP: "+c1.hP+"\nmP: "+c1.mP);
        System.out.println("\n"+c2.characterName+"\nhP: "+c2.hP+"\nmP: "+c2.mP);
    }
    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void display(Character turnCharacter){
        System.out.println("Character Sheet\nCharacter Name: "+turnCharacter.characterName+"\nLevel: "+turnCharacter.lvl+"\nHealth Points: "+turnCharacter.hP+"\nMana Points: "+turnCharacter.mP+"\n\n");
    }

    //Recovering health and mana points
    public void recover(Character turnCharacter){
        turnCharacter.hP = hP;
        turnCharacter.mP = mP;

        hP +=50;
        mP +=100;
    }
    // + deduct character manapoints
    public void manaDeduction(Character turnCharacter, int manaCost){
        turnCharacter.mP = mP;
        mP -= manaCost;
    }
    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints){

        enemyCharacter.hP -= damagePoints;
        System.out.println("Character "+ enemyCharacter.characterName + "'s HP Left: " + enemyCharacter.hP);

    /**
     * Prompt Character is defeated if HP falls below 0
     * Either the Warlock/Wizard should be defeated at the end of the Sequence.
     * The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
    */
        // + Level Up Character
        if(enemyCharacter.hP == 0){
            System.out.println("Character " +enemyCharacter.characterName + " has been defeated."  );
            lvl += 10;
            System.out.println(characterName+" has gained 10 levels!");
        }
    }

}
