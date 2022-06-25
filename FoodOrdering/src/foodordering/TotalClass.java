/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package foodordering;

/**
 *
 * @author zedso
 */
public class TotalClass {

    double iTax;
    double iSubTotal;
    TotalClass() {
    }
    TotalClass(double newTax, double newSubTotal) {
        this.iTax=newTax;
        this.iSubTotal = newSubTotal;
    }
    double getTotal() {
        return this.iTax+this.iSubTotal;
    }
}

