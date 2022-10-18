    public static int tryCatchStringToInt(String s){
        try{
            return Integer.parseInt(s);

        } catch (Exception e){
            System.out.println("Error, please input a valid number");
            return 0;
        }
    }

    public static int inputToInt(String s){
        return tryCatchStringToInt(JOptionPane.showInputDialog(s));
    }

    public static int sjekkTall(String s){
        while(true) {
            int n = inputToInt(s);            
            if (n < 0 || n > 9) {                
                JOptionPane.showMessageDialog(null,
                        "Vennligst skriv et tall mellom 0 og 9");
                
            } else {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        int n = sjekkTall("Hvor mange poeng fikk du, fra 0 til 9?");
        System.out.println(n);
    }
