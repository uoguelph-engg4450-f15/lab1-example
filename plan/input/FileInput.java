package plan.input;

import java.io.*;
import plan.dom.*;

/** Interface for reading input data from a file */
public interface FileInput {
    /** Read objects from the indicated file.
     *  @param filenane the pathname of the file to read
     *  @throws FileNotFoundException when the file cannot be found
     *  @throws IOException when the file cannot be read
     *  @return a Company root object to which all others are connected
     */
    public Company readFile(String filename) throws FileNotFoundException, IOException;
}
