package ua.kiev.unicyb.courses.project1.flowers.bouquet;

import ua.kiev.unicyb.courses.project1.flowers.flower.AbstractFlower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>Class BouquetOfFlowers is a class that allows to create a bouquet of different {@link AbstractFlower} with
 * accessories(wrapper, ribbon) and get the price of the bouquet.</p>
 * Object <code>BouquetOfFlowers</code> defines bouquet of abstractFlowers in a form of four parameters
 * <code>totalPrice/wrapper/ribbon/abstractFlowers</code>, where
 * <ul>
 * <li><code>totalPrice</code> - an object of type {@link Double}</li>
 * <li><code>wrapper</code> - an object of type {@link Boolean}</li>
 * <li><code>ribbon</code> - an object of type {@link Boolean}</li>
 * <li><code>abstractFlowers</code> - an object of type {@link List}</li>
 * </ul>
 *
 * @author Denst
 * @version 1.0
 * @see AbstractFlower
 */
public class BouquetOfFlowers {
    /**
     * the price of a wrapper.
     */
    private static final double WRAPPER_PRICE = 10;
    /**
     * the price of a ribbon.
     */
    private static final double RIBBON_PRICE = 3;
    /**
     * the total price of a bouquet.
     */
    private double totalPrice = 0;
    /**
     * the presence of a wrapper in a bouquet.
     */
    private boolean wrapper = false;
    /**
     * the presence of a ribbon in a bouquet.
     */
    private boolean ribbon = false;
    /**
     * abstractFlowers, which make up a bouquet.
     */
    private List<AbstractFlower> abstractFlowers;

    /**
     * Creates a new bouquet without abstractFlowers.
     */
    public BouquetOfFlowers() {
        abstractFlowers = new ArrayList<>();
    }

    /**
     * Creates a new bouquet which consist of the <code>abstractFlowers</code>.
     *
     * @param abstractFlowers list of abstractFlowers, which make up a new bouquet
     */
    public BouquetOfFlowers(List<AbstractFlower> abstractFlowers) {
        this.abstractFlowers = abstractFlowers;
        for (AbstractFlower abstractFlower : abstractFlowers) {
            totalPrice += abstractFlower.getPrice();
        }
    }

    /**
     * Adds a <code>abstractFlower</code> in a bouquet.
     *
     * @param abstractFlower abstractFlower to add to the bouquet
     */
    public void addFlower(AbstractFlower abstractFlower) {
        abstractFlowers.add(abstractFlower);
        totalPrice += abstractFlower.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static double getWrapperPrice() {
        return WRAPPER_PRICE;
    }

    public static double getRibbonPrice() {
        return RIBBON_PRICE;
    }

    public List<AbstractFlower> getAbstractFlowers() {
        return abstractFlowers;
    }

    public void setAbstractFlowers(List<AbstractFlower> abstractFlowers) {
        this.abstractFlowers = abstractFlowers;
    }

    /**
     * Adds a wrapper in a bouquet.
     *
     * @return <code>true</code> if the bouquet is not empty and if no wrapper in the bouquet
     * <code>false</code> else
     */
    public boolean addWrapper() {
        if (!abstractFlowers.isEmpty() && !wrapper) {
            totalPrice += WRAPPER_PRICE;
            wrapper = true;
            return true;
        }
        return false;
    }

    /**
     * Adds a ribbon in a bouquet.
     *
     * @return <code>true</code> if the bouquet is not empty and if no ribbon in the bouquet
     * <code>false</code> else
     */
    public boolean addRibbon() {
        if (!abstractFlowers.isEmpty() && !ribbon) {
            totalPrice += RIBBON_PRICE;
            ribbon = true;
        }
        return false;
    }

    /**
     * Sorts the list of abstractFlowers by freshness.
     */
    public void sortFlowersByFreshness() {
        Collections.sort(abstractFlowers);
    }

    /**
     * Finds a flower in the bouquet, corresponding to a predetermined range of stems lengths.
     *
     * @param stemLengthFrom minimum allowed stems length.
     * @param stemLengthTo maximum allowed stems length.
     * @return flower, stems length which is in range [stemLengthFrom;stemLengthTo].
     */
    public AbstractFlower findFlowerInRangeStemLength(double stemLengthFrom, double stemLengthTo){
        double stemLength;
        for (AbstractFlower abstractFlower : abstractFlowers){
            stemLength = abstractFlower.getStemLength();
            if (stemLength>=stemLengthFrom && stemLength<=stemLengthTo){
                return abstractFlower;
            }
        }
        return null;
    }
    /**
     * @return a string representation of a bouquet.
     */
    @Override
    public String toString() {
        if (abstractFlowers.isEmpty()){
            return "Bouquet is empty.";
        }
        String res = "";
        for (AbstractFlower abstractFlower : abstractFlowers) {
            res += abstractFlower + "\r\n";
        }
        res+="Wrapper: "+wrapper+"\r\nRibbon: "+ribbon;
        return res;
    }
}
