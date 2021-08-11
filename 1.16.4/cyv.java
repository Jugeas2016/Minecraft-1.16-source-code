/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.TypeAdapter;
/*     */ import com.google.gson.stream.JsonReader;
/*     */ import com.google.gson.stream.JsonWriter;
/*     */ import java.io.IOException;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cyv
/*     */ {
/*     */   private final Random a;
/*     */   private final float b;
/*     */   private final aag c;
/*     */   private final Function<vk, cyy> d;
/*  39 */   private final Set<cyy> e = Sets.newLinkedHashSet();
/*     */   
/*     */   private final Function<vk, dbo> f;
/*  42 */   private final Set<dbo> g = Sets.newLinkedHashSet();
/*     */   
/*     */   private final Map<daz<?>, Object> h;
/*     */   
/*     */   private final Map<vk, b> i;
/*     */   
/*     */   private cyv(Random ☃, float f, aag aag1, Function<vk, cyy> function, Function<vk, dbo> function1, Map<daz<?>, Object> map, Map<vk, b> map1) {
/*  49 */     this.a = ☃;
/*  50 */     this.b = f;
/*  51 */     this.c = aag1;
/*  52 */     this.d = function;
/*  53 */     this.f = function1;
/*  54 */     this.h = (Map<daz<?>, Object>)ImmutableMap.copyOf(map);
/*  55 */     this.i = (Map<vk, b>)ImmutableMap.copyOf(map1);
/*     */   }
/*     */   
/*     */   public boolean a(daz<?> ☃) {
/*  59 */     return this.h.containsKey(☃);
/*     */   }
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
/*     */   public void a(vk ☃, Consumer<bmb> consumer) {
/*  72 */     b b = this.i.get(☃);
/*  73 */     if (b != null) {
/*  74 */       b.add(this, consumer);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <T> T c(daz<T> ☃) {
/*  81 */     return (T)this.h.get(☃);
/*     */   }
/*     */   
/*     */   public boolean a(cyy ☃) {
/*  85 */     return this.e.add(☃);
/*     */   }
/*     */   
/*     */   public void b(cyy ☃) {
/*  89 */     this.e.remove(☃);
/*     */   }
/*     */   
/*     */   public boolean a(dbo ☃) {
/*  93 */     return this.g.add(☃);
/*     */   }
/*     */   
/*     */   public void b(dbo ☃) {
/*  97 */     this.g.remove(☃);
/*     */   }
/*     */   
/*     */   public cyy a(vk ☃) {
/* 101 */     return this.d.apply(☃);
/*     */   }
/*     */   
/*     */   public dbo b(vk ☃) {
/* 105 */     return this.f.apply(☃);
/*     */   }
/*     */   
/*     */   public Random a() {
/* 109 */     return this.a;
/*     */   }
/*     */   
/*     */   public float b() {
/* 113 */     return this.b;
/*     */   }
/*     */   
/*     */   public aag c() {
/* 117 */     return this.c;
/*     */   }
/*     */   @FunctionalInterface
/*     */   public static interface b {
/*     */     void add(cyv param1cyv, Consumer<bmb> param1Consumer); }
/* 122 */   public static class a { private final Map<daz<?>, Object> b = Maps.newIdentityHashMap(); private final aag a;
/* 123 */     private final Map<vk, cyv.b> c = Maps.newHashMap();
/*     */     
/*     */     private Random d;
/*     */     private float e;
/*     */     
/*     */     public a(aag ☃) {
/* 129 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public a a(Random ☃) {
/* 133 */       this.d = ☃;
/* 134 */       return this;
/*     */     }
/*     */     
/*     */     public a a(long ☃) {
/* 138 */       if (☃ != 0L) {
/* 139 */         this.d = new Random(☃);
/*     */       }
/* 141 */       return this;
/*     */     }
/*     */     
/*     */     public a a(long ☃, Random random) {
/* 145 */       if (☃ == 0L) {
/* 146 */         this.d = random;
/*     */       } else {
/* 148 */         this.d = new Random(☃);
/*     */       } 
/* 150 */       return this;
/*     */     }
/*     */     
/*     */     public a a(float ☃) {
/* 154 */       this.e = ☃;
/* 155 */       return this;
/*     */     }
/*     */     
/*     */     public <T> a a(daz<T> ☃, T t) {
/* 159 */       this.b.put(☃, t);
/* 160 */       return this;
/*     */     }
/*     */     
/*     */     public <T> a b(daz<T> ☃, @Nullable T t) {
/* 164 */       if (t == null) {
/* 165 */         this.b.remove(☃);
/*     */       } else {
/* 167 */         this.b.put(☃, t);
/*     */       } 
/* 169 */       return this;
/*     */     }
/*     */     
/*     */     public a a(vk ☃, cyv.b b1) {
/* 173 */       cyv.b b2 = this.c.put(☃, b1);
/*     */       
/* 175 */       if (b2 != null) {
/* 176 */         throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
/*     */       }
/*     */       
/* 179 */       return this;
/*     */     }
/*     */     
/*     */     public aag a() {
/* 183 */       return this.a;
/*     */     }
/*     */     
/*     */     public <T> T a(daz<T> ☃) {
/* 187 */       T t = (T)this.b.get(☃);
/* 188 */       if (t == null) {
/* 189 */         throw new IllegalArgumentException("No parameter " + ☃);
/*     */       }
/* 191 */       return t;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public <T> T b(daz<T> ☃) {
/* 197 */       return (T)this.b.get(☃);
/*     */     }
/*     */     
/*     */     public cyv a(dba ☃) {
/* 201 */       Sets.SetView setView1 = Sets.difference(this.b.keySet(), ☃.b());
/* 202 */       if (!setView1.isEmpty()) {
/* 203 */         throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + setView1);
/*     */       }
/*     */       
/* 206 */       Sets.SetView setView2 = Sets.difference(☃.a(), this.b.keySet());
/* 207 */       if (!setView2.isEmpty()) {
/* 208 */         throw new IllegalArgumentException("Missing required parameters: " + setView2);
/*     */       }
/*     */       
/* 211 */       Random random = this.d;
/* 212 */       if (random == null) {
/* 213 */         random = new Random();
/*     */       }
/*     */       
/* 216 */       MinecraftServer minecraftServer = this.a.l();
/* 217 */       return new cyv(random, this.e, this.a, minecraftServer.aJ()::a, minecraftServer.aK()::a, this.b, this.c);
/*     */     } }
/*     */ 
/*     */   
/*     */   public enum c {
/* 222 */     a("this", dbc.a),
/* 223 */     b("killer", dbc.d),
/* 224 */     c("direct_killer", dbc.e),
/* 225 */     d("killer_player", dbc.b);
/*     */     
/*     */     private final String e;
/*     */     
/*     */     private final daz<? extends aqa> f;
/*     */ 
/*     */     
/*     */     c(String ☃, daz<? extends aqa> daz1) {
/* 233 */       this.e = ☃;
/* 234 */       this.f = daz1;
/*     */     }
/*     */     
/*     */     public daz<? extends aqa> a() {
/* 238 */       return this.f;
/*     */     }
/*     */     
/*     */     public static c a(String ☃) {
/* 242 */       for (c c1 : values()) {
/* 243 */         if (c1.e.equals(☃)) {
/* 244 */           return c1;
/*     */         }
/*     */       } 
/* 247 */       throw new IllegalArgumentException("Invalid entity target " + ☃);
/*     */     }
/*     */     
/*     */     public static class a
/*     */       extends TypeAdapter<c> {
/*     */       public void a(JsonWriter ☃, cyv.c c1) throws IOException {
/* 253 */         ☃.value(cyv.c.a(c1));
/*     */       }
/*     */ 
/*     */       
/*     */       public cyv.c a(JsonReader ☃) throws IOException {
/* 258 */         return cyv.c.a(☃.nextString());
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */