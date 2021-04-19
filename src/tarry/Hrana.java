/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tarry;

/**
 *
 * @author Dominik - PC
 */
public class Hrana {
    private int a;
    private int b;

    public Hrana(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    @Override
    public String toString() {
        return this.a+" "+this.b; }
    
    
}
