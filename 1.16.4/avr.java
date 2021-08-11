/*    */ import java.util.List;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avr
/*    */   extends avv
/*    */ {
/*    */   private final azy a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public avr(azy ☃) {
/* 16 */     this.a = ☃;
/* 17 */     this.c = a(☃);
/*    */   }
/*    */   
/*    */   protected int a(azy ☃) {
/* 21 */     return 200 + ☃.cY().nextInt(200) % 20;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 26 */     if (this.a.eR()) {
/* 27 */       return false;
/*    */     }
/*    */     
/* 30 */     if (this.a.eO()) {
/* 31 */       return true;
/*    */     }
/*    */     
/* 34 */     if (this.c > 0) {
/* 35 */       this.c--;
/* 36 */       return false;
/*    */     } 
/*    */     
/* 39 */     this.c = a(this.a);
/*    */     
/* 41 */     Predicate<azy> ☃ = ☃ -> (☃.eQ() || !☃.eO());
/* 42 */     List<azy> list = (List)this.a.l.a(this.a.getClass(), this.a.cc().c(8.0D, 8.0D, 8.0D), ☃);
/*    */     
/* 44 */     azy azy1 = list.stream().filter(azy::eQ).findAny().orElse(this.a);
/*    */     
/* 46 */     azy1.a(list.stream().filter(☃ -> !☃.eO()));
/*    */     
/* 48 */     return this.a.eO();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 53 */     return (this.a.eO() && this.a.eS());
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 58 */     this.b = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 63 */     this.a.eP();
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 68 */     if (--this.b > 0) {
/*    */       return;
/*    */     }
/* 71 */     this.b = 10;
/*    */     
/* 73 */     this.a.eT();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */