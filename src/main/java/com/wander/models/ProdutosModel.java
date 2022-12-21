/*
 * Model: ProdutosModel
 * @author Wanderlei Silva do Carmo <wander.silva@gmail.com>
 * @version 20221221;
 *
 */
package com.wander.models;

import com.wander.entities.Produto;
import com.wander.persistence.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wande
 */
public class ProdutosModel {

    private PreparedStatement pstm;

    private ArrayList<Produto> lstProdutos;


    public ArrayList<Produto> carregarProdutos() {

        try {
            
            Connection conexao = Conexao.conectar();
            lstProdutos = new ArrayList<>();
            
            String sql = "select * from produtos";

            pstm = conexao.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();

            lstProdutos.clear();

            while (rs.next()) {

                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao").toUpperCase());
                produto.setPrecoCusto(rs.getFloat("preco_custo"));
                produto.setPrecoVenda(rs.getFloat("preco_venda"));

                lstProdutos.add(produto);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutosModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstProdutos;

    }

   
}
