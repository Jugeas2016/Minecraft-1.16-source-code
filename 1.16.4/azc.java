/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class azc<U extends azb<?>>
/*    */ {
/*  9 */   public static final azc<ayp> a = a("dummy", ayp::new);
/* 10 */   public static final azc<ayu> b = a("nearest_items", ayu::new);
/* 11 */   public static final azc<ayv> c = a("nearest_living_entities", ayv::new);
/* 12 */   public static final azc<ayy> d = a("nearest_players", ayy::new);
/* 13 */   public static final azc<ayt> e = a("nearest_bed", ayt::new);
/* 14 */   public static final azc<ays> f = a("hurt_by", ays::new);
/* 15 */   public static final azc<aze> g = a("villager_hostiles", aze::new);
/* 16 */   public static final azc<azd> h = a("villager_babies", azd::new);
/* 17 */   public static final azc<ayz> i = a("secondary_pois", ayz::new);
/* 18 */   public static final azc<ayq> j = a("golem_detected", ayq::new);
/* 19 */   public static final azc<ayx> k = a("piglin_specific_sensor", ayx::new);
/* 20 */   public static final azc<ayw> l = a("piglin_brute_specific_sensor", ayw::new);
/* 21 */   public static final azc<ayr> m = a("hoglin_specific_sensor", ayr::new);
/* 22 */   public static final azc<ayo> n = a("nearest_adult", ayo::new);
/*    */   
/*    */   private final Supplier<U> o;
/*    */   
/*    */   private azc(Supplier<U> ☃) {
/* 27 */     this.o = ☃;
/*    */   }
/*    */   
/*    */   public U a() {
/* 31 */     return this.o.get();
/*    */   }
/*    */   
/*    */   private static <U extends azb<?>> azc<U> a(String ☃, Supplier<U> supplier) {
/* 35 */     return gm.<azc<?>, azc<U>>a(gm.al, new vk(☃), new azc<>(supplier));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */