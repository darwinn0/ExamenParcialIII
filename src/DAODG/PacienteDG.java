/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAODG;

/**
 *
 * @author darwi
 */
public class PacienteDG 
{
    private Integer IdDG;
    private String NombreDG;
    private String EnfermedadDG;

    public PacienteDG(Integer IdDG, String NombreDG, String EnfermedadDG) {
        this.IdDG = IdDG;
        this.NombreDG = NombreDG;
        this.EnfermedadDG = EnfermedadDG;
    }

    public Integer getIdDG() {
        return IdDG;
    }

    public void setIdDG(Integer IdDG) {
        this.IdDG = IdDG;
    }

    public String getNombreDG() {
        return NombreDG;
    }

    public void setNombreDG(String NombreDG) {
        this.NombreDG = NombreDG;
    }

    public String getEnfermedadDG() {
        return EnfermedadDG;
    }

    public void setEnfermedadDG(String EnfermedadDG) {
        this.EnfermedadDG = EnfermedadDG;
    }
    
    
}
