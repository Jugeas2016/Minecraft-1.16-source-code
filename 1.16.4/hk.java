/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.serialization.Lifecycle;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hk
/*    */ {
/* 37 */   protected static final Logger a = LogManager.getLogger();
/*    */   
/* 39 */   private static final Map<vk, Supplier<?>> k = Maps.newLinkedHashMap();
/*    */   
/* 41 */   private static final gs<gs<?>> l = new gi(vj.a(new vk("root")), Lifecycle.experimental());
/* 42 */   public static final gm<? extends gm<?>> b = (gm)l;
/*    */   
/* 44 */   public static final gm<ctg<?>> c = a(gm.as, () -> kp.p);
/* 45 */   public static final gm<cib<?>> d = a(gm.at, () -> kf.a);
/* 46 */   public static final gm<civ<?, ?>> e = a(gm.au, () -> kh.bH);
/* 47 */   public static final gm<ciw<?, ?>> f = a(gm.av, () -> ko.b);
/*    */   
/* 49 */   public static final gm<csz> g = a(gm.aw, () -> kl.b);
/* 50 */   public static final gm<cok> h = a(gm.ax, kk::a);
/*    */   
/* 52 */   public static final gm<bsv> i = a(gm.ay, () -> kt.a);
/*    */   
/* 54 */   public static final gm<chp> j = a(gm.ar, chp::i);
/*    */   
/*    */   private static <T> gm<T> a(vj<? extends gm<T>> ☃, Supplier<T> supplier) {
/* 57 */     return a(☃, Lifecycle.stable(), supplier);
/*    */   }
/*    */   
/*    */   private static <T> gm<T> a(vj<? extends gm<T>> ☃, Lifecycle lifecycle, Supplier<T> supplier) {
/* 61 */     return a(☃, new gi<>(☃, lifecycle), supplier, lifecycle);
/*    */   }
/*    */ 
/*    */   
/*    */   private static <T, R extends gs<T>> R a(vj<? extends gm<T>> ☃, R r, Supplier<T> supplier, Lifecycle lifecycle) {
/* 66 */     vk vk = ☃.a();
/* 67 */     k.put(vk, supplier);
/*    */     
/* 69 */     gs<gs<?>> gs1 = l;
/* 70 */     return (R)gs1.<gs>a(☃, (gs)r, lifecycle);
/*    */   }
/*    */   
/*    */   static {
/* 74 */     k.forEach((☃, supplier) -> {
/*    */           if (supplier.get() == null) {
/*    */             a.error("Unable to bootstrap registry '{}'", ☃);
/*    */           }
/*    */         });
/*    */     
/* 80 */     gm.a(l);
/*    */   }
/*    */   
/*    */   public static <T> T a(gm<? super T> ☃, String str, T t) {
/* 84 */     return a(☃, new vk(str), t);
/*    */   }
/*    */   
/*    */   public static <V, T extends V> T a(gm<V> ☃, vk vk1, T t) {
/* 88 */     return (T)((gs)☃).a(vj.a(☃.f(), vk1), t, Lifecycle.stable());
/*    */   }
/*    */   
/*    */   public static <V, T extends V> T a(gm<V> ☃, int i, vj<V> vj1, T t) {
/* 92 */     return (T)((gs)☃).a(i, vj1, t, Lifecycle.stable());
/*    */   }
/*    */   
/*    */   public static void a() {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */