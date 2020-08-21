import exceptions.DukeException;
import exceptions.WrongDateFormatException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateParser {

    private static final String format = "dd MMM uuuu HHmm";
    private static final String readableFormat = "DD MMM YYYY HHMM";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

    public static LocalDateTime parseString(String dateTime) throws WrongDateFormatException {
        try {
            LocalDateTime result = LocalDateTime.parse(dateTime, DateParser.formatter);
            return result;
        } catch (DateTimeParseException e) {
            throw new WrongDateFormatException(DateParser.readableFormat);
        }
    }

    public static LocalDateTime parseIso(String isoString) throws WrongDateFormatException {
        try {
            LocalDateTime result = LocalDateTime.parse(isoString);
            return result;
        } catch (DateTimeParseException e) {
            throw new WrongDateFormatException("YYYY-MM-DDTHH:MM");
        }
    }

}
