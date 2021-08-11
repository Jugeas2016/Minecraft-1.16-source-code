/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnw
/*    */ {
/*  8 */   public static final bnt a = a("empty", new bnt(new apu[0]));
/*  9 */   public static final bnt b = a("water", new bnt(new apu[0]));
/* 10 */   public static final bnt c = a("mundane", new bnt(new apu[0]));
/* 11 */   public static final bnt d = a("thick", new bnt(new apu[0]));
/* 12 */   public static final bnt e = a("awkward", new bnt(new apu[0]));
/*    */   
/* 14 */   public static final bnt f = a("night_vision", new bnt(new apu[] { new apu(apw.p, 3600) }));
/* 15 */   public static final bnt g = a("long_night_vision", new bnt("night_vision", new apu[] { new apu(apw.p, 9600) }));
/*    */   
/* 17 */   public static final bnt h = a("invisibility", new bnt(new apu[] { new apu(apw.n, 3600) }));
/* 18 */   public static final bnt i = a("long_invisibility", new bnt("invisibility", new apu[] { new apu(apw.n, 9600) }));
/*    */   
/* 20 */   public static final bnt j = a("leaping", new bnt(new apu[] { new apu(apw.h, 3600) }));
/* 21 */   public static final bnt k = a("long_leaping", new bnt("leaping", new apu[] { new apu(apw.h, 9600) }));
/* 22 */   public static final bnt l = a("strong_leaping", new bnt("leaping", new apu[] { new apu(apw.h, 1800, 1) }));
/*    */   
/* 24 */   public static final bnt m = a("fire_resistance", new bnt(new apu[] { new apu(apw.l, 3600) }));
/* 25 */   public static final bnt n = a("long_fire_resistance", new bnt("fire_resistance", new apu[] { new apu(apw.l, 9600) }));
/*    */   
/* 27 */   public static final bnt o = a("swiftness", new bnt(new apu[] { new apu(apw.a, 3600) }));
/* 28 */   public static final bnt p = a("long_swiftness", new bnt("swiftness", new apu[] { new apu(apw.a, 9600) }));
/* 29 */   public static final bnt q = a("strong_swiftness", new bnt("swiftness", new apu[] { new apu(apw.a, 1800, 1) }));
/*    */   
/* 31 */   public static final bnt r = a("slowness", new bnt(new apu[] { new apu(apw.b, 1800) }));
/* 32 */   public static final bnt s = a("long_slowness", new bnt("slowness", new apu[] { new apu(apw.b, 4800) }));
/* 33 */   public static final bnt t = a("strong_slowness", new bnt("slowness", new apu[] { new apu(apw.b, 400, 3) }));
/*    */   
/* 35 */   public static final bnt u = a("turtle_master", new bnt("turtle_master", new apu[] { new apu(apw.b, 400, 3), new apu(apw.k, 400, 2) }));
/* 36 */   public static final bnt v = a("long_turtle_master", new bnt("turtle_master", new apu[] { new apu(apw.b, 800, 3), new apu(apw.k, 800, 2) }));
/* 37 */   public static final bnt w = a("strong_turtle_master", new bnt("turtle_master", new apu[] { new apu(apw.b, 400, 5), new apu(apw.k, 400, 3) }));
/*    */   
/* 39 */   public static final bnt x = a("water_breathing", new bnt(new apu[] { new apu(apw.m, 3600) }));
/* 40 */   public static final bnt y = a("long_water_breathing", new bnt("water_breathing", new apu[] { new apu(apw.m, 9600) }));
/*    */   
/* 42 */   public static final bnt z = a("healing", new bnt(new apu[] { new apu(apw.f, 1) }));
/* 43 */   public static final bnt A = a("strong_healing", new bnt("healing", new apu[] { new apu(apw.f, 1, 1) }));
/*    */   
/* 45 */   public static final bnt B = a("harming", new bnt(new apu[] { new apu(apw.g, 1) }));
/* 46 */   public static final bnt C = a("strong_harming", new bnt("harming", new apu[] { new apu(apw.g, 1, 1) }));
/*    */   
/* 48 */   public static final bnt D = a("poison", new bnt(new apu[] { new apu(apw.s, 900) }));
/* 49 */   public static final bnt E = a("long_poison", new bnt("poison", new apu[] { new apu(apw.s, 1800) }));
/* 50 */   public static final bnt F = a("strong_poison", new bnt("poison", new apu[] { new apu(apw.s, 432, 1) }));
/*    */   
/* 52 */   public static final bnt G = a("regeneration", new bnt(new apu[] { new apu(apw.j, 900) }));
/* 53 */   public static final bnt H = a("long_regeneration", new bnt("regeneration", new apu[] { new apu(apw.j, 1800) }));
/* 54 */   public static final bnt I = a("strong_regeneration", new bnt("regeneration", new apu[] { new apu(apw.j, 450, 1) }));
/*    */   
/* 56 */   public static final bnt J = a("strength", new bnt(new apu[] { new apu(apw.e, 3600) }));
/* 57 */   public static final bnt K = a("long_strength", new bnt("strength", new apu[] { new apu(apw.e, 9600) }));
/* 58 */   public static final bnt L = a("strong_strength", new bnt("strength", new apu[] { new apu(apw.e, 1800, 1) }));
/*    */   
/* 60 */   public static final bnt M = a("weakness", new bnt(new apu[] { new apu(apw.r, 1800) }));
/* 61 */   public static final bnt N = a("long_weakness", new bnt("weakness", new apu[] { new apu(apw.r, 4800) }));
/*    */   
/* 63 */   public static final bnt O = a("luck", new bnt("luck", new apu[] { new apu(apw.z, 6000) }));
/*    */   
/* 65 */   public static final bnt P = a("slow_falling", new bnt(new apu[] { new apu(apw.B, 1800) }));
/* 66 */   public static final bnt Q = a("long_slow_falling", new bnt("slow_falling", new apu[] { new apu(apw.B, 4800) }));
/*    */   
/*    */   private static bnt a(String ☃, bnt bnt1) {
/* 69 */     return gm.<bnt>a(gm.U, ☃, bnt1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bnw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */