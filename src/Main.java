public class Main {
    public static void main(String[] args) {
        int numif = 0;

        if (numif > 0) {
            System.out.println("La variable es positiva");
        } else if (numif < 0) {
            System.out.println("La variable es negativa");
        } else {
            System.out.println("La variable es igual a 0");
        }
        //////////////////////(WHILE)///////////////////////
        int numW=0;

        while (numW < 3) {
            System.out.println("El numero While vale:" + numW);
            numW++;
        }
        //////////////////////(DO WHILE)////////////////////
        int numDW = 0;

        do {
            numDW++;
            System.out.println("El numero dowhile:" + numDW);
        } while (numDW > 1);
        //////////////////////(FOR)/////////////////////////
        for (int numF = 0; numF <= 3; numF++) {
            System.out.println(numF);
        }
        //////////////////////(SWITCH)//////////////////////
        var estacion = "Es verano";

        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("NO ES UNA ESTACION");
                break;

        }
    }
}