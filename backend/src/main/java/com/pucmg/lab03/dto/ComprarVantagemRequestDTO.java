package com.pucmg.lab03.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
public class ComprarVantagemRequestDTO {
    private Long alunoId;
    private Long vantagemId;
}
