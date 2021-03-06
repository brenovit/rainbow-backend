package io.github.brenovit.rainbow.payload.colaborador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.github.brenovit.rainbow.models.CursoColaborador;
import io.github.brenovit.rainbow.models.Funcao;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ColaboradorResponse{
	private Long id;
	private Funcao funcao;
	private String nome;
	private String matricula;
	private String foto;
	private String mensagem;
	private List<CursoColaborador> cursos = new ArrayList<>();
	private Long status;	
	private Date dataCriacao;	
	private Date dataAtualizacao;
}
