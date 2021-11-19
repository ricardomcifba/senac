/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba.senac.projeto1;

/**
 *
 * @author Ricardo
 */
public class Aluno {
    
    String nome;
    double altura;
    String corDeCabelo;
    int idade;
    
    public Aluno(String nome, double altura, String corDeCabelo, int idade){
        
        this.nome = nome;
        this.altura = altura;
        this.corDeCabelo = corDeCabelo;
        this.idade = idade;
        
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public double altura()
    {
        return altura;
    }
    
    public String corDeCabelo()
    {
        return corDeCabelo;
    }
    public int idade()
    {
        return idade;
    }
    
    public void setNome(String aluno)
    {
        this.nome = nome;
    }
        
        
}
