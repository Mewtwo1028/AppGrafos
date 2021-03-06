/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osmar
 */
public class NodoVertice {
    char dato;
    NodoVertice ant;
    NodoVertice sig;
    NodoArista arista;
    
    public NodoVertice (char dato){
        this.dato = dato;
        sig = null;
        ant = null;
        arista = null;
    }
    
    public boolean insertarArista (NodoVertice direccion){
        NodoArista nuevo = new NodoArista (direccion);
        
        if (nuevo == null)
        {
            return false;
        }
        
        if (arista == null)
        {
            arista = nuevo;
            return true;
        }
        irUltimo();
        arista.abajo = nuevo;
        nuevo.arriba = arista;
        return true;
    }

    private void irUltimo() {
        while (arista.abajo != null)
        {
            arista = arista.abajo;
        }
    }
    
    private void irPrimero() {
        while (arista.arriba != null)
        {
            arista = arista.arriba;
        }
    }
    
    public NodoArista buscarArista (NodoVertice direccion){
        irPrimero();
        for (NodoArista buscar = arista; buscar != null; buscar = buscar.abajo)
        {
            if (buscar.direccion == direccion)
            {
                return buscar;
            }
        }
        return null;
    }
    
    private boolean unaSolaArista(){
        return arista.abajo == null && arista.arriba == null;
    }
    
    public boolean eliminarArista (NodoVertice direccion){
        if (arista == null)
        {
            return false;
        }
        NodoArista temp = buscarArista (direccion);
        
        if (temp == null)
        {
            return false;
        }
        
        if (arista == temp)
        {
            if (unaSolaArista())
            {
                arista = null;
            }
            else{
                arista = arista.abajo;
                temp.abajo.arriba = temp.abajo = null;
            }
            return true;
        }
        //est?? en el ultimo nodo
        if (temp.abajo == null)
        {
            temp.arriba.abajo = temp.arriba = null;
        }
        //quitar arista de en medio
        temp.arriba.abajo = temp.abajo;
        temp.abajo.arriba = temp.arriba;
        temp.abajo = null;
        temp.arriba = null;
        return true;
    }

    @Override
    public String toString() {
        
        String auxS = "["+dato+"]";
        NodoArista auxNA = arista;
        while (auxNA != null) 
        {
            auxS += "->>" + auxNA.direccion.dato;
            auxNA = auxNA.abajo;
            
        }
        
        return auxS;
    }
}
