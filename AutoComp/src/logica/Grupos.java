/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import autocomp.entidades.Grupo;

/**
 *
 * @author adriano
 */
public final class Grupos {
    
    /**
     *
     * @param id id do grupo
     * @return objeto Grupo localizado
     */
    public static Grupo permissoes(int id){
        if(id == 1)
            return new Grupo(1, "administrador", true, 
                true, true, true, true, true, true, true);
        else if(id == 2)
            return new Grupo(2, "editor", false, 
                true, false, true, true, false, true, true);
        else 
            return new Grupo(3, "professor", true, 
                true, true, false, false, false, false, false);
    }
    
}