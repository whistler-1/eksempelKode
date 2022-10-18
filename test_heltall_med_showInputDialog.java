    public static int tryCatchStringToInt(String s){
        /*Bruker trycatch via en metode, syntes det er lettere.
        Denne metoden tar inn en String og returnerer enten den strengen som et heltall, eller 0
        */

        try{
            return Integer.parseInt(s);
            //om "try" ikke finner noen feil, returnerer den tallet med en gang, og hopper over neste del.

        } catch (Exception e){
            //om "try" finner en feil, skriver den ut melding i konsollen og returnerer 0
            System.out.println("Error, please input a valid number");
            return 0;
        }
    }

    public static int inputToInt(String s){
        //Dette fungerer som en snarvei, så slipper jeg å skrive denne lange koden flere ganger:
        return tryCatchStringToInt(JOptionPane.showInputDialog(s));
    }

    public static int sjekkTall(String s){
        // Eksempel: sjekktall("Skriv et heltall fra 0 til 9")

        while(true) {
            /*
            Fordi denne løkka er while(true), vil den loope for alltid
            hvis ikke noe inne i løkka den tvinger den til å stoppe, som feks
            return x; eller break;
            */

            int n = inputToInt(s);
            // Her bruker jeg snarveien jeg laget tidligere.
             

            if (n < 0 || n > 9) {
                // om tallet n er mindre enn 0 eller større enn 9 (feks -1 eller 10),
                // vises feilmeldingen, og løkken starter på nytt. 
                
                JOptionPane.showMessageDialog(null,
                        "Vennligst skriv et tall mellom 0 og 9");
                
            } else {
                //Om tallet brukeren gir er et heltall og mellom 0 og 9, 
                // kjører koden da videre :)
                
                return n;
            }
        }
    }

    public static void main(String[] args) {
        int n = sjekkTall("Hvor mange poeng fikk du, fra 0 til 9?");
        System.out.println(n);
    }
