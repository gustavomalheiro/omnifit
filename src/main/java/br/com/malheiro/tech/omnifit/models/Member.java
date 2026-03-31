package br.com.malheiro.tech.omnifit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    private UUID id;
    private String fullName;
    private String cpf;
    private String email;
}
