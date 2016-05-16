/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author willian.carvalho
 */
@Entity
@Table(name = "cliente", catalog = "projetohospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente_1.findAll", query = "SELECT c FROM Cliente_1 c"),
    @NamedQuery(name = "Cliente_1.findByCodigo", query = "SELECT c FROM Cliente_1 c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Cliente_1.findByNome", query = "SELECT c FROM Cliente_1 c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente_1.findByEndereco", query = "SELECT c FROM Cliente_1 c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Cliente_1.findByBairro", query = "SELECT c FROM Cliente_1 c WHERE c.bairro = :bairro"),
    @NamedQuery(name = "Cliente_1.findByCidade", query = "SELECT c FROM Cliente_1 c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Cliente_1.findByEstado", query = "SELECT c FROM Cliente_1 c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cliente_1.findByCep", query = "SELECT c FROM Cliente_1 c WHERE c.cep = :cep"),
    @NamedQuery(name = "Cliente_1.findBySexo", query = "SELECT c FROM Cliente_1 c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "Cliente_1.findByTelefone", query = "SELECT c FROM Cliente_1 c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Cliente_1.findByCelular", query = "SELECT c FROM Cliente_1 c WHERE c.celular = :celular"),
    @NamedQuery(name = "Cliente_1.findByCadastro", query = "SELECT c FROM Cliente_1 c WHERE c.cadastro = :cadastro"),
    @NamedQuery(name = "Cliente_1.findByConvenioCodigo", query = "SELECT c FROM Cliente_1 c WHERE c.convenioCodigo = :convenioCodigo"),
    @NamedQuery(name = "Cliente_1.findByAtivo", query = "SELECT c FROM Cliente_1 c WHERE c.ativo = :ativo"),
    @NamedQuery(name = "Cliente_1.findByDeletado", query = "SELECT c FROM Cliente_1 c WHERE c.deletado = :deletado")})
public class Cliente_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    @Column(name = "cep")
    private String cep;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "telefone")
    private Integer telefone;
    @Column(name = "celular")
    private Integer celular;
    @Column(name = "cadastro")
    @Temporal(TemporalType.DATE)
    private Date cadastro;
    @Basic(optional = false)
    @Column(name = "convenio_codigo")
    private int convenioCodigo;
    @Column(name = "ativo")
    private String ativo;
    @Column(name = "deletado")
    private String deletado;

    public Cliente_1() {
    }

    public Cliente_1(Integer codigo) {
        this.codigo = codigo;
    }

    public Cliente_1(Integer codigo, int convenioCodigo) {
        this.codigo = codigo;
        this.convenioCodigo = convenioCodigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        Integer oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        Integer oldCelular = this.celular;
        this.celular = celular;
        changeSupport.firePropertyChange("celular", oldCelular, celular);
    }

    public Date getCadastro() {
        return cadastro;
    }

    public void setCadastro(Date cadastro) {
        Date oldCadastro = this.cadastro;
        this.cadastro = cadastro;
        changeSupport.firePropertyChange("cadastro", oldCadastro, cadastro);
    }

    public int getConvenioCodigo() {
        return convenioCodigo;
    }

    public void setConvenioCodigo(int convenioCodigo) {
        int oldConvenioCodigo = this.convenioCodigo;
        this.convenioCodigo = convenioCodigo;
        changeSupport.firePropertyChange("convenioCodigo", oldConvenioCodigo, convenioCodigo);
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        String oldAtivo = this.ativo;
        this.ativo = ativo;
        changeSupport.firePropertyChange("ativo", oldAtivo, ativo);
    }

    public String getDeletado() {
        return deletado;
    }

    public void setDeletado(String deletado) {
        String oldDeletado = this.deletado;
        this.deletado = deletado;
        changeSupport.firePropertyChange("deletado", oldDeletado, deletado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente_1)) {
            return false;
        }
        Cliente_1 other = (Cliente_1) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projeto.Cliente_1[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
