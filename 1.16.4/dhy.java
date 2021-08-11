/*    */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
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
/*    */ public class dhy
/*    */   extends eoo
/*    */ {
/*    */   private final a b;
/*    */   private final nr c;
/*    */   private final nr p;
/*    */   protected final BooleanConsumer a;
/*    */   private final boolean q;
/*    */   
/*    */   public dhy(BooleanConsumer ☃, a a1, nr nr1, nr nr2, boolean bool) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = a1;
/* 24 */     this.c = nr1;
/* 25 */     this.p = nr2;
/* 26 */     this.q = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 31 */     eoj.a(new String[] { this.b.d, this.c.getString(), this.p.getString() });
/* 32 */     if (this.q) {
/* 33 */       a(new dlj(this.k / 2 - 105, j(8), 100, 20, nq.e, ☃ -> this.a.accept(true)));
/* 34 */       a(new dlj(this.k / 2 + 5, j(8), 100, 20, nq.f, ☃ -> this.a.accept(false)));
/*    */     } else {
/* 36 */       a(new dlj(this.k / 2 - 50, j(8), 100, 20, new of("mco.gui.ok"), ☃ -> this.a.accept(true)));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i, int j) {
/* 42 */     if (☃ == 256) {
/* 43 */       this.a.accept(false);
/* 44 */       return true;
/*    */     } 
/* 46 */     return super.a(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 51 */     a(☃);
/*    */     
/* 53 */     a(☃, this.o, this.b.d, this.k / 2, j(2), this.b.c);
/* 54 */     a(☃, this.o, this.c, this.k / 2, j(4), 16777215);
/*    */     
/* 56 */     a(☃, this.o, this.p, this.k / 2, j(6), 16777215);
/*    */     
/* 58 */     super.a(☃, i, j, f);
/*    */   }
/*    */   
/*    */   public enum a
/*    */   {
/* 63 */     a("Warning!", 16711680),
/* 64 */     b("Info!", 8226750);
/*    */     
/*    */     a(String ☃, int i) {
/* 67 */       this.d = ☃;
/* 68 */       this.c = i;
/*    */     }
/*    */     
/*    */     public final int c;
/*    */     public final String d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */