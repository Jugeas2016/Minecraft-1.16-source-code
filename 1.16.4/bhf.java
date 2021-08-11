/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhf
/*    */ {
/*  6 */   public static final bhf a = a("core");
/*  7 */   public static final bhf b = a("idle");
/*  8 */   public static final bhf c = a("work");
/*  9 */   public static final bhf d = a("play");
/* 10 */   public static final bhf e = a("rest");
/* 11 */   public static final bhf f = a("meet");
/* 12 */   public static final bhf g = a("panic");
/* 13 */   public static final bhf h = a("raid");
/* 14 */   public static final bhf i = a("pre_raid");
/* 15 */   public static final bhf j = a("hide");
/* 16 */   public static final bhf k = a("fight");
/* 17 */   public static final bhf l = a("celebrate");
/* 18 */   public static final bhf m = a("admire_item");
/* 19 */   public static final bhf n = a("avoid");
/* 20 */   public static final bhf o = a("ride");
/*    */   
/*    */   private final String p;
/*    */   private final int q;
/*    */   
/*    */   private bhf(String ☃) {
/* 26 */     this.p = ☃;
/* 27 */     this.q = ☃.hashCode();
/*    */   }
/*    */   
/*    */   public String a() {
/* 31 */     return this.p;
/*    */   }
/*    */   
/*    */   private static bhf a(String ☃) {
/* 35 */     return gm.<bhf>a(gm.an, ☃, new bhf(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 40 */     if (this == ☃) {
/* 41 */       return true;
/*    */     }
/* 43 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 44 */       return false;
/*    */     }
/*    */     
/* 47 */     bhf bhf1 = (bhf)☃;
/*    */     
/* 49 */     return this.p.equals(bhf1.p);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 54 */     return this.q;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 59 */     return a();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */