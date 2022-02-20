package com.i3market.semanticengine.common.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(onlyExplicitlyIncluded = true)
@Document(collection = "data_provider_t")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataProviderEntity implements Serializable {
    

    @Id
    String id;

    @Indexed(unique = true)
    @NonNull
    String providerId;

    @NonNull
    String name;

    @Builder.Default
    String description = null;

    String createdAt;

    String updatedAt;

    List<OrganizationEntity> organization = new ArrayList<>();

}
