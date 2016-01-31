package ua.kiev.unicyb.courses.project1.flowers.flower;

import ua.kiev.unicyb.courses.project1.flowers.flower.colors.RouseColor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Class Rouse is a class that allows to create one of the types of {@link AbstractFlower} rouse.</p>
 * Object <code>Rouse</code> inherits all fields of class {@link AbstractFlower} and extends it with the one parameter
 * <code>color</code>
 * <ul>
 * <li><code>color</code> - an object of type {@link RouseColor}</li>
 * </ul>
 *
 * @author Denst
 * @version 1.0
 * @see AbstractFlower
 * @see RouseColor
 */
public class Rouse extends AbstractFlower {
    /**
     * the price of a red tulip.
     */
    private static final double RED_ROUSE_PRICE = 28;
    /**
     * the price of a black tulip.
     */
    private static final double YELLOW_ROUSE_PRICE = 35;
    /**
     * the price of a black tulip.
     */
    private static final double ORANGE_ROUSE_PRICE = 30;
    /**
     * the {@link RouseColor} of a rouse.
     */
    private RouseColor color;

    /**
     * Creates a new rouse with the given <code>stemLength</code> and <code>color</code>.
     *
     * @param stemLength the length of stem of a created rouse.
     * @param color      the color of a created rouse.
     */
    public Rouse(double stemLength, RouseColor color) {
        super("Rouse", stemLength, 0);
        switch (color) {
            case RED: {
                setPrice(RED_ROUSE_PRICE * stemLength / 50);
                break;
            }
            case YELLOW: {
                setPrice(YELLOW_ROUSE_PRICE * stemLength / 50);
                break;
            }
            case ORANGE: {
                setPrice(ORANGE_ROUSE_PRICE * stemLength / 50);
                break;
            }
        }
        this.color = color;
    }

    /**
     * Creates a new rouse with the given <code>dateOfDelivery</code>, <code>stemLength</code> and <code>color</code>.
     *
     * @param dateOfDelivery the date of delivery of a created rouse.
     * @param stemLength     the length of stem of a created rouse.
     * @param color          the color of a created rouse.
     */
    public Rouse(Date dateOfDelivery, double stemLength, RouseColor color) {
        super("Rouse", stemLength, dateOfDelivery, 0);
        switch (color) {
            case RED: {
                setPrice(RED_ROUSE_PRICE * stemLength / 50);
                break;
            }
            case YELLOW: {
                setPrice(YELLOW_ROUSE_PRICE * stemLength / 50);
                break;
            }
            case ORANGE: {
                setPrice(ORANGE_ROUSE_PRICE * stemLength / 50);
                break;
            }
        }
        this.color = color;
    }

    public RouseColor getColor() {
        return color;
    }

    public void setColor(RouseColor color) {
        this.color = color;
    }

    /**
     * Returns a string representation of a rouse.
     *
     * @return a string of the form <code>Tulip{dateOfDelivery=dd.MM.yyyy, price=price, stemLength=stemLength, color=color}</code>.
     */
    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return "Rouse{" +
                "stemLength=" + getStemLength() +
                ", dateOfDelivery=" + format.format(getDateOfDelivery()) +
                ", price=" + getPrice() +
                ", color=" + color +
                "}";
    }
}
