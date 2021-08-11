/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class bfo
/*    */ {
/* 15 */   public static final bfo a = a("desert");
/* 16 */   public static final bfo b = a("jungle");
/* 17 */   public static final bfo c = a("plains");
/* 18 */   public static final bfo d = a("savanna");
/* 19 */   public static final bfo e = a("snow");
/* 20 */   public static final bfo f = a("swamp");
/* 21 */   public static final bfo g = a("taiga");
/*    */   private final String h;
/*    */   private static final Map<vj<bsv>, bfo> i;
/*    */   
/*    */   private bfo(String ☃) {
/* 26 */     this.h = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 31 */     return this.h;
/*    */   }
/*    */   
/*    */   private static bfo a(String ☃) {
/* 35 */     return gm.<bfo, bfo>a(gm.ah, new vk(☃), new bfo(☃));
/*    */   }
/*    */   static {
/* 38 */     i = x.<Map<vj<bsv>, bfo>>a(Maps.newHashMap(), ☃ -> {
/*    */           ☃.put(btb.L, a);
/*    */           ☃.put(btb.N, a);
/*    */           ☃.put(btb.c, a);
/*    */           ☃.put(btb.r, a);
/*    */           ☃.put(btb.ab, a);
/*    */           ☃.put(btb.as, a);
/*    */           ☃.put(btb.au, a);
/*    */           ☃.put(btb.at, a);
/*    */           ☃.put(btb.M, a);
/*    */           ☃.put(btb.av, b);
/*    */           ☃.put(btb.aw, b);
/*    */           ☃.put(btb.v, b);
/*    */           ☃.put(btb.x, b);
/*    */           ☃.put(btb.w, b);
/*    */           ☃.put(btb.ah, b);
/*    */           ☃.put(btb.ai, b);
/*    */           ☃.put(btb.K, d);
/*    */           ☃.put(btb.J, d);
/*    */           ☃.put(btb.aq, d);
/*    */           ☃.put(btb.ar, d);
/*    */           ☃.put(btb.Y, e);
/*    */           ☃.put(btb.k, e);
/*    */           ☃.put(btb.l, e);
/*    */           ☃.put(btb.ag, e);
/*    */           ☃.put(btb.A, e);
/*    */           ☃.put(btb.n, e);
/*    */           ☃.put(btb.E, e);
/*    */           ☃.put(btb.F, e);
/*    */           ☃.put(btb.am, e);
/*    */           ☃.put(btb.m, e);
/*    */           ☃.put(btb.g, f);
/*    */           ☃.put(btb.af, f);
/*    */           ☃.put(btb.an, g);
/*    */           ☃.put(btb.ao, g);
/*    */           ☃.put(btb.G, g);
/*    */           ☃.put(btb.H, g);
/*    */           ☃.put(btb.ac, g);
/*    */           ☃.put(btb.ap, g);
/*    */           ☃.put(btb.u, g);
/*    */           ☃.put(btb.d, g);
/*    */           ☃.put(btb.f, g);
/*    */           ☃.put(btb.t, g);
/*    */           ☃.put(btb.ae, g);
/*    */           ☃.put(btb.I, g);
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static bfo a(Optional<vj<bsv>> ☃) {
/* 93 */     return ☃.<bfo>flatMap(☃ -> Optional.ofNullable(i.get(☃))).orElse(c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */