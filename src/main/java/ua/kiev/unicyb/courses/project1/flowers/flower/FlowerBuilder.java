package ua.kiev.unicyb.courses.project1.flowers.flower;

import com.sun.istack.internal.Nullable;
import ua.kiev.unicyb.courses.project1.flowers.flower.colors.DaisyColor;
import ua.kiev.unicyb.courses.project1.flowers.flower.colors.RouseColor;
import ua.kiev.unicyb.courses.project1.flowers.flower.colors.TulipColor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>FlowerBuilder is a class which from input string builds object {@link AbstractFlower}</p>
 *
 * @author Denst
 * @version 1.0
 * @see AbstractFlower
 * @see Rouse
 * @see Tulip
 * @see Daisy
 */
public class FlowerBuilder {
    /**
     * @param str string, which consists from flowers parameters.
     * @return object AbstractFlower.
     */
    @Nullable
    public AbstractFlower build(String str) {
        String[] fields = str.split(" ");
        if (fields.length < 2 || fields.length > 4) return null;
        switch (fields[0]) {
            case "rouse": {
                if (fields.length == 3) {
                    return parseRouseWithoutDate(fields);
                } else if (fields.length == 4) {
                    return parseRouseWithDate(fields);
                } else {
                    return null;
                }
            }
            case "tulip": {
                if (fields.length == 3) {
                    return parseTulipWithoutDate(fields);
                } else if (fields.length == 4) {
                    return parseTulipWithDate(fields);
                } else {
                    return null;
                }
            }
            case "daisy": {
                if (fields.length == 3) {
                    return parseDaisyWithoutDate(fields);
                } else if (fields.length == 4) {
                    return parseDaisyWithDate(fields);
                } else {
                    return null;
                }
            }
            default: {
                return null;
            }
        }
    }

    /**
     * @param fields array of 3 strings, which consists from rouses parameters.
     * @return object Rouse.
     */
    private Rouse parseRouseWithoutDate(String[] fields) {
        switch (fields[2]) {
            case "red": {
                return new Rouse(Double.parseDouble(fields[1]), RouseColor.RED);
            }
            case "yellow": {
                return new Rouse(Double.parseDouble(fields[1]), RouseColor.YELLOW);
            }
            case "orange": {
                return new Rouse(Double.parseDouble(fields[1]), RouseColor.ORANGE);
            }
            default: {
                return null;
            }
        }
    }

    /**
     * @param fields array of 4 strings, which consists from rouses parameters.
     * @return object Rouse.
     */
    private Rouse parseRouseWithDate(String[] fields) {
        Date date;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy").parse(fields[2]);
        } catch (ParseException e) {
            return null;
        }
        switch (fields[3]) {
            case "red": {
                return new Rouse(date, Double.parseDouble(fields[1]), RouseColor.RED);
            }
            case "yellow": {
                return new Rouse(date, Double.parseDouble(fields[1]), RouseColor.YELLOW);
            }
            case "orange": {
                return new Rouse(date, Double.parseDouble(fields[1]), RouseColor.ORANGE);
            }
            default: {
                return null;
            }
        }
    }

    /**
     * @param fields array of 2 strings, which consists from tulips parameters.
     * @return object Tulip.
     */
    private Tulip parseTulipWithoutDate(String[] fields) {
        switch (fields[2]) {
            case "red": {
                return new Tulip(Double.parseDouble(fields[1]), TulipColor.RED);
            }
            case "black": {
                return new Tulip(Double.parseDouble(fields[1]),TulipColor.BLACK);
            }
            default: {
                return null;
            }
        }
    }

    /**
     * @param fields array of 3 strings, which consists from tulips parameters.
     * @return object Tulip.
     */
    private Tulip parseTulipWithDate(String[] fields) {
        Date date;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy").parse(fields[2]);
        } catch (ParseException e) {
            return null;
        }
        switch (fields[3]) {
            case "red": {
                return new Tulip(Double.parseDouble(fields[1]), date, TulipColor.RED);
            }
            case "black": {
                return new Tulip(Double.parseDouble(fields[1]), date, TulipColor.BLACK);
            }
            default: {
                return null;
            }
        }
    }

    /**
     * @param fields array of 2 strings, which consists from daisies parameters.
     * @return object Tulip.
     */
    private Daisy parseDaisyWithoutDate(String[] fields) {
        switch (fields[2]) {
            case "blue": {
                return new Daisy(Double.parseDouble(fields[1]), DaisyColor.BLUE);
            }
            case "white": {
                return new Daisy(Double.parseDouble(fields[1]),DaisyColor.WHITE);
            }
            default: {
                return null;
            }
        }
    }

    /**
     * @param fields array of 3 strings, which consists from daisies parameters.
     * @return object Tulip.
     */
    private Daisy parseDaisyWithDate(String[] fields) {
        Date date;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy").parse(fields[2]);
        } catch (ParseException e) {
            return null;
        }
        switch (fields[3]) {
            case "blue": {
                return new Daisy(Double.parseDouble(fields[1]), date, DaisyColor.BLUE);
            }
            case "white": {
                return new Daisy(Double.parseDouble(fields[1]), date, DaisyColor.WHITE);
            }
            default: {
                return null;
            }
        }
    }
}
