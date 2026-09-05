package com.algaworks.algadelivery.delivery.tracking.domain.event;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@ToString
@JsonTypeName("delivery-pick-up-event")
public class DeliveryPickUpEvent {
    private final OffsetDateTime occurredAt;
    private final UUID deliveryId;
}