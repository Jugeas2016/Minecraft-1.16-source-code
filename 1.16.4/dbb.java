/*     */ import com.google.common.collect.BiMap;
/*     */ import com.google.common.collect.HashBiMap;
/*     */ import java.util.function.Consumer;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dbb
/*     */ {
/*  11 */   private static final BiMap<vk, dba> m = (BiMap<vk, dba>)HashBiMap.create(); public static final dba b; public static final dba c;
/*     */   public static final dba d;
/*  13 */   public static final dba a = a("empty", ☃ -> {
/*     */       
/*  15 */       }); public static final dba e; static { b = a("chest", ☃ -> ☃.a(dbc.f).b(dbc.a));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  20 */     c = a("command", ☃ -> ☃.a(dbc.f).b(dbc.a));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  25 */     d = a("selector", ☃ -> ☃.a(dbc.f).a(dbc.a));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  30 */     e = a("fishing", ☃ -> ☃.a(dbc.f).a(dbc.i).b(dbc.a));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  36 */     f = a("entity", ☃ -> ☃.a(dbc.a).a(dbc.f).a(dbc.c).b(dbc.d).b(dbc.e).b(dbc.b));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  45 */     g = a("gift", ☃ -> ☃.a(dbc.f).a(dbc.a));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     h = a("barter", ☃ -> ☃.a(dbc.a));
/*     */ 
/*     */ 
/*     */     
/*  54 */     i = a("advancement_reward", ☃ -> ☃.a(dbc.a).a(dbc.f));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  59 */     j = a("advancement_entity", ☃ -> ☃.a(dbc.a).a(dbc.f));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     k = a("generic", ☃ -> ☃.a(dbc.a).a(dbc.b).a(dbc.c).a(dbc.d).a(dbc.e).a(dbc.f).a(dbc.g).a(dbc.h).a(dbc.i).a(dbc.j));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     l = a("block", ☃ -> ☃.a(dbc.g).a(dbc.f).a(dbc.i).b(dbc.a).b(dbc.h).b(dbc.j)); }
/*     */   
/*     */   public static final dba f; public static final dba g;
/*     */   public static final dba h;
/*     */   public static final dba i;
/*     */   public static final dba j;
/*     */   public static final dba k;
/*     */   public static final dba l;
/*     */   
/*     */   private static dba a(String ☃, Consumer<dba.a> consumer) {
/*  87 */     dba.a a = new dba.a();
/*  88 */     consumer.accept(a);
/*  89 */     dba dba1 = a.a();
/*  90 */     vk vk = new vk(☃);
/*  91 */     dba dba2 = (dba)m.put(vk, dba1);
/*  92 */     if (dba2 != null) {
/*  93 */       throw new IllegalStateException("Loot table parameter set " + vk + " is already registered");
/*     */     }
/*  95 */     return dba1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static dba a(vk ☃) {
/* 100 */     return (dba)m.get(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static vk a(dba ☃) {
/* 105 */     return (vk)m.inverse().get(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */