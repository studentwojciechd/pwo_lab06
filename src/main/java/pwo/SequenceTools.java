package pwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author wojciech
 */
public class SequenceTools {

    /**
     *
     * @param generator
     * @param from
     * @param to
     * @param fileName
     * @return
     */
    public static boolean writeToFile(
            FibonacciGenerator generator,
            int from, int to,
            String fileName) {
        try {
            BufferedWriter writer
                    = new BufferedWriter(new FileWriter(fileName));
            for (int i = from; i <= to; i++) {
                writer.write(generator.getTerm(i) + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}
