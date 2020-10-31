package if1.latihan30.cakep;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Dekripsi Program : program ini berisi untuk menyatakan pengerjaan latihan 17
 *                    s/d 18 sendiri dan menyatakan tidak melakukan sendiri
 * 
 */

import java.util.Scanner; // import kelas scanner

public class Cakep {
final Scanner sc = new Scanner(System.in);
    String color[] = {"\033[38;2;255;0;0m", "\033[38;2;71;81;255m", "\033[38;2;255;255;0m", "\033[38;2;255;0;255m", "\033[38;2;0;255;0m", "\033[38;2;0;255;255m"};
    String netral = "\033[0m";
    String jawab;
    
    private void masukkanJawaban(){
        System.out.println(color[0].concat("Kamu ").concat(color[4]).concat("ngerjain sendiri ")
                .concat(color[2]).concat("latihan 17 sampe ").concat(color[1]).concat("latihan 30 ini?"));
        System.out.print(color[1].concat("Jawab ").concat(color[0]).concat("(Yoi/Enggak) : "));
        jawab = sc.nextLine().toUpperCase();
    }

    private void tampilJawaban(){
        String jawab = null;
        if (this.jawab.equals("YOI")){
            jawab = color[0].concat("\nCakep Bener. ").concat(color[3]).concat("Good Job");
        }else if(this.jawab.equals("ENGGAK")){
            jawab = color[0].concat("Tetep cakep sih.\n").concat(color[5])
                    .concat("Sing penting paham konsep nya yee.\n").concat(netral)
                    .concat("Keep the code works dude!!");
        }
        System.out.println(jawab);
    }

    public static void main(String[] args) {
        Cakep cakep = new Cakep();
        cakep.masukkanJawaban();
        cakep.tampilJawaban();
	System.out.println("Developed by : Rachman Aldiansyah");
    }
}  