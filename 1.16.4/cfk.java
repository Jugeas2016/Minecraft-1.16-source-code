/*    */ 
/*    */ 
/*    */ public enum cfk
/*    */   implements afs
/*    */ {
/*  6 */   a("north_south"),
/*  7 */   b("east_west"),
/*  8 */   c("ascending_east"),
/*  9 */   d("ascending_west"),
/* 10 */   e("ascending_north"),
/* 11 */   f("ascending_south"),
/* 12 */   g("south_east"),
/* 13 */   h("south_west"),
/* 14 */   i("north_west"),
/* 15 */   j("north_east");
/*    */   
/*    */   private final String k;
/*    */ 
/*    */   
/*    */   cfk(String ☃) {
/* 21 */     this.k = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     return this.k;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 34 */     return (this == e || this == c || this == f || this == d);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 39 */     return this.k;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */