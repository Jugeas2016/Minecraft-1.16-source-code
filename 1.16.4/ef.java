/*    */ import java.util.Set;
/*    */ import java.util.function.Predicate;
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
/*    */ public class ef
/*    */   implements Predicate<cel>
/*    */ {
/*    */   private final ceh a;
/*    */   private final Set<cfj<?>> b;
/*    */   @Nullable
/*    */   private final md c;
/*    */   
/*    */   public ef(ceh ☃, Set<cfj<?>> set, @Nullable md md1) {
/* 24 */     this.a = ☃;
/* 25 */     this.b = set;
/* 26 */     this.c = md1;
/*    */   }
/*    */   
/*    */   public ceh a() {
/* 30 */     return this.a;
/*    */   }
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
/*    */   public boolean a(cel ☃) {
/* 44 */     ceh ceh1 = ☃.a();
/*    */     
/* 46 */     if (!ceh1.a(this.a.b())) {
/* 47 */       return false;
/*    */     }
/*    */     
/* 50 */     for (cfj<?> cfj : this.b) {
/* 51 */       if (ceh1.c(cfj) != this.a.c(cfj)) {
/* 52 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 56 */     if (this.c != null) {
/* 57 */       ccj ccj = ☃.b();
/* 58 */       return (ccj != null && mp.a(this.c, ccj.a(new md()), true));
/*    */     } 
/*    */     
/* 61 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(aag ☃, fx fx1, int i) {
/* 69 */     ceh ceh1 = buo.b(this.a, ☃, fx1);
/* 70 */     if (ceh1.g()) {
/* 71 */       ceh1 = this.a;
/*    */     }
/* 73 */     if (!☃.a(fx1, ceh1, i)) {
/* 74 */       return false;
/*    */     }
/*    */     
/* 77 */     if (this.c != null) {
/* 78 */       ccj ccj = ☃.c(fx1);
/* 79 */       if (ccj != null) {
/* 80 */         md md1 = this.c.g();
/* 81 */         md1.b("x", fx1.u());
/* 82 */         md1.b("y", fx1.v());
/* 83 */         md1.b("z", fx1.w());
/* 84 */         ccj.a(ceh1, md1);
/*    */       } 
/*    */     } 
/*    */     
/* 88 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */