package net.apmm.mdm.ops.geo.dao.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Data
@Builder
public class GeographyData {
    private String geoRowID;
    private String geoId;
    private String geoType;
    private String name;
    private String status;
    private LocalDate validFrom;
    private LocalDate validTo;
    private String longitude;
    private String latitude;
    private String timeZone;
    private String daylightSavingTime;
    private String utcOffsetMinutes;
    private LocalDate daylightSavingStart;
    private LocalDate daylightSavingEnd;
    private String daylightSavingShiftMinutes;
    private String description;
    private String workaroundReason;
    private String restricted;
    private String siteType;
    private String gpsFlag;
    private String gsmFlag;
    private String streetNumber;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String postalCode;
    private String postalCodeMandatory;
    private String stateProvinceMandatory;
    private String dialingCode;
    private String dialingCodeDescription;
    private boolean portFlag;
    private String olsonTimezone;
    private String bdaType;
    private String hsudName;
    List<GeographyAlternateNameData> alternateNames;
    List<GeographyAlternateCodesData> alternateCodes;
    List<GeographyFenceData> fence;
    List<GeographyCountryData> country;
    private GeographyParentDetailsData parentDetails;
    List<GeographySubCityParentDetailsData> subCityParentDetails;
    List<GeographyBDADetailsData> bdaDetails;
    List<GeographyBDALocationsDetailsData> bdaLocationsDetails;






}
