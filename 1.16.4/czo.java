/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class czo
/*    */ {
/*  9 */   public static final czr a = a("empty", new czl.a());
/* 10 */   public static final czr b = a("item", new czn.a());
/* 11 */   public static final czr c = a("loot_table", new czt.a());
/* 12 */   public static final czr d = a("dynamic", new czk.a());
/* 13 */   public static final czr e = a("tag", new czv.a());
/*    */   
/* 15 */   public static final czr f = a("alternatives", czj.a(czh::new));
/* 16 */   public static final czr g = a("sequence", czj.a(czu::new));
/* 17 */   public static final czr h = a("group", czj.a(czm::new));
/*    */   
/*    */   private static czr a(String ☃, cze<? extends czq> cze1) {
/* 20 */     return gm.<czr, czr>a(gm.ao, new vk(☃), new czr(cze1));
/*    */   }
/*    */   
/*    */   public static Object a() {
/* 24 */     return cyt.a(gm.ao, "entry", "type", czq::a).a();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */