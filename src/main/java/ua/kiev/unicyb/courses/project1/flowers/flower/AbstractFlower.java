package ua.kiev.unicyb.courses.project1.flowers.flower;

import java.util.Date;

/**
 * <p>AbstractFlower is abstract base class for all kinds of flowers.</p>
 * Object <code>AbstractFlower</code> defines flower in a form of three parameters <code>name/stemLength/dateOfDelivery/price</code>, where
 * <ul>
 * <li><code>name</code> - an object of type {@link String}</li>
 * <li><code>stemLength</code> - an object of type {@link Double}</li>
 * <li><code>dateOfDelivery</code> - an object of type {@link Date}</li>
 * <li><code>price</code> - an object of type {@link Double}</li>
 * </ul>
 *
 * @author Denst
 * @version 1.0
 */
abstract public class AbstractFlower implements Comparable<AbstractFlower> {
    /**
     * the name of a flower.
     */
    private String name;
    /**
     * the roses stem length.
     */
    private double stemLength;
    /**
     * the date of delivery.
     */
    private Date dateOfDelivery;
    /**
     * the price of a flower.
     */
    private double price;

    /**
     * Creates a new flower with the given <code>name</code> and <code>price</code>.
     *
     * @param name  the name of a created flower.
     * @param stemLength the length of stem of a created flower.
     * @param price the price of a created flower.
     */
    public AbstractFlower(String name, double stemLength, double price) {
        this.name = name;
        this.stemLength = stemLength;
        this.dateOfDelivery = new Date();
        this.price = price;
    }

    /**
     * Creates a new flower with the given <code>name</code>, <code>dateOfDelivery</code> and <code>price</code>.
     *
     * @param name           the name of a created flower.
     * @param stemLength the length of stem of a created flower.
     * @param dateOfDelivery the date of delivery of a created flower.
     * @param price          the price of a created flower.
     */
    public AbstractFlower(String name, double stemLength, Date dateOfDelivery, double price) {
        this.name = name;
        this.stemLength = stemLength;
        this.dateOfDelivery = dateOfDelivery;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStemLength() {
        return stemLength;
    }

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Compares the flower to another flower.
     *
     * @param other flower to comparison.
     * @return <code>1</code> if date of delivery this flower is more than date of delivery <code>other</code> flower,
     * <code>-1</code> if date of delivery this flower is less than date of delivery <code>other</code> flower,
     * <code>0</code> if dates of delivery this flower and <code>other</code> flower coincide.
     * @throws NullPointerException if <code>other</code> is <code>null</code>.
     */
    @Override
    public int compareTo(AbstractFlower other) {
        if (other == null)
            throw new NullPointerException();
        return dateOfDelivery.compareTo(other.dateOfDelivery);
    }
}
