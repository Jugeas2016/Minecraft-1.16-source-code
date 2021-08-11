/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class dov
/*    */   extends dol
/*    */ {
/*    */   private final dkc[] c;
/*    */   @Nullable
/*    */   private dlh p;
/*    */   private dlx q;
/*    */   
/*    */   public dov(dot ☃, dkd dkd1, nr nr1, dkc[] arrayOfDkc) {
/* 25 */     super(☃, dkd1, nr1);
/* 26 */     this.c = arrayOfDkc;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 31 */     this.q = new dlx(this.i, this.k, this.l, 32, this.l - 32, 25);
/* 32 */     this.q.a(this.c);
/*    */     
/* 34 */     this.e.add(this.q);
/*    */     
/* 36 */     c();
/*    */     
/* 38 */     this.p = this.q.b(dkc.A);
/* 39 */     if (this.p != null) {
/* 40 */       this.p.o = dkz.b.a();
/*    */     }
/*    */   }
/*    */   
/*    */   protected void c() {
/* 45 */     a(new dlj(this.k / 2 - 100, this.l - 27, 200, 20, nq.c, ☃ -> this.i.a(this.a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 50 */     a(☃);
/* 51 */     this.q.a(☃, i, j, f);
/*    */     
/* 53 */     a(☃, this.o, this.d, this.k / 2, 20, 16777215);
/*    */     
/* 55 */     super.a(☃, i, j, f);
/*    */     
/* 57 */     List<afa> list = a(this.q, i, j);
/* 58 */     if (list != null) {
/* 59 */       c(☃, list, i, j);
/*    */     }
/*    */   }
/*    */   
/*    */   public void h() {
/* 64 */     if (this.p != null)
/* 65 */       this.p.a(dkc.A.c(this.b)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dov.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */