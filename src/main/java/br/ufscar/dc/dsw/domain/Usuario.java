package br.ufscar.dc.dsw.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@SuppressWarnings("serial")
@Entity
@Table(name = "Usuario")
public class Usuario extends AbstractEntity<Long> {
  
	@NotBlank
    @Column(nullable = false, length = 20, unique = true)
    private String email;
    
	@NotBlank
    @Column(nullable = false, length = 64)
    private String password;
       
    @NotBlank
    @Column(nullable = false, length = 60)
    private String name;
    
    @NotBlank
    @Column(nullable = false, length = 14)
    private String CPF;
    
    @NotBlank
    @Size(min = 10, max = 20, message = "{Size.cliente.telefone}")
    @Column(name = "telefone", nullable = false, length = 20)
    private String telefone;

    @NotBlank
    @Column(name = "sexo", nullable = false)
    private String sexo;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past()
    @NotNull(message = "{NotBlank.usuario.dataNascimento}")
    @Column(name = "dataNascimento", nullable = false)
    private Date dataNascimento;
    
    @NotBlank
    @Column(nullable = false, length = 10)
    private String role;
    
    @Column(nullable = false)
    private boolean enabled;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
