/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osmar
 */
public class Grafos {

    NodoVertice vertice;

    public Grafos() {
        vertice = null;
    }

    public boolean insertarVertice(char dato) {

        NodoVertice nuevo = new NodoVertice(dato);
        if (nuevo == null) {
            return false;
        }

        if (vertice == null) {
            vertice = nuevo;
            return true;
        }

        irUltimo();
        vertice.sig = nuevo;
        nuevo.ant = vertice;
        return true;
    }

    private void irUltimo() {
        while (vertice.sig != null) {
            vertice = vertice.sig;
        }
    }

    private void irPrimero() {
        while (vertice.ant != null) {
            vertice = vertice.ant;
        }
    }

    private NodoVertice buscarVertice(char dato) {
        if (vertice == null) {
            return null;
        }

        for (NodoVertice buscar = vertice; buscar != null; buscar = buscar.sig) {
            if (buscar.dato == dato) {
                return buscar;
            }
        }
        return null;
    }

    public boolean insertarAristas(char origen, char destino) {
        NodoVertice nodoOrigen = buscarVertice(origen);
        NodoVertice nodoDestino = buscarVertice(destino);

        if (nodoOrigen == null || nodoDestino == null) {
            return false;
        }
        return nodoOrigen.insertarArista(nodoDestino);
    }

    private boolean unSoloVertice() {
        return vertice.ant == null && vertice.sig == null;
    }

    public boolean eliminarVertice(char dato) {
        if (vertice == null) {
            return false;
        }

        NodoVertice temp = buscarVertice(dato);
        if (temp == null) {
            return false;
        }

        if (temp.arista != null) {
            return false;
        }

        quitarAristasDeOtrosVertices(temp);

        if (temp == vertice)//Temp está en el primero
        {
            if (unSoloVertice()) {
                vertice = null;
            } else {
                vertice = temp.sig;
                temp.sig.ant = temp.sig = null;

            }
            return true;
        }

        if (temp.sig == null) //Temp está en el último
        {
            temp.ant.sig = null;
            temp.ant = null;
            return true;
        }

        //Temp está en medio
        temp.ant.sig = temp.sig;
        temp.sig.ant = temp.ant;
        temp.sig = temp.ant = null;
        return true;

    }

    private void quitarAristasDeOtrosVertices(NodoVertice NodoEliminar) {
        irPrimero();
        for (NodoVertice buscar = vertice; buscar != null; buscar = buscar.sig) {
            buscar.eliminarArista(NodoEliminar);
        }
    }

    public boolean eliminarArista(char origen, char destino) {
        NodoVertice nodoOrigen = buscarVertice(origen);
        NodoVertice nodoDestino = buscarVertice(destino);
        if (nodoOrigen == null || nodoDestino == null) {
            return false;
        }
        return nodoOrigen.eliminarArista(nodoDestino);
    }
    
    public int iteraVertices() {
        if (vertice == null) 
        {
            return 0;
        }
        
        
        int i = 0;
        irPrimero();
        NodoVertice aux = vertice;
        
        
        while (aux != null) 
        {
            i++;
            aux = aux.sig;
            
        }

        return i;
    }
    
    public String listaAdyacencia(char dato) {
        return buscarVertice(dato).toString();
    }
    
    public boolean[][] matrixDeAdyacencia() {
        if (vertice == null) {
            return null;
        }
        int vertices = iteraVertices();
        int j;
        boolean[][] matrix = new boolean[vertices][vertices];
        for (int i = 0; i < vertices; i++) 
        {
            for (j = 0; j < vertices; j++) 
            {
                matrix[i][j] = false;
            }
        }
        for (int i = 0; i < vertices; i++) 
        {
            j = 0;
            while (i != j) 
            {
                j++;
                vertice = vertice.sig;
            }
            
            NodoArista aux = vertice.arista;
            irPrimero();
            while (aux != null) 
            {
                j = 0;
                while (aux.direccion != vertice) 
                {
                    vertice = vertice.sig;
                    j++;
                }
                matrix[i][j] = true;
                aux = aux.abajo;
                irPrimero();
            }
        }
        return matrix;
    }
    
    public String camino (char c[]){
        
        String auxS = "";
        
        for(int i = 0; i < c.length - 1; i++)
        {
            if(buscarVertice(c[i]).buscarArista(buscarVertice(c[i + 1])) != null)
            {
                auxS = " sí existe:) ";
            }
            
            else
            {
                auxS = " no existe:( ";
            }
        }
        return auxS;
    
    }
}
