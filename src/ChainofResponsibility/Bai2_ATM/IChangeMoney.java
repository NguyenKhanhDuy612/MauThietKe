/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ChainofResponsibility.Bai2_ATM;

/**
 *
 * @author Admin
 */
public interface IChangeMoney {
    IChangeMoney setSuccessor (IChangeMoney money);
    int Change (int money);
}
