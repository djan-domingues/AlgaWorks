package com.algaworks.algafoods.di.notificacao;

import com.algaworks.algafoods.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}