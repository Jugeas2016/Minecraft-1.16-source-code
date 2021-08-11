/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cxc
/*    */ {
/*    */   protected bsi a;
/*    */   protected aqn b;
/* 19 */   protected final Int2ObjectMap<cxb> c = (Int2ObjectMap<cxb>)new Int2ObjectOpenHashMap();
/*    */   
/*    */   protected int d;
/*    */   
/*    */   protected int e;
/*    */   
/*    */   protected int f;
/*    */   
/*    */   protected boolean g;
/*    */   protected boolean h;
/*    */   protected boolean i;
/*    */   
/*    */   public void a(bsi ☃, aqn aqn1) {
/* 32 */     this.a = ☃;
/* 33 */     this.b = aqn1;
/* 34 */     this.c.clear();
/*    */     
/* 36 */     this.d = afm.d(aqn1.cy() + 1.0F);
/* 37 */     this.e = afm.d(aqn1.cz() + 1.0F);
/* 38 */     this.f = afm.d(aqn1.cy() + 1.0F);
/*    */   }
/*    */   
/*    */   public void a() {
/* 42 */     this.a = null;
/* 43 */     this.b = null;
/*    */   }
/*    */   
/*    */   protected cxb a(fx ☃) {
/* 47 */     return a(☃.u(), ☃.v(), ☃.w());
/*    */   }
/*    */   
/*    */   protected cxb a(int ☃, int i, int j) {
/* 51 */     return (cxb)this.c.computeIfAbsent(cxb.b(☃, i, j), k -> new cxb(☃, i, j));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(boolean ☃) {
/* 65 */     this.g = ☃;
/*    */   }
/*    */   
/*    */   public void b(boolean ☃) {
/* 69 */     this.h = ☃;
/*    */   }
/*    */   
/*    */   public void c(boolean ☃) {
/* 73 */     this.i = ☃;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 77 */     return this.g;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 81 */     return this.h;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 85 */     return this.i;
/*    */   }
/*    */   
/*    */   public abstract cxb b();
/*    */   
/*    */   public abstract cxh a(double paramDouble1, double paramDouble2, double paramDouble3);
/*    */   
/*    */   public abstract int a(cxb[] paramArrayOfcxb, cxb paramcxb);
/*    */   
/*    */   public abstract cwz a(brc parambrc, int paramInt1, int paramInt2, int paramInt3, aqn paramaqn, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean1, boolean paramBoolean2);
/*    */   
/*    */   public abstract cwz a(brc parambrc, int paramInt1, int paramInt2, int paramInt3);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */