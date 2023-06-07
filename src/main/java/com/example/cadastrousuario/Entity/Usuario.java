package com.example.cadastrousuario.Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
private long id;
    private String nome;
    private String gmail;
    private  String senha;


}