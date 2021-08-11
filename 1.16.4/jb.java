/*    */ import com.google.gson.JsonElement;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jb
/*    */ {
/* 13 */   public static final a a = a(iz::a, iy.c);
/* 14 */   public static final a b = a(iz::a, iy.d);
/* 15 */   public static final a c = a(iz::j, iy.e);
/* 16 */   public static final a d = a(iz::j, iy.f);
/* 17 */   public static final a e = a(iz::m, iy.h);
/* 18 */   public static final a f = a(iz::k, iy.g);
/*    */   
/* 20 */   public static final a g = a(iz::x, iy.i);
/* 21 */   public static final a h = a(iz::w, iy.j);
/*    */   
/* 23 */   public static final a i = a(iz::f, iy.aa);
/* 24 */   public static final a j = a(iz::h, iy.ad);
/* 25 */   public static final a k = a(iz::i, iy.ab);
/* 26 */   public static final a l = a(iz::q, iy.F);
/* 27 */   public static final a m = a(iz::z, iy.am);
/* 28 */   public static final a n = a(iz::a, iy.I);
/* 29 */   public static final a o = a(iz::t, iy.ax);
/* 30 */   public static final a p = a(iz::t, iy.ay);
/* 31 */   public static final a q = a(iz::b, iy.aE);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 36 */   public static final a r = a(iz::l, iy.e);
/* 37 */   public static final a s = a(iz::l, iy.f);
/*    */ 
/*    */   
/* 40 */   public static final a t = a(iz::n, iy.h);
/*    */ 
/*    */   
/* 43 */   public static final a u = a(iz::o, iy.e);
/*    */   
/*    */   private final iz v;
/*    */   private final ix w;
/*    */   
/*    */   private jb(iz ☃, ix ix1) {
/* 49 */     this.v = ☃;
/* 50 */     this.w = ix1;
/*    */   }
/*    */   
/*    */   public ix a() {
/* 54 */     return this.w;
/*    */   }
/*    */   
/*    */   public iz b() {
/* 58 */     return this.v;
/*    */   }
/*    */   
/*    */   public jb a(Consumer<iz> ☃) {
/* 62 */     ☃.accept(this.v);
/* 63 */     return this;
/*    */   }
/*    */   
/*    */   public vk a(buo ☃, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 67 */     return this.w.a(☃, this.v, biConsumer);
/*    */   }
/*    */   
/*    */   public vk a(buo ☃, String str, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 71 */     return this.w.a(☃, str, this.v, biConsumer);
/*    */   }
/*    */   
/*    */   private static a a(Function<buo, iz> ☃, ix ix1) {
/* 75 */     return buo1 -> new jb(☃.apply(buo1), ix1);
/*    */   }
/*    */   
/*    */   public static jb a(vk ☃) {
/* 79 */     return new jb(iz.b(☃), iy.c);
/*    */   }
/*    */   
/*    */   @FunctionalInterface
/*    */   public static interface a {
/*    */     jb get(buo param1buo);
/*    */     
/*    */     default vk a(buo ☃, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 87 */       return get(☃).a(☃, biConsumer);
/*    */     }
/*    */     
/*    */     default vk a(buo ☃, String str, BiConsumer<vk, Supplier<JsonElement>> biConsumer) {
/* 91 */       return get(☃).a(☃, str, biConsumer);
/*    */     }
/*    */     
/*    */     default a a(Consumer<iz> ☃) {
/* 95 */       return buo1 -> get(buo1).a(☃);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */