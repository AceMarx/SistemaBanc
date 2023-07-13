package classes;
// Generated 07/05/2018 22:38:49 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private String cpf;
     private String nome;
     private String rg;
     private String emissor;
     private String expedicao;
     private String nascimento;
     private String pai;
     private String mae;
     private String naturalidade;
     private String nacionalidade;
     private String sexo;
     private String estadoCivil;
     private String profissao;
     private String rua;
     private String complemento;
     private String bairro;
     private String cidade;
     private String estado;
     private String cep;
     private String telefone;
     private String email;
     private Set transferencias = new HashSet(0);
     private Set contas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String cpf, String nome, String rg, String emissor, String expedicao, String nascimento, String pai, String mae, String naturalidade, String nacionalidade, String sexo, String estadoCivil, String profissao, String rua, String bairro, String cidade, String estado, String cep, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.emissor = emissor;
        this.expedicao = expedicao;
        this.nascimento = nascimento;
        this.pai = pai;
        this.mae = mae;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }
    public Cliente(String cpf, String nome, String rg, String emissor, String expedicao, String nascimento, String pai, String mae, String naturalidade, String nacionalidade, String sexo, String estadoCivil, String profissao, String rua, String complemento, String bairro, String cidade, String estado, String cep, String telefone, String email, Set transferencias, Set contas) {
       this.cpf = cpf;
       this.nome = nome;
       this.rg = rg;
       this.emissor = emissor;
       this.expedicao = expedicao;
       this.nascimento = nascimento;
       this.pai = pai;
       this.mae = mae;
       this.naturalidade = naturalidade;
       this.nacionalidade = nacionalidade;
       this.sexo = sexo;
       this.estadoCivil = estadoCivil;
       this.profissao = profissao;
       this.rua = rua;
       this.complemento = complemento;
       this.bairro = bairro;
       this.cidade = cidade;
       this.estado = estado;
       this.cep = cep;
       this.telefone = telefone;
       this.email = email;
       this.transferencias = transferencias;
       this.contas = contas;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getEmissor() {
        return this.emissor;
    }
    
    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }
    public String getExpedicao() {
        return this.expedicao;
    }
    
    public void setExpedicao(String expedicao) {
        this.expedicao = expedicao;
    }
    public String getNascimento() {
        return this.nascimento;
    }
    
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public String getPai() {
        return this.pai;
    }
    
    public void setPai(String pai) {
        this.pai = pai;
    }
    public String getMae() {
        return this.mae;
    }
    
    public void setMae(String mae) {
        this.mae = mae;
    }
    public String getNaturalidade() {
        return this.naturalidade;
    }
    
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getRua() {
        return this.rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getTransferencias() {
        return this.transferencias;
    }
    
    public void setTransferencias(Set transferencias) {
        this.transferencias = transferencias;
    }
    public Set getContas() {
        return this.contas;
    }
    
    public void setContas(Set contas) {
        this.contas = contas;
    }




}


