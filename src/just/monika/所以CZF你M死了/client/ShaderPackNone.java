package just.monika.所以CZF你M死了.client;

import java.io.InputStream;

public class ShaderPackNone implements IShaderPack
{
    public void close() {}

    public InputStream getResourceAsStream(String resName)
    {
        return null;
    }

    public boolean hasDirectory(String name)
    {
        return false;
    }

    public String getName()
    {
        return Shaders.packNameNone;
    }
}
