package br.com.etechoracio.exercicio20.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.exercicio20.enums.StatusAgenteEnum;
import br.com.etechoracio.exercicio20.enums.TipoAgenteEnum;


@Entity
@Table(name="TBL_AGENTE_AUTUADOR")
public class AgenteAutuador {

	
	@Id
	@GeneratedValue
	@Column(name="ID_AGENTE")
	private Long id;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Column(name="TP_AGENTE")
	private String tefelone;
	
	@Enumerated(EnumType.STRING)
	private TipoAgenteEnum tipo;
	
	@Enumerated(EnumType.STRING)
	@Column (name="TX_FONE")
	private StatusAgenteEnum status;
}
