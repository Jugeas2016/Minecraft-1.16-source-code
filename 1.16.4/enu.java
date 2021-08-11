/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.reflect.TypeToken;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.Reader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class enu
/*     */   extends ack<enu.a>
/*     */ {
/*  40 */   public static final emq a = new emq("meta:missing_sound", 1.0F, 1.0F, 1, emq.a.a, false, false, 16);
/*  41 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  43 */   private static final Gson c = (new GsonBuilder())
/*  44 */     .registerTypeHierarchyAdapter(nr.class, new nr.a())
/*  45 */     .registerTypeAdapter(emr.class, new ems())
/*  46 */     .create();
/*     */   
/*  48 */   private static final TypeToken<Map<String, emr>> d = new TypeToken<Map<String, emr>>() {  }
/*  49 */   ; private final Map<vk, env> e = Maps.newHashMap();
/*     */   private final enr f;
/*     */   
/*     */   public enu(ach ☃, dkd dkd1) {
/*  53 */     this.f = new enr(this, dkd1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected a a(ach ☃, anw anw1) {
/*  58 */     a a = new a();
/*     */     
/*  60 */     anw1.a();
/*  61 */     for (String str : ☃.a()) {
/*  62 */       anw1.a(str);
/*     */       try {
/*  64 */         List<acg> list = ☃.c(new vk(str, "sounds.json"));
/*  65 */         for (acg acg : list) {
/*  66 */           anw1.a(acg.d());
/*  67 */           try(InputStream ☃ = acg.b(); Reader ☃ = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
/*  68 */             anw1.a("parse");
/*  69 */             Map<String, emr> map = afd.<Map<String, emr>>a(c, reader, d);
/*  70 */             anw1.b("register");
/*  71 */             for (Map.Entry<String, emr> entry : map.entrySet()) {
/*  72 */               a.a(a, new vk(str, entry.getKey()), entry.getValue(), ☃);
/*     */             }
/*  74 */             anw1.c();
/*  75 */           } catch (RuntimeException runtimeException) {
/*  76 */             b.warn("Invalid sounds.json in resourcepack: '{}'", acg.d(), runtimeException);
/*     */           } 
/*  78 */           anw1.c();
/*     */         } 
/*  80 */       } catch (IOException iOException) {}
/*     */       
/*  82 */       anw1.c();
/*     */     } 
/*     */     
/*  85 */     anw1.b();
/*  86 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(a ☃, ach ach1, anw anw1) {
/*  91 */     ☃.a(this.e, this.f);
/*     */ 
/*     */ 
/*     */     
/*  95 */     for (vk vk : this.e.keySet()) {
/*  96 */       env env = this.e.get(vk);
/*     */       
/*  98 */       if (env.c() instanceof of) {
/*  99 */         String str = ((of)env.c()).i();
/* 100 */         if (!ekx.a(str)) {
/* 101 */           b.debug("Missing subtitle {} for event: {}", str, vk);
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 108 */     if (b.isDebugEnabled()) {
/* 109 */       for (vk vk : this.e.keySet()) {
/* 110 */         if (!gm.N.c(vk)) {
/* 111 */           b.debug("Not having sound event for: {}", vk);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 116 */     this.f.a();
/*     */   }
/*     */   
/*     */   public static class a {
/* 120 */     private final Map<vk, env> a = Maps.newHashMap();
/*     */     
/*     */     private void a(vk ☃, emr emr1, ach ach1) {
/* 123 */       env env = this.a.get(☃);
/* 124 */       boolean bool = (env == null);
/* 125 */       if (bool || emr1.b()) {
/* 126 */         if (!bool) {
/* 127 */           enu.h().debug("Replaced sound event location {}", ☃);
/*     */         }
/* 129 */         env = new env(☃, emr1.c());
/* 130 */         this.a.put(☃, env);
/*     */       } 
/*     */       
/* 133 */       for (emq emq : emr1.a()) {
/* 134 */         enw<emq> enw; vk vk1 = emq.a();
/*     */ 
/*     */         
/* 137 */         switch (enu.null.a[emq.g().ordinal()]) {
/*     */           case 1:
/* 139 */             if (!enu.a(emq, ☃, ach1)) {
/*     */               continue;
/*     */             }
/*     */             
/* 143 */             enw = emq;
/*     */             break;
/*     */           case 2:
/* 146 */             enw = new enw<emq>(this, vk1, emq)
/*     */               {
/*     */                 public int e() {
/* 149 */                   env ☃ = (env)enu.a.a(this.c).get(this.a);
/* 150 */                   return (☃ == null) ? 0 : ☃.e();
/*     */                 }
/*     */ 
/*     */                 
/*     */                 public emq a() {
/* 155 */                   env ☃ = (env)enu.a.a(this.c).get(this.a);
/* 156 */                   if (☃ == null) {
/* 157 */                     return enu.a;
/*     */                   }
/*     */ 
/*     */                   
/* 161 */                   emq emq1 = ☃.a();
/* 162 */                   return new emq(emq1
/* 163 */                       .a().toString(), emq1
/* 164 */                       .c() * this.b.c(), emq1
/* 165 */                       .d() * this.b.d(), this.b
/* 166 */                       .e(), emq.a.a, (emq1
/*     */                       
/* 168 */                       .h() || this.b.h()), emq1
/* 169 */                       .i(), emq1
/* 170 */                       .j());
/*     */                 }
/*     */ 
/*     */ 
/*     */                 
/*     */                 public void a(enr ☃) {
/* 176 */                   env env = (env)enu.a.a(this.c).get(this.a);
/* 177 */                   if (env == null) {
/*     */                     return;
/*     */                   }
/* 180 */                   env.a(☃);
/*     */                 }
/*     */               };
/*     */             break;
/*     */           default:
/* 185 */             throw new IllegalStateException("Unknown SoundEventRegistration type: " + emq.g());
/*     */         } 
/*     */         
/* 188 */         env.a(enw);
/*     */       } 
/*     */     }
/*     */     
/*     */     public void a(Map<vk, env> ☃, enr enr1) {
/* 193 */       ☃.clear();
/*     */       
/* 195 */       for (Map.Entry<vk, env> entry : this.a.entrySet()) {
/* 196 */         ☃.put(entry.getKey(), entry.getValue());
/* 197 */         ((env)entry.getValue()).a(enr1);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean b(emq ☃, vk vk1, ach ach1) {
/* 203 */     vk vk2 = ☃.b();
/* 204 */     if (!ach1.b(vk2)) {
/* 205 */       b.warn("File {} does not exist, cannot add it to event {}", vk2, vk1);
/* 206 */       return false;
/*     */     } 
/* 208 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public env a(vk ☃) {
/* 213 */     return this.e.get(☃);
/*     */   }
/*     */   
/*     */   public Collection<vk> a() {
/* 217 */     return this.e.keySet();
/*     */   }
/*     */   
/*     */   public void a(emu ☃) {
/* 221 */     this.f.a(☃);
/*     */   }
/*     */   
/*     */   public void a(emt ☃) {
/* 225 */     this.f.c(☃);
/*     */   }
/*     */   
/*     */   public void a(emt ☃, int i) {
/* 229 */     this.f.a(☃, i);
/*     */   }
/*     */   
/*     */   public void a(djk ☃) {
/* 233 */     this.f.a(☃);
/*     */   }
/*     */   
/*     */   public void b() {
/* 237 */     this.f.d();
/*     */   }
/*     */   
/*     */   public void d() {
/* 241 */     this.f.c();
/*     */   }
/*     */   
/*     */   public void e() {
/* 245 */     this.f.b();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 249 */     this.f.a(☃);
/*     */   }
/*     */   
/*     */   public void f() {
/* 253 */     this.f.e();
/*     */   }
/*     */   
/*     */   public void a(adr ☃, float f) {
/* 257 */     if (☃ == adr.a && f <= 0.0F) {
/* 258 */       d();
/*     */     }
/*     */     
/* 261 */     this.f.a(☃, f);
/*     */   }
/*     */   
/*     */   public void b(emt ☃) {
/* 265 */     this.f.a(☃);
/*     */   }
/*     */   
/*     */   public boolean c(emt ☃) {
/* 269 */     return this.f.b(☃);
/*     */   }
/*     */   
/*     */   public void a(ent ☃) {
/* 273 */     this.f.a(☃);
/*     */   }
/*     */   
/*     */   public void b(ent ☃) {
/* 277 */     this.f.b(☃);
/*     */   }
/*     */   
/*     */   public void a(@Nullable vk ☃, @Nullable adr adr1) {
/* 281 */     this.f.a(☃, adr1);
/*     */   }
/*     */   
/*     */   public String g() {
/* 285 */     return this.f.f();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */