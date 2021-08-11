/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cha
/*    */ {
/* 16 */   private static final Int2ObjectMap<cha> d = (Int2ObjectMap<cha>)new Int2ObjectOpenHashMap();
/*    */   
/* 18 */   public static final cha a = a(new cha(1, java.util.zip.GZIPInputStream::new, java.util.zip.GZIPOutputStream::new));
/* 19 */   public static final cha b = a(new cha(2, java.util.zip.InflaterInputStream::new, java.util.zip.DeflaterOutputStream::new)); public static final cha c; static {
/* 20 */     c = a(new cha(3, ☃ -> ☃, ☃ -> ☃));
/*    */   }
/*    */   private final int e;
/*    */   private final a<InputStream> f;
/*    */   private final a<OutputStream> g;
/*    */   
/*    */   private cha(int ☃, a<InputStream> a1, a<OutputStream> a2) {
/* 27 */     this.e = ☃;
/* 28 */     this.f = a1;
/* 29 */     this.g = a2;
/*    */   }
/*    */   
/*    */   private static cha a(cha ☃) {
/* 33 */     d.put(☃.e, ☃);
/* 34 */     return ☃;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static cha a(int ☃) {
/* 39 */     return (cha)d.get(☃);
/*    */   }
/*    */   
/*    */   public static boolean b(int ☃) {
/* 43 */     return d.containsKey(☃);
/*    */   }
/*    */   
/*    */   public int a() {
/* 47 */     return this.e;
/*    */   }
/*    */   
/*    */   public OutputStream a(OutputStream ☃) throws IOException {
/* 51 */     return this.g.wrap(☃);
/*    */   }
/*    */   
/*    */   public InputStream a(InputStream ☃) throws IOException {
/* 55 */     return this.f.wrap(☃);
/*    */   }
/*    */   
/*    */   @FunctionalInterface
/*    */   static interface a<O> {
/*    */     O wrap(O param1O) throws IOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cha.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */