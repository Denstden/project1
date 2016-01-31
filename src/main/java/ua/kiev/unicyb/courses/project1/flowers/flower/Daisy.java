package ua.kiev.unicyb.courses.project1.flowers.flower;

import ua.kiev.unicyb.courses.project1.flowers.flower.colors.DaisyColor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Class Daisy is a class that allows to create one of the types of {@link AbstractFlower} daisy.</p>
 * Object <code>Daisy</code> inherits all fields of class {@link AbstractFlower} and extends it with the one parameter
 * <code>color</code>
 * <ul>
 * <li><code>color</code> - an object of type {@link DaisyColor}</li>
 * </ul>
 *
 * @author Denst
 * @version 1.0
 * @see AbstractFlower
 * @see DaisyColor
 */
public class Daisy extends AbstractFlower {
    /**
     * the price of a blue daisy.
     */
    private static final double BLUE_DAISY_PRICE = 12.5;
    /**
     * the price of a white daisy.
     */
    private static final double WHITE_DAISY_PRICE = 10.5;
    /**
     * the {@link DaisyColor} of a daisy.
     */
    private DaisyColor color;

    /**
     * Creates a new daisy with the given <code>color</code>.
     *
     * @param stemLength the length of stem of a created daisy.
     * @param color the color of a created daisy.
     */
    public Daisy(double stemLength, DaisyColor color) {
        super("Daisy", stemLength, 0);
        switch (color) {
            case BLUE: {
                setPrice(BLUE_DAISY_PRICE*((int)(stemLength/30)+1));
                break;
            }
            case WHITE: {
                setPrice(WHITE_DAISY_PRICE*((int)(stemLength/30)+1));
                break;
            }
        }
        this.color = color;
    }

    /**
     * Creates a new daisy with the given <code>dateOfDelivery</code> and <code>color</code>.
     *
     * @param stemLength the length of stem of a created daisy.
     * @param dateOfDelivery the date of delivery of a created daisy.
     * @param color          the color of a created daisy.
     */
    public Daisy(double stemLength, Date dateOfDelivery, DaisyColor color) {
        super("Daisy", stemLength, dateOfDelivery, 0);
        switch (color) {
            case BLUE: {
                setPrice(BLUE_DAISY_PRICE*((int)(stemLength/30)+1));
                break;
            }
            case WHITE: {
                setPrice(WHITE_DAISY_PRICE*((int)(stemLength/30)+1));
                break;
            }
        }
        this.color = color;
    }

    public DaisyColor getColor() {
        return color;
    }

    public void setColor(DaisyColor color) {
        this.color = color;
    }

    /**
     * Returns a string representation of a daisy.
     *
     * @return a string of the form <code>Daisy{dateOfDelivery=dd.MM.yyyy, price=price, color=color}</code>.
     */
    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return "Daisy{" +
                "dateOfDelivery=" + format.format(getDateOfDelivery()) +
                ", price=" + getPrice() +
                ", color=" + color +
                "}";
    }
}