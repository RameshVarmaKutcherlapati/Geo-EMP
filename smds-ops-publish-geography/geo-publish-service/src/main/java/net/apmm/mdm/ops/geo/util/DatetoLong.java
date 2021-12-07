package net.apmm.mdm.ops.geo.util;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DatetoLong {

    public long DatetoLongConv(Date dt) throws ParseException {
        long l = dt.getTime();
        return l;

    }
}
