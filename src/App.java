public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Wizards and Warlocks\n");

        //Wizard and Warlock object class inheriting Character Class
        Warlock Fade = new Warlock("Fade",100,10,300);
        Wizard Raze = new Wizard ("Raze",100,10,300);

        //Displaying Character details
        System.out.println("Character Status\n");

        Fade.display(Fade);
        Raze.display(Raze);

        //first round match
        System.out.println("Game Start!");
        //damage spell casts
        Raze.blastPack(Raze, Fade);
        Fade.nightFall(Fade,Raze);

        //displaying current character details
        Raze.info(Raze,Fade);

        //damage spell cast second round
        Raze.showStopper(Raze,Fade);
        Fade.fireProwler(Fade,Raze);

        //displaying current character details
        Fade.info(Fade,Raze);

        //Recover spell casts third round
        Raze.empressOrb(Raze);
        Fade.healingOrb(Fade);

        //displaying current character details
        Fade.info(Fade,Raze);

        //damage spell casts fourth round
        Raze.showStopper(Raze,Fade);
        Fade.nightFall(Fade,Raze);

        //displaying current character details
        Raze.info(Raze,Fade);

        //damage spell casts last round
        Raze.showStopper(Raze,Fade);
        Fade.fireProwler(Fade,Raze);

        //displaying result
        Raze.info(Raze,Fade);

        System.out.println("\nGame End!");
    }
}