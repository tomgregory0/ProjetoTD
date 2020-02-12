package br.com.gx2.entities;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Cursos")
@Data
public class Curso {
	
	@Id
	@Column (name = "codigoCursos")
	
}
