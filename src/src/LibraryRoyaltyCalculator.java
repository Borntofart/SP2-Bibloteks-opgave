public class LibraryRoyaltyCalculator {

    //HER STARTER DU KODEN DETTE ER DIN MAIN (hovedeblok)
        public static void main(String[] args) {

            //Test 1 Olga Ravn
            // Celestine som printet bog: 166 sider SKØN (1.7) 140 eksemplarer
            // Forventet point 166 × 1.7 × 140 = 39508
            // Celestine som lydbog: 192 min, SKØN (1.7), 140 eksemplarer
            // Forventet point: (192 × 0.5) × 1.7 × 140 = 22848
            // Samlet forventet: (39508 + 22848) × 0.067574 = 4213.64 kr

            Author olgaRavn = new Author("Olga Ravn");
            olgaRavn.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));
            olgaRavn.addTitle(new AudioBook("Celestine (lydbog)", "SKØN", 140, 192));
            System.out.println(olgaRavn.getName() + ": " + olgaRavn.calculateRoyalties() + "kr");

            //Test 2 Forfatter med blandede litteraturtyper
            // Tester BI, LYRIK og FAG korrekt

            Author kariDietz = new Author("Kari Dietz");
            kariDietz.addTitle(new PrintedBook("Lille Frø finder hjem", "BI", 220, 48));
            kariDietz.addTitle(new PrintedBook("Saltmarsken taler", "LYRIK", 85, 96));
            kariDietz.addTitle(new AudioBook("Havets dyreliv (lydbog)", "FAG", 310, 410));
            System.out.println(kariDietz.getName() + ": " + kariDietz.calculateRoyalties() + "kr");

            //Forfatter med kun lydbøger
            Author mikkelBang = new Author("Mikkel Bang");
            // Krimi som lydbog: 560 min, SKØN (1.7), 430 eksemplarer
            mikkelBang.addTitle(new AudioBook("Mørket ved kysten (lydbog)", "SKØN", 430, 560));
            // Tegneserie som lydbog: 95 min, TE (3.0), 180 eksemplarer
            mikkelBang.addTitle(new AudioBook("Agent X fortæller (lydbog)", "TE", 180, 95));
            System.out.println(mikkelBang.getName() + ": " + mikkelBang.calculateRoyalties() + "kr");

           //cehfen

            Author lucasBeltner = new Author("Lucas Beltner");
            lucasBeltner.addTitle(new PrintedBook("Min første bog", "SKØN", 50, 118));
            System.out.println(lucasBeltner.getName() + ": " + lucasBeltner.calculateRoyalties() + "kr");


        }
    }

