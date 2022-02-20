package com.i3market.semanticengine.common.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.i3market.semanticengine.common.domain.entity.OfferingGeneralContext;
import lombok.Builder;
import lombok.ToString;
import lombok.Value;

import static org.apache.commons.lang3.StringUtils.EMPTY;

@Value
@Builder(builderClassName = "Builder", toBuilder = true)
@JsonDeserialize(builder = DataOfferingDto.Builder.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataOfferingDto {

    OfferingGeneralContext context;

    String id;

    @lombok.Builder.Default
    String type = "http://i3-market.eu/backplane/core/DataOffering";

    String provider;

    String marketId;

    String owner;

    @ToString.Include
    String dataOfferingTitle;

    @ToString.Include
    String dataOfferingDescription;

    @ToString.Include
    String category;

    @ToString.Include
    String status;

    @ToString.Include
    String dataOfferingExpirationTime;

    @ToString.Include
    String createdAt;

    @ToString.Include
    String updatedAt;

    ContractParametersDto contractParameters;

    PricingModelDto hasPricingModel;

    DatasetDto hasDataset;

    @JsonPOJOBuilder(withPrefix = EMPTY)
    public static class Builder {
    }
}
