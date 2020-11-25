public class Main {
    public static void main(String[] args) {
        RozkladLiczby rozkladLiczby = null;
        for (int i = 0; i < args.length; i++) {
            try {
                int n = Integer.parseInt(args[i]);
                if (i == 0) {
                    rozkladLiczby = new RozkladLiczby(n);
                } else {
                    int[] result = rozkladLiczby.czynnikiPierwsze(n);
                    System.out.println(args[i] + " = " + zliczanieWystapien(result));
                }
            } catch (NumberFormatException e) {
                System.out.println(args[i] + " - to nie jest liczba");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String zliczanieWystapien(int[] tab) {
        StringBuilder wynik = new StringBuilder("");
        for (int i = 0; i < tab.length; i++) {
            int licznik = 1;
            int j = i + 1;
            while (j < tab.length && tab[i] == tab[j]) {
                licznik++;
                j++;
            }
            i = j - 1;
            if (licznik > 1) {
                wynik.append(tab[i]).append("^").append(licznik);
            } else {
                wynik.append(tab[i]);
            }
            if (i != tab.length - 1) {
                wynik.append("*");
            }
        }
        return wynik.toString();
    }

    public static void wypiszLiczby(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
