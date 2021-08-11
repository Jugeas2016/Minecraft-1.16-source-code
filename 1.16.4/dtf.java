/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class dtf<E extends aqa>
/*    */   extends duc<E>
/*    */ {
/*    */   private final boolean a;
/*    */   private final float b;
/*    */   private final float f;
/*    */   private final float g;
/*    */   private final float h;
/*    */   private final float i;
/*    */   
/*    */   protected dtf(boolean ☃, float f1, float f2) {
/* 22 */     this(☃, f1, f2, 2.0F, 2.0F, 24.0F);
/*    */   }
/*    */   
/*    */   protected dtf(boolean ☃, float f1, float f2, float f3, float f4, float f5) {
/* 26 */     this(eao::d, ☃, f1, f2, f3, f4, f5);
/*    */   }
/*    */   
/*    */   protected dtf(Function<vk, eao> ☃, boolean bool, float f1, float f2, float f3, float f4, float f5) {
/* 30 */     super(☃);
/* 31 */     this.a = bool;
/* 32 */     this.b = f1;
/* 33 */     this.f = f2;
/* 34 */     this.g = f3;
/* 35 */     this.h = f4;
/* 36 */     this.i = f5;
/*    */   }
/*    */   
/*    */   protected dtf() {
/* 40 */     this(false, 5.0F, 2.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/* 45 */     if (this.e) {
/* 46 */       ☃.a();
/* 47 */       if (this.a) {
/* 48 */         float f5 = 1.5F / this.g;
/* 49 */         ☃.a(f5, f5, f5);
/*    */       } 
/* 51 */       ☃.a(0.0D, (this.b / 16.0F), (this.f / 16.0F));
/* 52 */       a().forEach(dwn1 -> dwn1.a(☃, dfq1, i, j, f1, f2, f3, f4));
/* 53 */       ☃.b();
/*    */       
/* 55 */       ☃.a();
/* 56 */       float f = 1.0F / this.h;
/* 57 */       ☃.a(f, f, f);
/* 58 */       ☃.a(0.0D, (this.i / 16.0F), 0.0D);
/* 59 */       b().forEach(dwn1 -> dwn1.a(☃, dfq1, i, j, f1, f2, f3, f4));
/* 60 */       ☃.b();
/*    */     } else {
/* 62 */       a().forEach(dwn1 -> dwn1.a(☃, dfq1, i, j, f1, f2, f3, f4));
/* 63 */       b().forEach(dwn1 -> dwn1.a(☃, dfq1, i, j, f1, f2, f3, f4));
/*    */     } 
/*    */   }
/*    */   
/*    */   protected abstract Iterable<dwn> a();
/*    */   
/*    */   protected abstract Iterable<dwn> b();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */