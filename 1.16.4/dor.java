/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dor
/*    */   extends dot
/*    */   implements afn
/*    */ {
/*    */   @Nullable
/*    */   private nr a;
/*    */   @Nullable
/*    */   private nr b;
/*    */   private int c;
/*    */   private boolean p;
/*    */   
/*    */   public dor() {
/* 21 */     super(dkz.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean as_() {
/* 26 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nr ☃) {
/* 31 */     b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nr ☃) {
/* 36 */     this.a = ☃;
/* 37 */     c(new of("progress.working"));
/*    */   }
/*    */ 
/*    */   
/*    */   public void c(nr ☃) {
/* 42 */     this.b = ☃;
/* 43 */     a(0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int ☃) {
/* 48 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 53 */     this.p = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 58 */     if (this.p) {
/* 59 */       if (!this.i.ah()) {
/* 60 */         this.i.a((dot)null);
/*    */       }
/*    */       
/*    */       return;
/*    */     } 
/*    */     
/* 66 */     a(☃);
/*    */     
/* 68 */     if (this.a != null) {
/* 69 */       a(☃, this.o, this.a, this.k / 2, 70, 16777215);
/*    */     }
/* 71 */     if (this.b != null && this.c != 0) {
/* 72 */       a(☃, this.o, (new oe("")).a(this.b).c(" " + this.c + "%"), this.k / 2, 90, 16777215);
/*    */     }
/*    */     
/* 75 */     super.a(☃, i, j, f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */