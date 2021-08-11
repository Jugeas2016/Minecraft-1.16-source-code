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
/*    */ public class apl
/*    */   extends apk
/*    */ {
/*    */   @Nullable
/*    */   protected final aqa w;
/*    */   private boolean x;
/*    */   
/*    */   public apl(String ☃, @Nullable aqa aqa1) {
/* 19 */     super(☃);
/* 20 */     this.w = aqa1;
/*    */   }
/*    */   
/*    */   public apl x() {
/* 24 */     this.x = true;
/* 25 */     return this;
/*    */   }
/*    */   
/*    */   public boolean y() {
/* 29 */     return this.x;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public aqa k() {
/* 35 */     return this.w;
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(aqm ☃) {
/* 40 */     bmb bmb = (this.w instanceof aqm) ? ((aqm)this.w).dD() : bmb.b;
/* 41 */     String str = "death.attack." + this.v;
/*    */     
/* 43 */     if (!bmb.a() && bmb.t()) {
/* 44 */       return new of(str + ".item", new Object[] { ☃.d(), this.w.d(), bmb.C() });
/*    */     }
/* 46 */     return new of(str, new Object[] { ☃.d(), this.w.d() });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean s() {
/* 52 */     return (this.w != null && this.w instanceof aqm && !(this.w instanceof bfw));
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public dcn w() {
/* 58 */     return (this.w != null) ? this.w.cA() : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     return "EntityDamageSource (" + this.w + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\apl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */