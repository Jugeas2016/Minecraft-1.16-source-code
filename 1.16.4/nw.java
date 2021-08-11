/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ public class nw
/*    */   extends nn
/*    */ {
/*    */   private static Function<String, Supplier<nr>> d = ☃ -> ();
/*    */   private final String e;
/*    */   private Supplier<nr> f;
/*    */   
/*    */   public nw(String ☃) {
/* 14 */     this.e = ☃;
/*    */   }
/*    */   
/*    */   public static void a(Function<String, Supplier<nr>> ☃) {
/* 18 */     d = ☃;
/*    */   }
/*    */   
/*    */   private nr j() {
/* 22 */     if (this.f == null) {
/* 23 */       this.f = d.apply(this.e);
/*    */     }
/*    */     
/* 26 */     return this.f.get();
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> Optional<T> b(nu.a<T> ☃) {
/* 31 */     return j().a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> Optional<T> b(nu.b<T> ☃, ob ob1) {
/* 36 */     return j().a(☃, ob1);
/*    */   }
/*    */ 
/*    */   
/*    */   public nw h() {
/* 41 */     return new nw(this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 46 */     if (this == ☃) {
/* 47 */       return true;
/*    */     }
/*    */     
/* 50 */     if (☃ instanceof nw) {
/* 51 */       nw nw1 = (nw)☃;
/* 52 */       return (this.e.equals(nw1.e) && super.equals(☃));
/*    */     } 
/*    */     
/* 55 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 60 */     return "KeybindComponent{keybind='" + this.e + '\'' + ", siblings=" + this.a + ", style=" + 
/*    */ 
/*    */       
/* 63 */       c() + '}';
/*    */   }
/*    */ 
/*    */   
/*    */   public String i() {
/* 68 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */