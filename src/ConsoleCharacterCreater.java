import Items.AdventuringGear;
import Items.AdventuringGearEnum;
import Items.Tools;
import Items.ToolsEnum;
import PlayerCharacter.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleCharacterCreater {

    static Scanner sc = new Scanner(System.in);

    public static PlayerCharacter consoleCreateCharacter() {
        int choice = 0;
        PlayerCharacter pc = new PlayerCharacter();
        pc.setAbilities(new Abilities(10,10,10,10,10,10));
        System.out.println("Enter Character name:");
        pc.setName(sc.nextLine());
        System.out.println("Select a race");
        printRaces();
        Races race = Races.values()[getChoice(1, Races.values().length)-1];
        if (race == Races.halfOrc) {
            CreateRace.createRace(pc, race);
        } else {
            System.out.println("Select a subrace");
            int numberOfSubrace = printSubRaces(race);
            choice = getChoice(1, numberOfSubrace);
            Subraces sr = getSubRace(race, choice);
            CreateRace.createRace(pc, sr);
        }
        System.out.println("Select a background");
        printBackgrounds();
        Backgrounds background = Backgrounds.values()[getChoice(1, Backgrounds.values().length)-1];
        ArrayList<Object> backgroundChoices = backgroundChoices(background);
        CreateBackground.createBackground(pc, background, backgroundChoices);
        return pc;
    }
    
    private static Subraces getSubRace(Races race, int choice) {
        int i = 1;
        Subraces sr = null;
        for (Subraces subrace : Subraces.values()) {
            if (Subraces.getRace(subrace)==race) {
                if (choice == i) {
                   sr = subrace;
                   break;
                }
                i++;
            }
        }
        return sr;
    }

    private static ArrayList<Object> backgroundChoices(Backgrounds background) {
        ArrayList<Object> backgroundChoices = new ArrayList<>();

        switch (background) {
            case acolyte -> backgroundChoices = acolyteChoices();
            case charlatan -> backgroundChoices = charlatanChoices();
            case criminal -> backgroundChoices = criminalChoices();
            case entertainer -> backgroundChoices = entertainerChoices();
            case folkHero -> backgroundChoices = folkHeroChoices();
        }
        return backgroundChoices;
    }

    private static ArrayList<Object> acolyteChoices() {
        ArrayList<Object> languageChoices = new ArrayList<Object>();
        System.out.println("Select two Languages");
        printLanguages();
        System.out.println("Language 1:");
        Languages language1 = Languages.values()[getChoice(1, Languages.values().length)-1];
        System.out.println("Language 2:");
        Languages language2 = Languages.values()[getChoice(1, Languages.values().length)-1];
        while (language1 == language2) {
            System.out.println("Select different languages");
            System.out.println("Language 2:");
            language2 = Languages.values()[getChoice(1, Languages.values().length)-1];
        }
        return new ArrayList<Object>(Arrays.asList(language1, language2));
    }

    private static ArrayList<Object> charlatanChoices() {
        ArrayList<Object> itemChoices = new ArrayList<Object>();
        System.out.println("Select one item");
        System.out.println("" +
                "1 - 10 stoppered bottles filled with colored liquid\n" +
                "2 - 1 set of weighted dice\n" +
                "3 - 1 set of marked cards\n" +
                "4 - 1 signet ring of an imaginary duke");
        int choice = getChoice(1, 4);
        if (choice == 1) {
            itemChoices.add(AdventuringGear.getAdventuringGear(AdventuringGearEnum.stopperedBottle));
        } else if (choice == 2) {
            itemChoices.add(AdventuringGear.getAdventuringGear(AdventuringGearEnum.weightedDice));
        } else if (choice == 3) {
            itemChoices.add(AdventuringGear.getAdventuringGear(AdventuringGearEnum.markedCards));
        } else {
            itemChoices.add(AdventuringGear.getAdventuringGear(AdventuringGearEnum.signetRing));
        }
        return itemChoices;
    }

    private static ArrayList<Object> criminalChoices() {
        ArrayList<Object> itemChoices = new ArrayList<Object>();
        System.out.println("Select one item");
        System.out.println("" +
                "1 - 1 set of dice\n" +
                "2 - 1 set of playing cards\n");
        int choice = getChoice(1, 2);
        if (choice == 1) {
            itemChoices.add(AdventuringGear.getAdventuringGear(AdventuringGearEnum.setOfDice));
        } else {
            itemChoices.add(AdventuringGear.getAdventuringGear(AdventuringGearEnum.setOfPlayingCards));
        }
        return itemChoices;
    }

    private static ArrayList<Object> entertainerChoices() {
        ArrayList<Object> itemChoices = new ArrayList<Object>();
        System.out.println("Select one musical instrument to be proficient with:");
        printMusicalInstrument();
        int choice = getChoice(1, 10);
        itemChoices.add(assignMusicalInstrumentProficiency(choice));
        System.out.println("Select one musical instrument to add to your inventory:");
        printMusicalInstrument();
        choice = getChoice(1, 10);
        itemChoices.add(assignMusicalInstrument(choice));
        return itemChoices;
    }

    private static ArrayList<Object> folkHeroChoices() {
        ArrayList<Object> al = new ArrayList<>();
        System.out.println("Select one proficiency of artisan tools");
        printArtisantools();
        int choice = getChoice(1,17);
        al.add(assignArtisansToolsProficiency(choice));
        System.out.println("Select one tool to add to your inventory");
        printArtisantools();
        choice = getChoice(1,17);
        al.add(assignArtisansTools(choice));
        return al;
    }

    private static void printRaces() {
        int i = 1;
        for(Races race : Races.values()) {
            System.out.println(i + " - " + race);
            i++;
        }
    }

    private static int printSubRaces(Races race) {
        int i = 0;
        for (Subraces subrace : Subraces.values()) {
            if (Subraces.getRace(subrace)==race) {
                i++;
                System.out.println(i + " - " + subrace);
            }
        }
        return i;
    }


    private static Tools assignMusicalInstrument(int choice) {
        Tools tool = null;
        switch (choice) {
            case 1 -> tool = Tools.getTool(ToolsEnum.bagpipes);
            case 2 -> tool = Tools.getTool(ToolsEnum.drum);
            case 3 -> tool = Tools.getTool(ToolsEnum.dulcimer);
            case 4 -> tool = Tools.getTool(ToolsEnum.flute);
            case 5 -> tool = Tools.getTool(ToolsEnum.lute);
            case 6 -> tool = Tools.getTool(ToolsEnum.lyre);
            case 7 -> tool = Tools.getTool(ToolsEnum.horn);
            case 8 -> tool = Tools.getTool(ToolsEnum.panFlute);
            case 9 -> tool = Tools.getTool(ToolsEnum.shawn);
            case 10 -> tool = Tools.getTool(ToolsEnum.viol);
        }
        return tool;
    }

    private static ToolsEnum assignMusicalInstrumentProficiency(int choice) {
        ToolsEnum tool = null;
        switch (choice) {
            case 1 -> tool = ToolsEnum.bagpipes;
            case 2 -> tool = ToolsEnum.drum;
            case 3 -> tool = ToolsEnum.dulcimer;
            case 4 -> tool = ToolsEnum.flute;
            case 5 -> tool = ToolsEnum.lute;
            case 6 -> tool = ToolsEnum.lyre;
            case 7 -> tool = ToolsEnum.horn;
            case 8 -> tool = ToolsEnum.panFlute;
            case 9 -> tool = ToolsEnum.shawn;
            case 10 -> tool = ToolsEnum.viol;
        }
        return tool;
    }



    private static Tools assignArtisansTools (int choice) {
        Tools tool = null;
        switch (choice) {
            case 1 -> tool = Tools.getTool(ToolsEnum.alchemistsSupplies);
            case 2 -> tool = Tools.getTool(ToolsEnum.brewersSupplies);
            case 3 -> tool = Tools.getTool(ToolsEnum.calligraphersSupplies);
            case 4 -> tool = Tools.getTool(ToolsEnum.carpentersTools);
            case 5 -> tool = Tools.getTool(ToolsEnum.cartographersTools);
            case 6 -> tool = Tools.getTool(ToolsEnum.cobblersTools);
            case 7 -> tool = Tools.getTool(ToolsEnum.cooksUtensils);
            case 8 -> tool = Tools.getTool(ToolsEnum.glassblowersTools);
            case 9 -> tool = Tools.getTool(ToolsEnum.jewelersTools);
            case 10 -> tool = Tools.getTool(ToolsEnum.leatherworkersTools);
            case 11 -> tool = Tools.getTool(ToolsEnum.masonTools);
            case 12 -> tool = Tools.getTool(ToolsEnum.paintersSupplies);
            case 13 -> tool = Tools.getTool(ToolsEnum.pottersTools);
            case 14 -> tool = Tools.getTool(ToolsEnum.smithsTools);
            case 15 -> tool = Tools.getTool(ToolsEnum.thinkersTools);
            case 16 -> tool = Tools.getTool(ToolsEnum.weaversTools);
            case 17 -> tool = Tools.getTool(ToolsEnum.woodcarversTools);
        }
        return tool;
    }

    private static ToolsEnum assignArtisansToolsProficiency (int choice) {
        ToolsEnum tool = null;
        switch (choice) {
            case 1 -> tool = ToolsEnum.alchemistsSupplies;
            case 2 -> tool = ToolsEnum.brewersSupplies;
            case 3 -> tool = ToolsEnum.calligraphersSupplies;
            case 4 -> tool = ToolsEnum.carpentersTools;
            case 5 -> tool = ToolsEnum.cartographersTools;
            case 6 -> tool = ToolsEnum.cobblersTools;
            case 7 -> tool = ToolsEnum.cooksUtensils;
            case 8 -> tool = ToolsEnum.glassblowersTools;
            case 9 -> tool = ToolsEnum.jewelersTools;
            case 10 -> tool = ToolsEnum.leatherworkersTools;
            case 11 -> tool = ToolsEnum.masonTools;
            case 12 -> tool = ToolsEnum.paintersSupplies;
            case 13 -> tool = ToolsEnum.pottersTools;
            case 14 -> tool = ToolsEnum.smithsTools;
            case 15 -> tool = ToolsEnum.thinkersTools;
            case 16 -> tool = ToolsEnum.weaversTools;
            case 17 -> tool = ToolsEnum.woodcarversTools;
        }
        return tool;
    }

    private static void printBackgrounds() {
        int i = 1;
        for(Backgrounds background: Backgrounds.values()) {
            System.out.println(i + " - " + background);
            i++;
        }
    }

    private static void printLanguages(){
        int i = 1;
        for (Languages language : Languages.values()) {
            System.out.println(i + " - " + language);
            i++;
        }
    }

    private static void printMusicalInstrument() {
        System.out.println("" +
                "1 - Bagpipes" +
                "\n2 - Drum" +
                "\n3 - Dulcimer" +
                "\n4 - Flute" +
                "\n5 - Lute" +
                "\n6 - Lyre" +
                "\n7 - Horn" +
                "\n8 - Pan flute" +
                "\n9 - Shawn" +
                "\n10 - Viol");
    }

    private static void printArtisantools() {
        System.out.println("""
                1 - Alchemist's supplies
                2 - Brewer's supplies
                3 - Calligraphers's supplies
                4 - Carpenter's tools
                5 - Cartographer's tools
                6 - Cobbler's tools
                7 - Cook's utensils
                8 - Glassblower's tools
                9 - Jeweler's tools
                10 - Leatherworker's tools
                11- Mason's tools
                12 - Painter's supplies
                13 - Potter's tools
                14 - Smith's tools
                15 - Tinker's tools
                16 - Weaver's tools
                17 - Woodcarver's tools
                """);
    }


    private static int getChoice(int low, int max) {
        int choice = -1;
        do {
            System.out.println("Enter the choice:");
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                continue;
            }
            if (choice < low || choice > max ) {
                System.out.println("Invalid choice");
            }
        } while (choice < low || choice > max);
        return choice;
    }
}
