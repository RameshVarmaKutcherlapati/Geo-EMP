package net.apmm.mdm.ops.geo.dao;

import lombok.SneakyThrows;
import net.apmm.mdm.ops.geo.dao.model.GeographyData;
import org.springframework.jdbc.core.RowMapper;
import net.apmm.mdm.ops.geo.util.DatetoLong;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.time.Instant;

public class GeographyMapper implements RowMapper<GeographyData> {

    DatetoLong dl = new DatetoLong();





    @SneakyThrows
    @Override
    public GeographyData mapRow(ResultSet resultSet, int i) throws SQLException {

        DatetoLong dl = new DatetoLong();

        return GeographyData.builder().geoRowID(resultSet.getString("geoRowID"))
                .geoId(resultSet.getString("geoId"))
                .geoType(resultSet.getString("geoType"))
                .name(resultSet.getString("name"))
                .status(resultSet.getString("status"))
                .validFrom(resultSet.getDate("validFrom")!=null? dl.DatetoLongConv(resultSet.getDate("validFrom")) : 0)
                .validTo(resultSet.getDate("validTo")!=null? dl.DatetoLongConv(resultSet.getDate("validTo")) : 0)
                .longitude(resultSet.getString("longitude"))
                .latitude(resultSet.getString("latitude"))
                .timeZone(resultSet.getString("timeZone"))
                .daylightSavingTime(resultSet.getString("daylightSavingTime"))
                .utcOffsetMinutes(resultSet.getString("utcOffsetMinutes"))
                .daylightSavingStart(resultSet.getDate("daylightSavingStart")!=null? dl.DatetoLongConv(resultSet.getDate("daylightSavingStart")) : 0)
                .daylightSavingEnd(resultSet.getDate("daylightSavingEnd")!=null? dl.DatetoLongConv(resultSet.getDate("daylightSavingEnd")) : 0)
                .daylightSavingShiftMinutes(resultSet.getString("daylightSavingShiftMinutes"))
                .description(resultSet.getString("description"))
                .workaroundReason(resultSet.getString("workaroundReason"))
                .restricted(resultSet.getString("restricted"))
                .siteType(resultSet.getString("siteType"))
                .gpsFlag(resultSet.getString("gpsFlag"))
                .gsmFlag(resultSet.getString("gsmFlag"))
                .streetNumber(resultSet.getString("streetNumber"))
                .addressLine1(resultSet.getString("addressLine1"))
                .addressLine2(resultSet.getString("addressLine2"))
                .addressLine3(resultSet.getString("addressLine3"))
                .postalCode(resultSet.getString("postalCode"))
                .postalCodeMandatory(resultSet.getString("postalCodeMandatory"))
                .stateProvinceMandatory(resultSet.getString("stateProvinceMandatory"))
                .dialingCode(resultSet.getString("dialingCode"))
                .dialingCodeDescription(resultSet.getString("dialingCodeDescription"))
                .portFlag(resultSet.getBoolean("portFlag"))
                .olsonTimezone(resultSet.getString("olsonTimezone"))
                .bdaType(resultSet.getString("bdaType"))
                .hsudName(resultSet.getString("hsudName"))
                .build();

    }
}