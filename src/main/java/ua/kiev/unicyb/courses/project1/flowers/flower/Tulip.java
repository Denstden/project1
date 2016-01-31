package ua.kiev.unicyb.courses.project1.flowers.flower;

import ua.kiev.unicyb.courses.project1.flowers.flower.colors.TulipColor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Class Tulip is a class that allows to create one of the types of {@link AbstractFlower} tulip.</p>
 * Object <code>Tulip</code> inherits all fields of class {@link AbstractFlower} and extends it with the one parameter
 * <code>color</code>
 * <ul>
 * <li><code>color</code> - an object of type {@link TulipColor}</li>
 * </ul>
 *
 * @author Denst
 * @version 1.0
 * @see AbstractFlower
 * @see TulipColor
 */
public class Tulip extends AbstractFlower {
    /**
     * the price of a red tulip.
     */
    private static final double RED_TULIP_PRICE = 20;
    /**
     * the price of a black tulip.
     */
    private static final double BLACK_TULIP_PRICE = 30;
    /**
     * the {@link TulipColor} of a tulip.
     */
    private TulipColor color;

    /**
     * Creates a new tulip with the given <code>color</code>.
     *
     * @param stemLength the length of stem of a created tulip.
     * @param color      the color of a created tulip.
     */
    public Tulip(double stemLength, TulipColor color) {
        super("Tulip", stemLength, 0);
        switch (color) {
            case RED: {
                setPrice(RED_TULIP_PRICE * stemLength / 20);
                break;
            }
            case BLACK: {
                setPrice(BLACK_TULIP_PRICE * stemLength / 20);
                break;
            }
        }
        this.color = color;
    }

    /**
     * Creates a new tulip with the given <code>dateOfDelivery</code> and <code>color</code>.
     *
     * @param stemLength     the length of stem of a created tulip.
     * @param dateOfDelivery the date of delivery of a created tulip.
     * @param color          the color of a created tulip.
     */
    public Tulip(double stemLength, Date dateOfDelivery, TulipColor color) {
        super("Tulip", stemLength, dateOfDelivery, 0);
        switch (color) {
            case RED: {
                setPrice(RED_TULIP_PRICE * stemLength / 10);
                break;
            }
            case BLACK: {
                setPrice(BLACK_TULIP_PRICE * stemLength / 10);
                break;
            }
        }
        this.color = color;
    }

    public TulipColor getColor() {
        return color;
    }

    public void setColor(TulipColor color) {
        this.color = color;
    }

    /**
     * Returns a string representation of a tulip.
     *
     * @return a string of the form <code>Tulip{dateOfDelivery=dd.MM.yyyy, price=price, color=color}</code>.
     */
    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return "Tulip{" +
                "stemLength=" + getStemLength() +
                ", dateOfDelivery=" + format.format(getDateOfDelivery()) +
                ", price=" + getPrice() +
                ", color=" + color +
                "}";
    }
}
