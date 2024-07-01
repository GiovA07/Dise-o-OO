package decorator.io;

import java.io.*;

public class LineCont extends FilterInputStream {

    private int lineCount = 0;

    protected LineCont(InputStream in) {
        super(in);
    }
    
    public int read() throws IOException {
        int c = in.read();
        if (c == '\n')
            lineCount++;
        
        return c;
    }

    public int getLineCount(){
        return lineCount;
    }
}
