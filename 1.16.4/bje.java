/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bje<T extends bic>
/*    */ {
/* 11 */   public static final bje<bij> a = a("generic_9x1", bij::a);
/* 12 */   public static final bje<bij> b = a("generic_9x2", bij::b);
/* 13 */   public static final bje<bij> c = a("generic_9x3", bij::c);
/* 14 */   public static final bje<bij> d = a("generic_9x4", bij::d);
/* 15 */   public static final bje<bij> e = a("generic_9x5", bij::e);
/* 16 */   public static final bje<bij> f = a("generic_9x6", bij::f);
/* 17 */   public static final bje<bir> g = a("generic_3x3", bir::new);
/*    */   
/* 19 */   public static final bje<bie> h = a("anvil", bie::new);
/* 20 */   public static final bje<bif> i = a("beacon", bif::new);
/* 21 */   public static final bje<big> j = a("blast_furnace", big::new);
/* 22 */   public static final bje<bih> k = a("brewing_stand", bih::new);
/* 23 */   public static final bje<bip> l = a("crafting", bip::new);
/* 24 */   public static final bje<bis> m = a("enchantment", bis::new);
/* 25 */   public static final bje<biu> n = a("furnace", biu::new);
/* 26 */   public static final bje<biw> o = a("grindstone", biw::new); public static final bje<bjb> q;
/* 27 */   public static final bje<bix> p = a("hopper", bix::new); static {
/* 28 */     q = a("lectern", (☃, bfv1) -> new bjb(☃));
/* 29 */   } public static final bje<bjc> r = a("loom", bjc::new);
/* 30 */   public static final bje<bjg> s = a("merchant", bjg::new);
/* 31 */   public static final bje<bjo> t = a("shulker_box", bjo::new);
/* 32 */   public static final bje<bjs> u = a("smithing", bjs::new);
/* 33 */   public static final bje<bjt> v = a("smoker", bjt::new);
/* 34 */   public static final bje<bii> w = a("cartography_table", bii::new);
/* 35 */   public static final bje<bjv> x = a("stonecutter", bjv::new); private final a<T> y;
/*    */   
/*    */   private static <T extends bic> bje<T> a(String ☃, a<T> a1) {
/* 38 */     return (bje<T>)gm.<bje<?>>a(gm.ac, ☃, new bje(a1));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private bje(a<T> ☃) {
/* 44 */     this.y = ☃;
/*    */   }
/*    */   
/*    */   public T a(int ☃, bfv bfv1) {
/* 48 */     return this.y.create(☃, bfv1);
/*    */   }
/*    */   
/*    */   static interface a<T extends bic> {
/*    */     T create(int param1Int, bfv param1bfv);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bje.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */