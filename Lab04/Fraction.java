/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natta
 */
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction () {
        return topN + "/" + btmN;
    }
    public String toFloat () {
        double topN_d = topN;
        double ans = topN_d / btmN;
        return ans + "";
    }
    public void addFraction (Fraction f) {
        if (f.btmN == btmN) {
            topN += f.topN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN *= f.btmN;
        }
    }
}
