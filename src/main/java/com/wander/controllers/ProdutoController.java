/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wander.controllers;

import com.wander.entities.Produto;
import com.wander.models.ProdutosModel;
import java.util.ArrayList;


/**
 *
 * @author wande
 */
public class ProdutoController {
    
    protected ProdutosModel model;
    
    public ArrayList<Produto> carregarProdutos(){
    
        model = new ProdutosModel();
       
        return model.carregarProdutos();
    }
    
    public void compararProdutos(){
        
    }
    
}
