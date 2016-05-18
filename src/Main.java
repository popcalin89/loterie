import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Numerele castigatoare a acestei runde sunt:");
        Set<Integer> WinningNumbers = new Generare().sixNumbers();
        System.out.println();
        System.out.println("Tichetul tau contine numerele:");
        final Set<Integer> MyTicket = new Generare().sixNumbers();

        int luckyNumbers = 0;
        int counts = 0;

        for (int nr : WinningNumbers) {
            if (MyTicket.contains(nr)) {
                luckyNumbers++;
            }
        }
        System.out.println();
        switch (luckyNumbers) {
            case 3:
                System.out.println("Felicitari!! Ai nimerit " + luckyNumbers + " numere. Castig incadrat la categoria IV");
                break;
            case 4:
                System.out.println("Felicitari!! Ai nimerit " + luckyNumbers + " numere. Castig incadrat la categoria III");
                break;
            case 5:
                System.out.println("Felicitari!! Ai nimerit " + luckyNumbers + " numere. Castig incadrat la categoria II");
                break;
            case 6:
                System.out.println("Felicitari!! Ai nimerit " + luckyNumbers + " numere. Castig incadrat la categoria I");
                break;
            default:
                System.out.println("Bilet necasticator");
                break;
        }
        do {
            Set<Integer> newNumbers = new Generare().sixNumbers();
            luckyNumbers=0;
            System.out.println();
            counts++;
            for (int nr : newNumbers) {
                if (MyTicket.contains(nr)) {
                    luckyNumbers++;
                }
            }
        }while(luckyNumbers != 5);
        System.out.println();
        System.out.println("Biletul tau este catigator in urma a " +counts+" de extrageri");
    }

}



