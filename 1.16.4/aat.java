/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aat
/*    */   implements aap
/*    */ {
/*    */   private final aar a;
/*    */   private final Long2ObjectOpenHashMap<cga> b;
/* 13 */   private brd c = new brd(0, 0);
/*    */   private final int d;
/*    */   private final int e;
/*    */   private final int f;
/*    */   private boolean g;
/*    */   
/*    */   public aat(int ☃) {
/* 20 */     this.a = new aar(☃);
/* 21 */     this.d = ☃ * 2 + 1;
/* 22 */     this.e = ☃ + cga.b();
/* 23 */     this.f = this.e * 2 + 1;
/* 24 */     this.b = new Long2ObjectOpenHashMap();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brd ☃) {
/* 29 */     if (!this.g) {
/*    */       return;
/*    */     }
/* 32 */     this.a.a(☃);
/* 33 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brd ☃, @Nullable cga cga1) {
/* 38 */     if (!this.g) {
/*    */       return;
/*    */     }
/* 41 */     this.a.a(☃, cga1);
/* 42 */     if (cga1 == null) {
/* 43 */       this.b.remove(☃.a());
/*    */     } else {
/* 45 */       this.b.put(☃.a(), cga1);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 51 */     this.g = true;
/* 52 */     this.b.clear();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 57 */     this.g = false;
/* 58 */     this.a.b();
/*    */   }
/*    */   
/*    */   public int c() {
/* 62 */     return this.d;
/*    */   }
/*    */   
/*    */   public int d() {
/* 66 */     return this.f;
/*    */   }
/*    */   
/*    */   public int e() {
/* 70 */     return this.a.c();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public cga a(int ☃, int i) {
/* 75 */     return (cga)this.b.get(brd.a(☃ + this.c.b - this.e, i + this.c.c - this.e));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */