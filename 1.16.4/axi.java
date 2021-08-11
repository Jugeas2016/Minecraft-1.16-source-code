/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class axi<T extends aqn>
/*    */   extends avv
/*    */ {
/*    */   private final T a;
/*    */   private final bmb b;
/*    */   private final Predicate<? super T> c;
/*    */   private final adp d;
/*    */   
/*    */   public axi(T ☃, bmb bmb1, @Nullable adp adp1, Predicate<? super T> predicate) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = bmb1;
/* 21 */     this.d = adp1;
/* 22 */     this.c = predicate;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 27 */     return this.c.test(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 32 */     return this.a.dW();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 37 */     this.a.a(aqf.a, this.b.i());
/* 38 */     this.a.c(aot.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 43 */     this.a.a(aqf.a, bmb.b);
/*    */     
/* 45 */     if (this.d != null)
/* 46 */       this.a.a(this.d, 1.0F, this.a.cY().nextFloat() * 0.2F + 0.9F); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */