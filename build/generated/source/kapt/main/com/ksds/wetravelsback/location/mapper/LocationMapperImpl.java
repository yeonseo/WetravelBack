package com.ksds.wetravelsback.location.mapper;

import com.ksds.wetravelsback.location.dto.LocationDto;
import com.ksds.wetravelsback.location.entity.Location;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-02T15:58:59+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.21.jar, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class LocationMapperImpl implements LocationMapper {

    @Override
    public Location toEntity(LocationDto.DetailResponse dto) {
        if ( dto == null ) {
            return null;
        }

        Location location = new Location();

        location.setId( dto.getId() );
        location.setCity( dto.getCity() );

        return location;
    }

    @Override
    public LocationDto.DetailResponse toDto(Location entity) {
        if ( entity == null ) {
            return null;
        }

        long id = 0L;
        String city = null;

        if ( entity.getId() != null ) {
            id = entity.getId();
        }
        city = entity.getCity();

        LocationDto.DetailResponse detailResponse = new LocationDto.DetailResponse( id, city );

        return detailResponse;
    }
}
