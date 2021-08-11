/*    */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dns
/*    */   extends dot
/*    */ {
/*    */   private final nr p;
/* 14 */   private dlu q = dlu.a;
/*    */   protected nr a;
/*    */   protected nr b;
/*    */   private int r;
/*    */   protected final BooleanConsumer c;
/*    */   
/*    */   public dns(BooleanConsumer ☃, nr nr1, nr nr2) {
/* 21 */     this(☃, nr1, nr2, nq.e, nq.f);
/*    */   }
/*    */   
/*    */   public dns(BooleanConsumer ☃, nr nr1, nr nr2, nr nr3, nr nr4) {
/* 25 */     super(nr1);
/* 26 */     this.c = ☃;
/* 27 */     this.p = nr2;
/* 28 */     this.a = nr3;
/* 29 */     this.b = nr4;
/*    */   }
/*    */ 
/*    */   
/*    */   public String ax_() {
/* 34 */     return super.ax_() + ". " + this.p.getString();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 39 */     super.b();
/*    */     
/* 41 */     a(new dlj(this.k / 2 - 155, this.l / 6 + 96, 150, 20, this.a, ☃ -> this.c.accept(true)));
/* 42 */     a(new dlj(this.k / 2 - 155 + 160, this.l / 6 + 96, 150, 20, this.b, ☃ -> this.c.accept(false)));
/*    */     
/* 44 */     this.q = dlu.a(this.o, this.p, this.k - 50);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 49 */     a(☃);
/* 50 */     a(☃, this.o, this.d, this.k / 2, 70, 16777215);
/* 51 */     this.q.a(☃, this.k / 2, 90);
/* 52 */     super.a(☃, i, j, f);
/*    */   }
/*    */   
/*    */   public void a(int ☃) {
/* 56 */     this.r = ☃;
/*    */     
/* 58 */     for (dlh dlh : this.m) {
/* 59 */       dlh.o = false;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 65 */     super.d();
/*    */     
/* 67 */     if (--this.r == 0) {
/* 68 */       for (dlh ☃ : this.m) {
/* 69 */         ☃.o = true;
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean as_() {
/* 76 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i, int j) {
/* 81 */     if (☃ == 256) {
/* 82 */       this.c.accept(false);
/* 83 */       return true;
/*    */     } 
/* 85 */     return super.a(☃, i, j);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */