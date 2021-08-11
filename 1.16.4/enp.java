/*    */ import java.util.Random;
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
/*    */ public class enp
/*    */ {
/* 16 */   private final Random a = new Random();
/*    */   private final djz b;
/*    */   @Nullable
/*    */   private emt c;
/* 20 */   private int d = 100;
/*    */   
/*    */   public enp(djz ☃) {
/* 23 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public void a() {
/* 27 */     adn ☃ = this.b.X();
/*    */     
/* 29 */     if (this.c != null) {
/* 30 */       if (!☃.a().a().equals(this.c.a()) && ☃.d()) {
/* 31 */         this.b.W().b(this.c);
/* 32 */         this.d = afm.a(this.a, 0, ☃.b() / 2);
/*    */       } 
/*    */       
/* 35 */       if (!this.b.W().c(this.c)) {
/* 36 */         this.c = null;
/* 37 */         this.d = Math.min(this.d, afm.a(this.a, ☃.b(), ☃.c()));
/*    */       } 
/*    */     } 
/*    */     
/* 41 */     this.d = Math.min(this.d, ☃.c());
/*    */     
/* 43 */     if (this.c == null && this.d-- <= 0) {
/* 44 */       a(☃);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(adn ☃) {
/* 49 */     this.c = emp.a(☃.a());
/* 50 */     if (this.c.b() != enu.a) {
/* 51 */       this.b.W().a(this.c);
/*    */     }
/* 53 */     this.d = Integer.MAX_VALUE;
/*    */   }
/*    */   
/*    */   public void b() {
/* 57 */     if (this.c != null) {
/* 58 */       this.b.W().b(this.c);
/* 59 */       this.c = null;
/*    */     } 
/* 61 */     this.d += 100;
/*    */   }
/*    */   
/*    */   public boolean b(adn ☃) {
/* 65 */     if (this.c == null) {
/* 66 */       return false;
/*    */     }
/*    */     
/* 69 */     return ☃.a().a().equals(this.c.a());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */