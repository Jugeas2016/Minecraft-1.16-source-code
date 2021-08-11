/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ public enum eog
/*    */ {
/*  6 */   a("movement", eob::new),
/*  7 */   b("find_tree", eoa::new),
/*  8 */   c("punch_tree", eod::new),
/*  9 */   d("open_inventory", eoc::new),
/* 10 */   e("craft_planks", enz::new),
/* 11 */   f("none", eny::new);
/*    */   
/*    */   private final String g;
/*    */   
/*    */   private final Function<eoe, ? extends eof> h;
/*    */   
/*    */   <T extends eof> eog(String ☃, Function<eoe, T> function) {
/* 18 */     this.g = ☃;
/* 19 */     this.h = function;
/*    */   }
/*    */   
/*    */   public eof a(eoe ☃) {
/* 23 */     return this.h.apply(☃);
/*    */   }
/*    */   
/*    */   public String a() {
/* 27 */     return this.g;
/*    */   }
/*    */   
/*    */   public static eog a(String ☃) {
/* 31 */     for (eog eog1 : values()) {
/* 32 */       if (eog1.g.equals(☃)) {
/* 33 */         return eog1;
/*    */       }
/*    */     } 
/* 36 */     return f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */