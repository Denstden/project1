package ua.kiev.unicyb.courses.project1.flowers.bouquet;

import ua.kiev.unicyb.courses.project1.flowers.flower.AbstractFlower;
import ua.kiev.unicyb.courses.project1.flowers.flower.FlowerBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <p>BouquetCreator is a class which create {@link BouquetOfFlowers} using the input file.</p>
 *
 * @author Denst
 * @version 1.0
 * @see BouquetOfFlowers
 * @see FlowerBuilder
 */
public class BouquetCreator {
    /**
     * the name of a file, where does the information on flowers.
     */
    private String filename;


    public BouquetCreator() {
    }

    /**
     * @param filename the name of a file, where does the information on flowers.
     */
    public BouquetCreator(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Creates a bouquet of flowers, using the input file.
     *
     * @return a bouquet of flowers.
     */
    public BouquetOfFlowers create() {
        BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers();
        FlowerBuilder flowerBuilder = new FlowerBuilder();
        try {
            Scanner scanner = new Scanner(new File(filename));
            AbstractFlower abstractFlower;
            String line;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                if (line.equals("wrapper"))
                    bouquetOfFlowers.addWrapper();
                else if (line.equals("ribbon"))
                    bouquetOfFlowers.addRibbon();
                else {
                    abstractFlower = flowerBuilder.build(line);
                    if (abstractFlower != null)
                        bouquetOfFlowers.addFlower(abstractFlower);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File " + filename + " not found.");
            System.exit(-1);
        }
        return bouquetOfFlowers;
    }
}
