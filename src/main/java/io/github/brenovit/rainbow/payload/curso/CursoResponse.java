package io.github.brenovit.rainbow.payload.curso;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.github.brenovit.rainbow.models.CursoColaborador;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CursoResponse{
	private Long id;
	private String nome;
	private String codigo;
	private List<CursoColaborador> colaboradores = new ArrayList<>();
	private Date dataCriacao;	
	private Date dataAtualizacao;
}
