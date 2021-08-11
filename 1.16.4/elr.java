/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
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
/*    */ public class elr
/*    */ {
/*    */   private final vk a;
/*    */   private final vk b;
/*    */   @Nullable
/*    */   private eao c;
/*    */   
/*    */   public elr(vk ☃, vk vk1) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = vk1;
/*    */   }
/*    */   
/*    */   public vk a() {
/* 27 */     return this.a;
/*    */   }
/*    */   
/*    */   public vk b() {
/* 31 */     return this.b;
/*    */   }
/*    */   
/*    */   public ekc c() {
/* 35 */     return djz.C().a(a()).apply(b());
/*    */   }
/*    */   
/*    */   public eao a(Function<vk, eao> ☃) {
/* 39 */     if (this.c == null) {
/* 40 */       this.c = ☃.apply(this.a);
/*    */     }
/* 42 */     return this.c;
/*    */   }
/*    */   
/*    */   public dfq a(eag ☃, Function<vk, eao> function) {
/* 46 */     return c().a(☃.getBuffer(a(function)));
/*    */   }
/*    */   
/*    */   public dfq a(eag ☃, Function<vk, eao> function, boolean bool) {
/* 50 */     return c().a(efo.c(☃, a(function), true, bool));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 55 */     if (this == ☃) {
/* 56 */       return true;
/*    */     }
/* 58 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 59 */       return false;
/*    */     }
/* 61 */     elr elr1 = (elr)☃;
/* 62 */     return (this.a.equals(elr1.a) && this.b.equals(elr1.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 67 */     return Objects.hash(new Object[] { this.a, this.b });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 72 */     return "Material{atlasLocation=" + this.a + ", texture=" + this.b + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\elr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */