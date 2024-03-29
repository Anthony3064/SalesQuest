/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesquest.model;

import java.util.Objects;

/**
 *
 * @author Personal
 */
public class Categoria {
    
    private int idCategoria;
    private String nombreCategoria;
    
    public Categoria (){
    
    }
    
    public Categoria(int idCategoria,String nombreCategoria){
        
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idCategoria;
        hash = 23 * hash + Objects.hashCode(this.nombreCategoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.idCategoria != other.idCategoria) {
            return false;
        }
        if (!Objects.equals(this.nombreCategoria, other.nombreCategoria)) {
            return false;
        }
        return true;
    }
    
    public String toString(){
        return getNombreCategoria();
    }
    
}
