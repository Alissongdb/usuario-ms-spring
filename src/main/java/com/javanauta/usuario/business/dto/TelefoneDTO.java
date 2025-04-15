package com.javanauta.usuario.business.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TelefoneDTO {

    private String numero;
    private String ddd;
}
