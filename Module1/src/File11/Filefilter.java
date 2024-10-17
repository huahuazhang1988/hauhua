package File11;

import java.io.File;
import java.io.FileFilter;

public class Filefilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().toLowerCase().endsWith(".txt");
    }
}
