package hello;

import javax.activation.DataSource;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;

public class InputStreamDataSource implements DataSource {
    private InputStream inputStream;

    public InputStreamDataSource(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return inputStream;
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String getContentType() {
        return "image/png";
    }

    @Override
    public String getName() {
        return "InputStreamDataSource";
    }
}