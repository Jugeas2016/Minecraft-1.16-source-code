/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dal
/*    */ {
/*    */   public static final BiFunction<bmb, cyv, bmb> a;
/*    */   
/*    */   static {
/* 13 */     a = ((☃, cyv1) -> ☃);
/*    */   }
/* 15 */   public static final dak b = a("set_count", new daq.a());
/* 16 */   public static final dak c = a("enchant_with_levels", new dad.b());
/* 17 */   public static final dak d = a("enchant_randomly", new dac.b());
/* 18 */   public static final dak e = a("set_nbt", new dau.a());
/* 19 */   public static final dak f = a("furnace_smelt", new daw.a());
/* 20 */   public static final dak g = a("looting_enchant", new dam.b());
/* 21 */   public static final dak h = a("set_damage", new dar.a());
/* 22 */   public static final dak i = a("set_attributes", new dan.d());
/* 23 */   public static final dak j = a("set_name", new dat.a());
/* 24 */   public static final dak k = a("exploration_map", new dae.b());
/* 25 */   public static final dak l = a("set_stew_effect", new dav.b());
/* 26 */   public static final dak m = a("copy_name", new daa.b());
/* 27 */   public static final dak n = a("set_contents", new dao.b());
/* 28 */   public static final dak o = a("limit_count", new dah.a());
/* 29 */   public static final dak p = a("apply_bonus", new czx.e());
/* 30 */   public static final dak q = a("set_loot_table", new dap.a());
/* 31 */   public static final dak r = a("explosion_decay", new czy.a());
/* 32 */   public static final dak s = a("set_lore", new das.b());
/* 33 */   public static final dak t = a("fill_player_head", new daf.a());
/* 34 */   public static final dak u = a("copy_nbt", new dab.e());
/* 35 */   public static final dak v = a("copy_state", new czz.b());
/*    */   
/*    */   private static dak a(String ☃, cze<? extends daj> cze1) {
/* 38 */     return gm.<dak, dak>a(gm.ap, new vk(☃), new dak(cze1));
/*    */   }
/*    */   
/*    */   public static Object a() {
/* 42 */     return cyt.a(gm.ap, "function", "function", daj::b).a();
/*    */   } public static BiFunction<bmb, cyv, bmb> a(BiFunction<bmb, cyv, bmb>[] ☃) {
/*    */     BiFunction<bmb, cyv, bmb> biFunction1;
/*    */     BiFunction<bmb, cyv, bmb> biFunction2;
/* 46 */     switch (☃.length) {
/*    */       case 0:
/* 48 */         return a;
/*    */       case 1:
/* 50 */         return ☃[0];
/*    */       case 2:
/* 52 */         biFunction1 = ☃[0];
/* 53 */         biFunction2 = ☃[1];
/* 54 */         return (bmb1, cyv1) -> (bmb)☃.apply(biFunction1.apply(bmb1, cyv1), cyv1);
/*    */     } 
/*    */     
/* 57 */     return (bmb1, cyv1) -> {
/*    */         for (BiFunction<bmb, cyv, bmb> biFunction : ☃)
/*    */           bmb1 = biFunction.apply(bmb1, cyv1); 
/*    */         return bmb1;
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */