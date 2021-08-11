/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   private final aag a;
/* 122 */   private final Map<daz<?>, Object> b = Maps.newIdentityHashMap();
/* 123 */   private final Map<vk, cyv.b> c = Maps.newHashMap();
/*     */   
/*     */   private Random d;
/*     */   private float e;
/*     */   
/*     */   public a(aag ☃) {
/* 129 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public a a(Random ☃) {
/* 133 */     this.d = ☃;
/* 134 */     return this;
/*     */   }
/*     */   
/*     */   public a a(long ☃) {
/* 138 */     if (☃ != 0L) {
/* 139 */       this.d = new Random(☃);
/*     */     }
/* 141 */     return this;
/*     */   }
/*     */   
/*     */   public a a(long ☃, Random random) {
/* 145 */     if (☃ == 0L) {
/* 146 */       this.d = random;
/*     */     } else {
/* 148 */       this.d = new Random(☃);
/*     */     } 
/* 150 */     return this;
/*     */   }
/*     */   
/*     */   public a a(float ☃) {
/* 154 */     this.e = ☃;
/* 155 */     return this;
/*     */   }
/*     */   
/*     */   public <T> a a(daz<T> ☃, T t) {
/* 159 */     this.b.put(☃, t);
/* 160 */     return this;
/*     */   }
/*     */   
/*     */   public <T> a b(daz<T> ☃, @Nullable T t) {
/* 164 */     if (t == null) {
/* 165 */       this.b.remove(☃);
/*     */     } else {
/* 167 */       this.b.put(☃, t);
/*     */     } 
/* 169 */     return this;
/*     */   }
/*     */   
/*     */   public a a(vk ☃, cyv.b b1) {
/* 173 */     cyv.b b2 = this.c.put(☃, b1);
/*     */     
/* 175 */     if (b2 != null) {
/* 176 */       throw new IllegalStateException("Duplicated dynamic drop '" + this.c + "'");
/*     */     }
/*     */     
/* 179 */     return this;
/*     */   }
/*     */   
/*     */   public aag a() {
/* 183 */     return this.a;
/*     */   }
/*     */   
/*     */   public <T> T a(daz<T> ☃) {
/* 187 */     T t = (T)this.b.get(☃);
/* 188 */     if (t == null) {
/* 189 */       throw new IllegalArgumentException("No parameter " + ☃);
/*     */     }
/* 191 */     return t;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <T> T b(daz<T> ☃) {
/* 197 */     return (T)this.b.get(☃);
/*     */   }
/*     */   
/*     */   public cyv a(dba ☃) {
/* 201 */     Sets.SetView setView1 = Sets.difference(this.b.keySet(), ☃.b());
/* 202 */     if (!setView1.isEmpty()) {
/* 203 */       throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + setView1);
/*     */     }
/*     */     
/* 206 */     Sets.SetView setView2 = Sets.difference(☃.a(), this.b.keySet());
/* 207 */     if (!setView2.isEmpty()) {
/* 208 */       throw new IllegalArgumentException("Missing required parameters: " + setView2);
/*     */     }
/*     */     
/* 211 */     Random random = this.d;
/* 212 */     if (random == null) {
/* 213 */       random = new Random();
/*     */     }
/*     */     
/* 216 */     MinecraftServer minecraftServer = this.a.l();
/* 217 */     return new cyv(random, this.e, this.a, minecraftServer.aJ()::a, minecraftServer.aK()::a, this.b, this.c, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyv$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */