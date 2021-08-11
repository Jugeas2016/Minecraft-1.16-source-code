/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pq
/*    */   implements oj<om>
/*    */ {
/*    */   public static class a
/*    */   {
/* 13 */     private static final Int2ObjectMap<a> a = (Int2ObjectMap<a>)new Int2ObjectOpenHashMap();
/*    */     
/*    */     private final int b;
/*    */     
/*    */     public a(int ☃) {
/* 18 */       this.b = ☃;
/* 19 */       a.put(☃, this);
/*    */     }
/*    */   }
/*    */   
/* 23 */   public static final a a = new a(0);
/* 24 */   public static final a b = new a(1);
/* 25 */   public static final a c = new a(2);
/* 26 */   public static final a d = new a(3);
/* 27 */   public static final a e = new a(4);
/* 28 */   public static final a f = new a(5);
/* 29 */   public static final a g = new a(6);
/* 30 */   public static final a h = new a(7);
/* 31 */   public static final a i = new a(8);
/* 32 */   public static final a j = new a(9);
/* 33 */   public static final a k = new a(10);
/* 34 */   public static final a l = new a(11);
/*    */ 
/*    */   
/*    */   private a m;
/*    */ 
/*    */   
/*    */   private float n;
/*    */ 
/*    */ 
/*    */   
/*    */   public pq() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public pq(a ☃, float f) {
/* 49 */     this.m = ☃;
/* 50 */     this.n = f;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 55 */     this.m = (a)a.a().get(☃.readUnsignedByte());
/* 56 */     this.n = ☃.readFloat();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 61 */     ☃.writeByte(a.a(this.m));
/* 62 */     ☃.writeFloat(this.n);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 67 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public a b() {
/* 71 */     return this.m;
/*    */   }
/*    */   
/*    */   public float c() {
/* 75 */     return this.n;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */