/*    */ import javax.annotation.Nullable;
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
/*    */ public class dno
/*    */   extends dot
/*    */ {
/*    */   @Nullable
/*    */   private final dot b;
/*    */   protected final a a;
/*    */   private final nr c;
/*    */   private final boolean p;
/* 20 */   private dlu q = dlu.a;
/*    */   
/*    */   private dll r;
/*    */   
/*    */   public dno(@Nullable dot ☃, a a1, nr nr1, nr nr2, boolean bool) {
/* 25 */     super(nr1);
/* 26 */     this.b = ☃;
/* 27 */     this.a = a1;
/* 28 */     this.c = nr2;
/* 29 */     this.p = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 34 */     super.b();
/*    */     
/* 36 */     this.q = dlu.a(this.o, this.c, this.k - 50);
/*    */     
/* 38 */     this.o.getClass(); int ☃ = (this.q.a() + 1) * 9;
/* 39 */     a(new dlj(this.k / 2 - 155, 100 + ☃, 150, 20, new of("selectWorld.backupJoinConfirmButton"), ☃ -> this.a.proceed(true, this.r.a())));
/* 40 */     a(new dlj(this.k / 2 - 155 + 160, 100 + ☃, 150, 20, new of("selectWorld.backupJoinSkipButton"), ☃ -> this.a.proceed(false, this.r.a())));
/* 41 */     a(new dlj(this.k / 2 - 155 + 80, 124 + ☃, 150, 20, nq.d, ☃ -> this.i.a(this.b)));
/* 42 */     this.r = new dll(this.k / 2 - 155 + 80, 76 + ☃, 150, 20, new of("selectWorld.backupEraseCache"), false);
/* 43 */     if (this.p) {
/* 44 */       a(this.r);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 50 */     a(☃);
/* 51 */     a(☃, this.o, this.d, this.k / 2, 50, 16777215);
/* 52 */     this.q.a(☃, this.k / 2, 70);
/* 53 */     super.a(☃, i, j, f);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean as_() {
/* 58 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i, int j) {
/* 63 */     if (☃ == 256) {
/* 64 */       this.i.a(this.b);
/* 65 */       return true;
/*    */     } 
/* 67 */     return super.a(☃, i, j);
/*    */   }
/*    */   
/*    */   public static interface a {
/*    */     void proceed(boolean param1Boolean1, boolean param1Boolean2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dno.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */