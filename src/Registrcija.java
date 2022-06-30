import java.util.Scanner;
public class Registrcija {

    public static void main(String[] args) {

        String vardas;
        String ePastas;
        String slaptazodis;
        String pakartotasSlaptazodis;

        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite vartotojo vardą: ");
        vardas = skaitytuvas.nextLine();
        System.out.println("Vartotojo vardas:" + vardas);


        System.out.println("Įveskite el.paštą: ");
        ePastas = skaitytuvas.nextLine();
        System.out.println("el. paštas yra :" + ePastas);

        //System.out.println("Jeigu el. paštas turi simbolius '@' ir '.' rodoma 'true', jeigu ne 'false' ");
        //System.out.println(ePastas.contains("@"));
        //System.out.println(ePastas.contains("."));

        boolean arYraePasteSimboliai = ePastoReiksme(ePastas);
        System.out.println("Ar e-pašte yra privalomi simboliai " + arYraePasteSimboliai);



        System.out.println("Įveskite slaptažodį: ");
        slaptazodis = skaitytuvas.nextLine();
        System.out.println("Slaptažodis yra:" + slaptazodis);



        boolean arYraSlaptazodyjeSkaicius = slaptazodzioReiksme(slaptazodis);
        System.out.println("Ar slaptažodyje yra skaičius " + arYraSlaptazodyjeSkaicius);

        if (vardas.equals(slaptazodis)) {
            System.out.println("Slaptažodis sutapti su vardu negali");
        }

        int slaptazodzioIlgis = slaptazodis.length();
        String slaptazodzioIlgioTikrinimoRezultatas = patikrintiIlgi(slaptazodzioIlgis);
        System.out.println("Slaptažodis " + slaptazodzioIlgioTikrinimoRezultatas);


        System.out.println("Pakartokite slaptažodį: ");
        pakartotasSlaptazodis = skaitytuvas.nextLine();
        System.out.println("Slaptažodis yra:" + pakartotasSlaptazodis);

        if (slaptazodis.equals(pakartotasSlaptazodis)) {
            System.out.println();
        } else {
            System.out.println("Slaptažodžiai nesutampa");
        }
    }

    public static String patikrintiIlgi(int a) {
        if (a < 10) {
            return " per trumpas";
        } else {
            return " tinka pagal ilgį";
        }
    }
    public static boolean skaitmenuPaieska(char x) {
        char[] skaitmenys = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < skaitmenys.length; i++) {
            if (x == skaitmenys[i]) {
                return true;
            }
        }
        return false;

    }
    public  static boolean slaptazodzioReiksme(String sl) {
        for (int i=0; i < sl.length(); i++) {
            if(skaitmenuPaieska(sl.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static boolean simboliuPaieska(char x) {
        char[] simboliai = {'@', '.'};
        for (int i = 0; i < simboliai.length; i++) {
            if (x == simboliai[i]) {
                return true;
            }
        }
        return false;

    }
    public  static boolean ePastoReiksme(String ep) {
        for (int i=0; i < ep.length(); i++) {
            if(simboliuPaieska(ep.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
