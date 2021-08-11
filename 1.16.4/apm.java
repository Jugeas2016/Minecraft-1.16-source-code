/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apm
/*    */   extends apl
/*    */ {
/*    */   private final aqa x;
/*    */   
/*    */   public apm(String ☃, aqa aqa1, @Nullable aqa aqa2) {
/* 15 */     super(☃, aqa1);
/* 16 */     this.x = aqa2;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public aqa j() {
/* 22 */     return this.w;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public aqa k() {
/* 28 */     return this.x;
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(aqm ☃) {
/* 33 */     nr nr = (this.x == null) ? this.w.d() : this.x.d();
/* 34 */     bmb bmb = (this.x instanceof aqm) ? ((aqm)this.x).dD() : bmb.b;
/* 35 */     String str1 = "death.attack." + this.v;
/* 36 */     String str2 = str1 + ".item";
/*    */     
/* 38 */     if (!bmb.a() && bmb.t()) {
/* 39 */       return new of(str2, new Object[] { ☃.d(), nr, bmb.C() });
/*    */     }
/* 41 */     return new of(str1, new Object[] { ☃.d(), nr });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\apm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */