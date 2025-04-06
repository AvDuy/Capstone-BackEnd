package org.capstone.backend.dto.challenge;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class InviteMemberRequest {
    @NotNull(message = "Challenge ID cannot be null")
    private Long challengeId;

    @NotNull(message = "Member IDs cannot be null")
    private List<Long> memberIds;
}
