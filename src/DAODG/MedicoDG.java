/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAODG;

/**
 *
 * @author darwi
 */
public class MedicoDG 
{
    private Integer IdDG;
    private String NombreDG;
    private String EspecialidadDG;

    public MedicoDG(Integer IdDG, String NombreDG, String EspecialidadDG) {
        this.IdDG = IdDG;
        this.NombreDG = NombreDG;
        this.EspecialidadDG = EspecialidadDG;
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

    public String getEspecialidadDG() {
        return EspecialidadDG;
    }

    public void setEspecialidadDG(String EspecialidadDG) {
        this.EspecialidadDG = EspecialidadDG;
    }

    
    
}
