/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tarry;

import javafx.application.Application;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dominik - PC
 */
public class Tarry extends Application {

    public static void Tarry(String[] args) throws IOException {
        Tarry  t = new Tarry();

            t.nacitajSubor();

        t.TarryhoAlgoritmus(5);
    }

    @Override
    public void start(Stage primaryStage) {

    }


    private ArrayList<Hrana> zoznam;
    private boolean[] hranaPrvehoPrichodu, hranaLP, hranaPL;


    public Tarry() {
            this.zoznam = new ArrayList<>();
            this.hranaLP = new boolean[zoznam.size()];
            this.hranaPL = new boolean[zoznam.size()];
            this.hranaPrvehoPrichodu = new boolean[zoznam.size()];
        }

        public void nacitajSubor() throws IOException {
            try (Scanner klav = new Scanner(System.in)) {


                   do {
                       int x = klav.nextInt();
                       int y = klav.nextInt();
                       Hrana hrana = new Hrana(x, y);
                       this.zoznam.add(hrana);
                   } while (klav.hasNext());


                for (int i = 0; i < this.zoznam.size(); i++) {
                    this.hranaLP[i] = false;
                    this.hranaPrvehoPrichodu[i] = false;
                    this.hranaPL[i] = false;
                }
            }
        }

        public int hladajHranu ( int vrchol){
            int x = 0;
            for (int i = 0; i < this.zoznam.size(); i++) {
                if (this.zoznam.get(i).getA() == vrchol) {
                    x = i;
                }
                if (this.zoznam.get(i).getB() == vrchol) {
                    x = i;
                }
            }

            return x;
        }

        public void vypis () {
            for (int i = 0; i < this.zoznam.size(); i++) {
                System.out.println(this.zoznam.get(i).toString());
            }

        }

        public void TarryhoAlgoritmus ( int riadiaciVrchol){
            System.out.println(this.zoznam.get(this.hladajHranu(riadiaciVrchol)).toString());
        }



        

}
