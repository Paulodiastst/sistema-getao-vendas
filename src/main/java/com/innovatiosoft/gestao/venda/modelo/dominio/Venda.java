/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.innovatiosoft.gestao.venda.modelo.dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author paulo
 */
public class Venda {
    
    private Long Id;
    private Cliente cliente;
    private Usuario usuario;
    private BigDecimal valorPago;
    private BigDecimal desconto;
    private BigDecimal troco;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimaActualização;

    public Venda() {
    }

    public Venda(Long Id, Cliente cliente, Usuario usuario, BigDecimal valorPago, BigDecimal desconto, BigDecimal troco, LocalDateTime dataHoraCriacao, LocalDateTime ultimaActualização) {
        this.Id = Id;
        this.cliente = cliente;
        this.usuario = usuario;
        this.valorPago = valorPago;
        this.desconto = desconto;
        this.troco = troco;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimaActualização = ultimaActualização;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimaActualização() {
        return ultimaActualização;
    }

    public void setUltimaActualização(LocalDateTime ultimaActualização) {
        this.ultimaActualização = ultimaActualização;
    }
    
    
    
    
}
