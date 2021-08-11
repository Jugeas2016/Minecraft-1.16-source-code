/*    */ 
/*    */ public interface azl
/*    */ {
/*  4 */   public static final azl a = a("zombie_villager_cured");
/*  5 */   public static final azl b = a("golem_killed");
/*  6 */   public static final azl c = a("villager_hurt");
/*  7 */   public static final azl d = a("villager_killed");
/*  8 */   public static final azl e = a("trade");
/*    */   
/*    */   static azl a(String ☃) {
/* 11 */     return new azl(☃)
/*    */       {
/*    */         public String toString() {
/* 14 */           return this.f;
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */