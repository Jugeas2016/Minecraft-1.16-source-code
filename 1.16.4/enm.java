import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public interface enm extends Closeable {
  AudioFormat a();
  
  ByteBuffer a(int paramInt) throws IOException;
}


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */