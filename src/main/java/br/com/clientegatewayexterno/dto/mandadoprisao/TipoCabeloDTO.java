package br.com.clientegatewayexterno.dto.mandadoprisao;


import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/** 
 * Classe para objetos do tipo TipificacaoPenalMandadoPrisaoDTO, onde serão contidos valores e métodos para o mesmo.
 */
public class TipoCabeloDTO implements Serializable {

    private Long id;

    @NotNull
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TipoCabeloDTO tipoCabeloDTO = (TipoCabeloDTO) o;
        if(tipoCabeloDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), tipoCabeloDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TipoCabeloDTO{" +
            "id=" + getId() +
            ", descricao='" + getDescricao() + "'" +
            "}";
    }
}
