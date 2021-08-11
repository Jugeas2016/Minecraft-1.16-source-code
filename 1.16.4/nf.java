/*      */ import com.mojang.serialization.Codec;
/*      */ import com.mojang.serialization.DataResult;
/*      */ import io.netty.buffer.ByteBuf;
/*      */ import io.netty.buffer.ByteBufAllocator;
/*      */ import io.netty.buffer.ByteBufInputStream;
/*      */ import io.netty.buffer.ByteBufOutputStream;
/*      */ import io.netty.handler.codec.DecoderException;
/*      */ import io.netty.handler.codec.EncoderException;
/*      */ import io.netty.util.ByteProcessor;
/*      */ import io.netty.util.ReferenceCounted;
/*      */ import java.io.DataInput;
/*      */ import java.io.DataOutput;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.ByteOrder;
/*      */ import java.nio.channels.FileChannel;
/*      */ import java.nio.channels.GatheringByteChannel;
/*      */ import java.nio.channels.ScatteringByteChannel;
/*      */ import java.nio.charset.Charset;
/*      */ import java.nio.charset.StandardCharsets;
/*      */ import java.util.Date;
/*      */ import java.util.UUID;
/*      */ import javax.annotation.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class nf
/*      */   extends ByteBuf
/*      */ {
/*      */   private final ByteBuf a;
/*      */   
/*      */   public nf(ByteBuf ☃) {
/*   58 */     this.a = ☃;
/*      */   }
/*      */   
/*      */   public static int a(int ☃) {
/*   62 */     for (int i = 1; i < 5; i++) {
/*   63 */       if ((☃ & -1 << i * 7) == 0) {
/*   64 */         return i;
/*      */       }
/*      */     } 
/*   67 */     return 5;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T> T a(Codec<T> ☃) throws IOException {
/*   81 */     md md = m();
/*   82 */     DataResult<T> dataResult = ☃.parse(mo.a, md);
/*   83 */     if (dataResult.error().isPresent()) {
/*   84 */       throw new IOException("Failed to decode: " + ((DataResult.PartialResult)dataResult.error().get()).message() + " " + md);
/*      */     }
/*      */     
/*   87 */     return dataResult.result().get();
/*      */   }
/*      */ 
/*      */   
/*      */   public <T> void a(Codec<T> ☃, T t) throws IOException {
/*   92 */     DataResult<mt> dataResult = ☃.encodeStart(mo.a, t);
/*   93 */     if (dataResult.error().isPresent()) {
/*   94 */       throw new IOException("Failed to encode: " + ((DataResult.PartialResult)dataResult.error().get()).message() + " " + t);
/*      */     }
/*   96 */     a(dataResult.result().get());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public nf a(byte[] ☃) {
/*  105 */     d(☃.length);
/*  106 */     writeBytes(☃);
/*      */     
/*  108 */     return this;
/*      */   }
/*      */   
/*      */   public byte[] a() {
/*  112 */     return b(readableBytes());
/*      */   }
/*      */   
/*      */   public byte[] b(int ☃) {
/*  116 */     int i = i();
/*  117 */     if (i > ☃) {
/*  118 */       throw new DecoderException("ByteArray with size " + i + " is bigger than allowed " + ☃);
/*      */     }
/*  120 */     byte[] arrayOfByte = new byte[i];
/*  121 */     readBytes(arrayOfByte);
/*      */     
/*  123 */     return arrayOfByte;
/*      */   }
/*      */   
/*      */   public nf a(int[] ☃) {
/*  127 */     d(☃.length);
/*      */     
/*  129 */     for (int i : ☃) {
/*  130 */       d(i);
/*      */     }
/*      */     
/*  133 */     return this;
/*      */   }
/*      */   
/*      */   public int[] b() {
/*  137 */     return c(readableBytes());
/*      */   }
/*      */   
/*      */   public int[] c(int ☃) {
/*  141 */     int i = i();
/*  142 */     if (i > ☃) {
/*  143 */       throw new DecoderException("VarIntArray with size " + i + " is bigger than allowed " + ☃);
/*      */     }
/*  145 */     int[] arrayOfInt = new int[i];
/*      */     
/*  147 */     for (int j = 0; j < arrayOfInt.length; j++) {
/*  148 */       arrayOfInt[j] = i();
/*      */     }
/*      */     
/*  151 */     return arrayOfInt;
/*      */   }
/*      */   
/*      */   public nf a(long[] ☃) {
/*  155 */     d(☃.length);
/*      */     
/*  157 */     for (long l : ☃) {
/*  158 */       writeLong(l);
/*      */     }
/*      */     
/*  161 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long[] b(@Nullable long[] ☃) {
/*  169 */     return a(☃, readableBytes() / 8);
/*      */   }
/*      */   
/*      */   public long[] a(@Nullable long[] ☃, int i) {
/*  173 */     int j = i();
/*  174 */     if (☃ == null || ☃.length != j) {
/*  175 */       if (j > i) {
/*  176 */         throw new DecoderException("LongArray with size " + j + " is bigger than allowed " + i);
/*      */       }
/*  178 */       ☃ = new long[j];
/*      */     } 
/*      */     
/*  181 */     for (int k = 0; k < ☃.length; k++) {
/*  182 */       ☃[k] = readLong();
/*      */     }
/*      */     
/*  185 */     return ☃;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public fx e() {
/*  201 */     return fx.e(readLong());
/*      */   }
/*      */   
/*      */   public nf a(fx ☃) {
/*  205 */     writeLong(☃.a());
/*  206 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public gp g() {
/*  219 */     return gp.a(readLong());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public nr h() {
/*  228 */     return nr.a.a(e(262144));
/*      */   }
/*      */   
/*      */   public nf a(nr ☃) {
/*  232 */     return a(nr.a.a(☃), 262144);
/*      */   }
/*      */   
/*      */   public <T extends Enum<T>> T a(Class<T> ☃) {
/*  236 */     return (T)((Enum[])☃.getEnumConstants())[i()];
/*      */   }
/*      */   
/*      */   public nf a(Enum<?> ☃) {
/*  240 */     return d(☃.ordinal());
/*      */   }
/*      */   public int i() {
/*      */     byte b;
/*  244 */     int ☃ = 0;
/*  245 */     int i = 0;
/*      */     
/*      */     do {
/*  248 */       b = readByte();
/*      */       
/*  250 */       ☃ |= (b & Byte.MAX_VALUE) << i++ * 7;
/*      */       
/*  252 */       if (i > 5) {
/*  253 */         throw new RuntimeException("VarInt too big");
/*      */       }
/*      */     }
/*  256 */     while ((b & 0x80) == 128);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  261 */     return ☃;
/*      */   }
/*      */   public long j() {
/*      */     byte b;
/*  265 */     long ☃ = 0L;
/*  266 */     int i = 0;
/*      */     
/*      */     do {
/*  269 */       b = readByte();
/*      */       
/*  271 */       ☃ |= (b & Byte.MAX_VALUE) << i++ * 7;
/*      */       
/*  273 */       if (i > 10) {
/*  274 */         throw new RuntimeException("VarLong too big");
/*      */       }
/*      */     }
/*  277 */     while ((b & 0x80) == 128);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  282 */     return ☃;
/*      */   }
/*      */   
/*      */   public nf a(UUID ☃) {
/*  286 */     writeLong(☃.getMostSignificantBits());
/*  287 */     writeLong(☃.getLeastSignificantBits());
/*      */     
/*  289 */     return this;
/*      */   }
/*      */   
/*      */   public UUID k() {
/*  293 */     return new UUID(readLong(), readLong());
/*      */   }
/*      */   
/*      */   public nf d(int ☃) {
/*      */     while (true) {
/*  298 */       if ((☃ & 0xFFFFFF80) == 0) {
/*  299 */         writeByte(☃);
/*  300 */         return this;
/*      */       } 
/*      */       
/*  303 */       writeByte(☃ & 0x7F | 0x80);
/*  304 */       ☃ >>>= 7;
/*      */     } 
/*      */   }
/*      */   
/*      */   public nf b(long ☃) {
/*      */     while (true) {
/*  310 */       if ((☃ & 0xFFFFFFFFFFFFFF80L) == 0L) {
/*  311 */         writeByte((int)☃);
/*  312 */         return this;
/*      */       } 
/*      */       
/*  315 */       writeByte((int)(☃ & 0x7FL) | 0x80);
/*  316 */       ☃ >>>= 7L;
/*      */     } 
/*      */   }
/*      */   
/*      */   public nf a(@Nullable md ☃) {
/*  321 */     if (☃ == null) {
/*  322 */       writeByte(0);
/*      */     } else {
/*      */       try {
/*  325 */         mn.a(☃, (DataOutput)new ByteBufOutputStream(this));
/*  326 */       } catch (IOException iOException) {
/*  327 */         throw new EncoderException(iOException);
/*      */       } 
/*      */     } 
/*      */     
/*  331 */     return this;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public md l() {
/*  336 */     return a(new mm(2097152L));
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public md m() {
/*  341 */     return a(mm.a);
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public md a(mm ☃) {
/*  346 */     int i = readerIndex();
/*  347 */     byte b = readByte();
/*      */     
/*  349 */     if (b == 0) {
/*  350 */       return null;
/*      */     }
/*  352 */     readerIndex(i);
/*      */     try {
/*  354 */       return mn.a((DataInput)new ByteBufInputStream(this), ☃);
/*  355 */     } catch (IOException iOException) {
/*  356 */       throw new EncoderException(iOException);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public nf a(bmb ☃) {
/*  362 */     if (☃.a()) {
/*  363 */       writeBoolean(false);
/*      */     } else {
/*  365 */       writeBoolean(true);
/*  366 */       blx blx = ☃.b();
/*  367 */       d(blx.a(blx));
/*  368 */       writeByte(☃.E());
/*      */       
/*  370 */       md md = null;
/*  371 */       if (blx.k() || blx.n()) {
/*  372 */         md = ☃.o();
/*      */       }
/*  374 */       a(md);
/*      */     } 
/*      */     
/*  377 */     return this;
/*      */   }
/*      */   
/*      */   public bmb n() {
/*  381 */     if (!readBoolean()) {
/*  382 */       return bmb.b;
/*      */     }
/*      */     
/*  385 */     int ☃ = i();
/*  386 */     int i = readByte();
/*      */     
/*  388 */     bmb bmb = new bmb(blx.b(☃), i);
/*  389 */     bmb.c(l());
/*      */     
/*  391 */     return bmb;
/*      */   }
/*      */   
/*      */   public String o() {
/*  395 */     return e(32767);
/*      */   }
/*      */   
/*      */   public String e(int ☃) {
/*  399 */     int i = i();
/*  400 */     if (i > ☃ * 4) {
/*  401 */       throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + i + " > " + (☃ * 4) + ")");
/*      */     }
/*  403 */     if (i < 0) {
/*  404 */       throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
/*      */     }
/*      */     
/*  407 */     String str = toString(readerIndex(), i, StandardCharsets.UTF_8);
/*  408 */     readerIndex(readerIndex() + i);
/*  409 */     if (str.length() > ☃) {
/*  410 */       throw new DecoderException("The received string length is longer than maximum allowed (" + i + " > " + ☃ + ")");
/*      */     }
/*      */     
/*  413 */     return str;
/*      */   }
/*      */   
/*      */   public nf a(String ☃) {
/*  417 */     return a(☃, 32767);
/*      */   }
/*      */   
/*      */   public nf a(String ☃, int i) {
/*  421 */     byte[] arrayOfByte = ☃.getBytes(StandardCharsets.UTF_8);
/*  422 */     if (arrayOfByte.length > i) {
/*  423 */       throw new EncoderException("String too big (was " + arrayOfByte.length + " bytes encoded, max " + i + ")");
/*      */     }
/*  425 */     d(arrayOfByte.length);
/*  426 */     writeBytes(arrayOfByte);
/*  427 */     return this;
/*      */   }
/*      */   
/*      */   public vk p() {
/*  431 */     return new vk(e(32767));
/*      */   }
/*      */   
/*      */   public nf a(vk ☃) {
/*  435 */     a(☃.toString());
/*  436 */     return this;
/*      */   }
/*      */   
/*      */   public Date q() {
/*  440 */     return new Date(readLong());
/*      */   }
/*      */   
/*      */   public nf a(Date ☃) {
/*  444 */     writeLong(☃.getTime());
/*  445 */     return this;
/*      */   }
/*      */   
/*      */   public dcj r() {
/*  449 */     fx ☃ = e();
/*  450 */     gc gc = a(gc.class);
/*  451 */     float f1 = readFloat();
/*  452 */     float f2 = readFloat();
/*  453 */     float f3 = readFloat();
/*  454 */     boolean bool = readBoolean();
/*      */     
/*  456 */     return new dcj(new dcn(☃
/*  457 */           .u() + f1, ☃
/*  458 */           .v() + f2, ☃
/*  459 */           .w() + f3), gc, ☃, bool);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void a(dcj ☃) {
/*  467 */     fx fx = ☃.a();
/*  468 */     a(fx);
/*  469 */     a(☃.b());
/*  470 */     dcn dcn = ☃.e();
/*  471 */     writeFloat((float)(dcn.b - fx.u()));
/*  472 */     writeFloat((float)(dcn.c - fx.v()));
/*  473 */     writeFloat((float)(dcn.d - fx.w()));
/*  474 */     writeBoolean(☃.d());
/*      */   }
/*      */ 
/*      */   
/*      */   public int capacity() {
/*  479 */     return this.a.capacity();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf capacity(int ☃) {
/*  484 */     return this.a.capacity(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int maxCapacity() {
/*  489 */     return this.a.maxCapacity();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBufAllocator alloc() {
/*  494 */     return this.a.alloc();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteOrder order() {
/*  499 */     return this.a.order();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf order(ByteOrder ☃) {
/*  504 */     return this.a.order(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf unwrap() {
/*  509 */     return this.a.unwrap();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isDirect() {
/*  514 */     return this.a.isDirect();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isReadOnly() {
/*  519 */     return this.a.isReadOnly();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf asReadOnly() {
/*  524 */     return this.a.asReadOnly();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readerIndex() {
/*  529 */     return this.a.readerIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readerIndex(int ☃) {
/*  534 */     return this.a.readerIndex(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writerIndex() {
/*  539 */     return this.a.writerIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writerIndex(int ☃) {
/*  544 */     return this.a.writerIndex(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setIndex(int ☃, int i) {
/*  549 */     return this.a.setIndex(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int readableBytes() {
/*  554 */     return this.a.readableBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public int writableBytes() {
/*  559 */     return this.a.writableBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public int maxWritableBytes() {
/*  564 */     return this.a.maxWritableBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isReadable() {
/*  569 */     return this.a.isReadable();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isReadable(int ☃) {
/*  574 */     return this.a.isReadable(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isWritable() {
/*  579 */     return this.a.isWritable();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isWritable(int ☃) {
/*  584 */     return this.a.isWritable(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf clear() {
/*  589 */     return this.a.clear();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf markReaderIndex() {
/*  594 */     return this.a.markReaderIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf resetReaderIndex() {
/*  599 */     return this.a.resetReaderIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf markWriterIndex() {
/*  604 */     return this.a.markWriterIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf resetWriterIndex() {
/*  609 */     return this.a.resetWriterIndex();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf discardReadBytes() {
/*  614 */     return this.a.discardReadBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf discardSomeReadBytes() {
/*  619 */     return this.a.discardSomeReadBytes();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf ensureWritable(int ☃) {
/*  624 */     return this.a.ensureWritable(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int ensureWritable(int ☃, boolean bool) {
/*  629 */     return this.a.ensureWritable(☃, bool);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getBoolean(int ☃) {
/*  634 */     return this.a.getBoolean(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public byte getByte(int ☃) {
/*  639 */     return this.a.getByte(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public short getUnsignedByte(int ☃) {
/*  644 */     return this.a.getUnsignedByte(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public short getShort(int ☃) {
/*  649 */     return this.a.getShort(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public short getShortLE(int ☃) {
/*  654 */     return this.a.getShortLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getUnsignedShort(int ☃) {
/*  659 */     return this.a.getUnsignedShort(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getUnsignedShortLE(int ☃) {
/*  664 */     return this.a.getUnsignedShortLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getMedium(int ☃) {
/*  669 */     return this.a.getMedium(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getMediumLE(int ☃) {
/*  674 */     return this.a.getMediumLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getUnsignedMedium(int ☃) {
/*  679 */     return this.a.getUnsignedMedium(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getUnsignedMediumLE(int ☃) {
/*  684 */     return this.a.getUnsignedMediumLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getInt(int ☃) {
/*  689 */     return this.a.getInt(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getIntLE(int ☃) {
/*  694 */     return this.a.getIntLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public long getUnsignedInt(int ☃) {
/*  699 */     return this.a.getUnsignedInt(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public long getUnsignedIntLE(int ☃) {
/*  704 */     return this.a.getUnsignedIntLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public long getLong(int ☃) {
/*  709 */     return this.a.getLong(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public long getLongLE(int ☃) {
/*  714 */     return this.a.getLongLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public char getChar(int ☃) {
/*  719 */     return this.a.getChar(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public float getFloat(int ☃) {
/*  724 */     return this.a.getFloat(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public double getDouble(int ☃) {
/*  729 */     return this.a.getDouble(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, ByteBuf byteBuf) {
/*  734 */     return this.a.getBytes(☃, byteBuf);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, ByteBuf byteBuf, int i) {
/*  739 */     return this.a.getBytes(☃, byteBuf, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, ByteBuf byteBuf, int i, int j) {
/*  744 */     return this.a.getBytes(☃, byteBuf, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, byte[] arrayOfByte) {
/*  749 */     return this.a.getBytes(☃, arrayOfByte);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, byte[] arrayOfByte, int i, int j) {
/*  754 */     return this.a.getBytes(☃, arrayOfByte, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, ByteBuffer byteBuffer) {
/*  759 */     return this.a.getBytes(☃, byteBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf getBytes(int ☃, OutputStream outputStream, int i) throws IOException {
/*  764 */     return this.a.getBytes(☃, outputStream, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getBytes(int ☃, GatheringByteChannel gatheringByteChannel, int i) throws IOException {
/*  769 */     return this.a.getBytes(☃, gatheringByteChannel, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int getBytes(int ☃, FileChannel fileChannel, long l, int i) throws IOException {
/*  774 */     return this.a.getBytes(☃, fileChannel, l, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public CharSequence getCharSequence(int ☃, int i, Charset charset) {
/*  779 */     return this.a.getCharSequence(☃, i, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBoolean(int ☃, boolean bool) {
/*  784 */     return this.a.setBoolean(☃, bool);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setByte(int ☃, int i) {
/*  789 */     return this.a.setByte(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setShort(int ☃, int i) {
/*  794 */     return this.a.setShort(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setShortLE(int ☃, int i) {
/*  799 */     return this.a.setShortLE(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setMedium(int ☃, int i) {
/*  804 */     return this.a.setMedium(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setMediumLE(int ☃, int i) {
/*  809 */     return this.a.setMediumLE(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setInt(int ☃, int i) {
/*  814 */     return this.a.setInt(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setIntLE(int ☃, int i) {
/*  819 */     return this.a.setIntLE(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setLong(int ☃, long l) {
/*  824 */     return this.a.setLong(☃, l);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setLongLE(int ☃, long l) {
/*  829 */     return this.a.setLongLE(☃, l);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setChar(int ☃, int i) {
/*  834 */     return this.a.setChar(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setFloat(int ☃, float f) {
/*  839 */     return this.a.setFloat(☃, f);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setDouble(int ☃, double d) {
/*  844 */     return this.a.setDouble(☃, d);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, ByteBuf byteBuf) {
/*  849 */     return this.a.setBytes(☃, byteBuf);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, ByteBuf byteBuf, int i) {
/*  854 */     return this.a.setBytes(☃, byteBuf, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, ByteBuf byteBuf, int i, int j) {
/*  859 */     return this.a.setBytes(☃, byteBuf, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, byte[] arrayOfByte) {
/*  864 */     return this.a.setBytes(☃, arrayOfByte);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, byte[] arrayOfByte, int i, int j) {
/*  869 */     return this.a.setBytes(☃, arrayOfByte, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setBytes(int ☃, ByteBuffer byteBuffer) {
/*  874 */     return this.a.setBytes(☃, byteBuffer);
/*      */   }
/*      */ 
/*      */   
/*      */   public int setBytes(int ☃, InputStream inputStream, int i) throws IOException {
/*  879 */     return this.a.setBytes(☃, inputStream, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int setBytes(int ☃, ScatteringByteChannel scatteringByteChannel, int i) throws IOException {
/*  884 */     return this.a.setBytes(☃, scatteringByteChannel, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int setBytes(int ☃, FileChannel fileChannel, long l, int i) throws IOException {
/*  889 */     return this.a.setBytes(☃, fileChannel, l, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf setZero(int ☃, int i) {
/*  894 */     return this.a.setZero(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int setCharSequence(int ☃, CharSequence charSequence, Charset charset) {
/*  899 */     return this.a.setCharSequence(☃, charSequence, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean readBoolean() {
/*  904 */     return this.a.readBoolean();
/*      */   }
/*      */ 
/*      */   
/*      */   public byte readByte() {
/*  909 */     return this.a.readByte();
/*      */   }
/*      */ 
/*      */   
/*      */   public short readUnsignedByte() {
/*  914 */     return this.a.readUnsignedByte();
/*      */   }
/*      */ 
/*      */   
/*      */   public short readShort() {
/*  919 */     return this.a.readShort();
/*      */   }
/*      */ 
/*      */   
/*      */   public short readShortLE() {
/*  924 */     return this.a.readShortLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readUnsignedShort() {
/*  929 */     return this.a.readUnsignedShort();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readUnsignedShortLE() {
/*  934 */     return this.a.readUnsignedShortLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readMedium() {
/*  939 */     return this.a.readMedium();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readMediumLE() {
/*  944 */     return this.a.readMediumLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readUnsignedMedium() {
/*  949 */     return this.a.readUnsignedMedium();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readUnsignedMediumLE() {
/*  954 */     return this.a.readUnsignedMediumLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readInt() {
/*  959 */     return this.a.readInt();
/*      */   }
/*      */ 
/*      */   
/*      */   public int readIntLE() {
/*  964 */     return this.a.readIntLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public long readUnsignedInt() {
/*  969 */     return this.a.readUnsignedInt();
/*      */   }
/*      */ 
/*      */   
/*      */   public long readUnsignedIntLE() {
/*  974 */     return this.a.readUnsignedIntLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public long readLong() {
/*  979 */     return this.a.readLong();
/*      */   }
/*      */ 
/*      */   
/*      */   public long readLongLE() {
/*  984 */     return this.a.readLongLE();
/*      */   }
/*      */ 
/*      */   
/*      */   public char readChar() {
/*  989 */     return this.a.readChar();
/*      */   }
/*      */ 
/*      */   
/*      */   public float readFloat() {
/*  994 */     return this.a.readFloat();
/*      */   }
/*      */ 
/*      */   
/*      */   public double readDouble() {
/*  999 */     return this.a.readDouble();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(int ☃) {
/* 1004 */     return this.a.readBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readSlice(int ☃) {
/* 1009 */     return this.a.readSlice(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readRetainedSlice(int ☃) {
/* 1014 */     return this.a.readRetainedSlice(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(ByteBuf ☃) {
/* 1019 */     return this.a.readBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(ByteBuf ☃, int i) {
/* 1024 */     return this.a.readBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(ByteBuf ☃, int i, int j) {
/* 1029 */     return this.a.readBytes(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(byte[] ☃) {
/* 1034 */     return this.a.readBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(byte[] ☃, int i, int j) {
/* 1039 */     return this.a.readBytes(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(ByteBuffer ☃) {
/* 1044 */     return this.a.readBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf readBytes(OutputStream ☃, int i) throws IOException {
/* 1049 */     return this.a.readBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int readBytes(GatheringByteChannel ☃, int i) throws IOException {
/* 1054 */     return this.a.readBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public CharSequence readCharSequence(int ☃, Charset charset) {
/* 1059 */     return this.a.readCharSequence(☃, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public int readBytes(FileChannel ☃, long l, int i) throws IOException {
/* 1064 */     return this.a.readBytes(☃, l, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf skipBytes(int ☃) {
/* 1069 */     return this.a.skipBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBoolean(boolean ☃) {
/* 1074 */     return this.a.writeBoolean(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeByte(int ☃) {
/* 1079 */     return this.a.writeByte(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeShort(int ☃) {
/* 1084 */     return this.a.writeShort(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeShortLE(int ☃) {
/* 1089 */     return this.a.writeShortLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeMedium(int ☃) {
/* 1094 */     return this.a.writeMedium(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeMediumLE(int ☃) {
/* 1099 */     return this.a.writeMediumLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeInt(int ☃) {
/* 1104 */     return this.a.writeInt(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeIntLE(int ☃) {
/* 1109 */     return this.a.writeIntLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeLong(long ☃) {
/* 1114 */     return this.a.writeLong(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeLongLE(long ☃) {
/* 1119 */     return this.a.writeLongLE(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeChar(int ☃) {
/* 1124 */     return this.a.writeChar(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeFloat(float ☃) {
/* 1129 */     return this.a.writeFloat(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeDouble(double ☃) {
/* 1134 */     return this.a.writeDouble(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(ByteBuf ☃) {
/* 1139 */     return this.a.writeBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(ByteBuf ☃, int i) {
/* 1144 */     return this.a.writeBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(ByteBuf ☃, int i, int j) {
/* 1149 */     return this.a.writeBytes(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(byte[] ☃) {
/* 1154 */     return this.a.writeBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(byte[] ☃, int i, int j) {
/* 1159 */     return this.a.writeBytes(☃, i, j);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeBytes(ByteBuffer ☃) {
/* 1164 */     return this.a.writeBytes(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writeBytes(InputStream ☃, int i) throws IOException {
/* 1169 */     return this.a.writeBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writeBytes(ScatteringByteChannel ☃, int i) throws IOException {
/* 1174 */     return this.a.writeBytes(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writeBytes(FileChannel ☃, long l, int i) throws IOException {
/* 1179 */     return this.a.writeBytes(☃, l, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf writeZero(int ☃) {
/* 1184 */     return this.a.writeZero(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int writeCharSequence(CharSequence ☃, Charset charset) {
/* 1189 */     return this.a.writeCharSequence(☃, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public int indexOf(int ☃, int i, byte b) {
/* 1194 */     return this.a.indexOf(☃, i, b);
/*      */   }
/*      */ 
/*      */   
/*      */   public int bytesBefore(byte ☃) {
/* 1199 */     return this.a.bytesBefore(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int bytesBefore(int ☃, byte b) {
/* 1204 */     return this.a.bytesBefore(☃, b);
/*      */   }
/*      */ 
/*      */   
/*      */   public int bytesBefore(int ☃, int i, byte b) {
/* 1209 */     return this.a.bytesBefore(☃, i, b);
/*      */   }
/*      */ 
/*      */   
/*      */   public int forEachByte(ByteProcessor ☃) {
/* 1214 */     return this.a.forEachByte(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int forEachByte(int ☃, int i, ByteProcessor byteProcessor) {
/* 1219 */     return this.a.forEachByte(☃, i, byteProcessor);
/*      */   }
/*      */ 
/*      */   
/*      */   public int forEachByteDesc(ByteProcessor ☃) {
/* 1224 */     return this.a.forEachByteDesc(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int forEachByteDesc(int ☃, int i, ByteProcessor byteProcessor) {
/* 1229 */     return this.a.forEachByteDesc(☃, i, byteProcessor);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf copy() {
/* 1234 */     return this.a.copy();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf copy(int ☃, int i) {
/* 1239 */     return this.a.copy(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf slice() {
/* 1244 */     return this.a.slice();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retainedSlice() {
/* 1249 */     return this.a.retainedSlice();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf slice(int ☃, int i) {
/* 1254 */     return this.a.slice(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retainedSlice(int ☃, int i) {
/* 1259 */     return this.a.retainedSlice(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf duplicate() {
/* 1264 */     return this.a.duplicate();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retainedDuplicate() {
/* 1269 */     return this.a.retainedDuplicate();
/*      */   }
/*      */ 
/*      */   
/*      */   public int nioBufferCount() {
/* 1274 */     return this.a.nioBufferCount();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer nioBuffer() {
/* 1279 */     return this.a.nioBuffer();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer nioBuffer(int ☃, int i) {
/* 1284 */     return this.a.nioBuffer(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer internalNioBuffer(int ☃, int i) {
/* 1289 */     return this.a.internalNioBuffer(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer[] nioBuffers() {
/* 1294 */     return this.a.nioBuffers();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuffer[] nioBuffers(int ☃, int i) {
/* 1299 */     return this.a.nioBuffers(☃, i);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean hasArray() {
/* 1304 */     return this.a.hasArray();
/*      */   }
/*      */ 
/*      */   
/*      */   public byte[] array() {
/* 1309 */     return this.a.array();
/*      */   }
/*      */ 
/*      */   
/*      */   public int arrayOffset() {
/* 1314 */     return this.a.arrayOffset();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean hasMemoryAddress() {
/* 1319 */     return this.a.hasMemoryAddress();
/*      */   }
/*      */ 
/*      */   
/*      */   public long memoryAddress() {
/* 1324 */     return this.a.memoryAddress();
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString(Charset ☃) {
/* 1329 */     return this.a.toString(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString(int ☃, int i, Charset charset) {
/* 1334 */     return this.a.toString(☃, i, charset);
/*      */   }
/*      */ 
/*      */   
/*      */   public int hashCode() {
/* 1339 */     return this.a.hashCode();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean equals(Object ☃) {
/* 1344 */     return this.a.equals(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int compareTo(ByteBuf ☃) {
/* 1349 */     return this.a.compareTo(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/* 1354 */     return this.a.toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retain(int ☃) {
/* 1359 */     return this.a.retain(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf retain() {
/* 1364 */     return this.a.retain();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf touch() {
/* 1369 */     return this.a.touch();
/*      */   }
/*      */ 
/*      */   
/*      */   public ByteBuf touch(Object ☃) {
/* 1374 */     return this.a.touch(☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public int refCnt() {
/* 1379 */     return this.a.refCnt();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean release() {
/* 1384 */     return this.a.release();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean release(int ☃) {
/* 1389 */     return this.a.release(☃);
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */