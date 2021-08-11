/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cel
/*    */ {
/*    */   private final brz a;
/*    */   private final fx b;
/*    */   private final boolean c;
/*    */   private ceh d;
/*    */   private ccj e;
/*    */   private boolean f;
/*    */   
/*    */   public cel(brz ☃, fx fx1, boolean bool) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = fx1.h();
/* 22 */     this.c = bool;
/*    */   }
/*    */   
/*    */   public ceh a() {
/* 26 */     if (this.d == null && (this.c || this.a.C(this.b))) {
/* 27 */       this.d = this.a.d_(this.b);
/*    */     }
/*    */     
/* 30 */     return this.d;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public ccj b() {
/* 35 */     if (this.e == null && !this.f) {
/* 36 */       this.e = this.a.c(this.b);
/* 37 */       this.f = true;
/*    */     } 
/*    */     
/* 40 */     return this.e;
/*    */   }
/*    */   
/*    */   public brz c() {
/* 44 */     return this.a;
/*    */   }
/*    */   
/*    */   public fx d() {
/* 48 */     return this.b;
/*    */   }
/*    */   
/*    */   public static Predicate<cel> a(Predicate<ceh> ☃) {
/* 52 */     return cel1 -> (cel1 != null && ☃.test(cel1.a()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */