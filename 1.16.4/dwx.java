/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class dwx
/*     */ {
/*     */   private final GameProfile a;
/*  20 */   private final Map<MinecraftProfileTexture.Type, vk> b = Maps.newEnumMap(MinecraftProfileTexture.Type.class);
/*     */   private bru c;
/*     */   private int d;
/*     */   private boolean e;
/*     */   @Nullable
/*     */   private String f;
/*     */   @Nullable
/*     */   private nr g;
/*     */   private int h;
/*     */   private int i;
/*     */   private long j;
/*     */   private long k;
/*     */   private long l;
/*     */   
/*     */   public dwx(qi.b ☃) {
/*  35 */     this.a = ☃.a();
/*  36 */     this.c = ☃.c();
/*  37 */     this.d = ☃.b();
/*  38 */     this.g = ☃.d();
/*     */   }
/*     */   
/*     */   public GameProfile a() {
/*  42 */     return this.a;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bru b() {
/*  47 */     return this.c;
/*     */   }
/*     */   
/*     */   protected void a(bru ☃) {
/*  51 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public int c() {
/*  55 */     return this.d;
/*     */   }
/*     */   
/*     */   protected void a(int ☃) {
/*  59 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean e() {
/*  67 */     return (g() != null);
/*     */   }
/*     */   
/*     */   public String f() {
/*  71 */     if (this.f == null) {
/*  72 */       return ekj.b(this.a.getId());
/*     */     }
/*  74 */     return this.f;
/*     */   }
/*     */   
/*     */   public vk g() {
/*  78 */     k();
/*     */     
/*  80 */     return (vk)MoreObjects.firstNonNull(this.b.get(MinecraftProfileTexture.Type.SKIN), ekj.a(this.a.getId()));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public vk h() {
/*  85 */     k();
/*     */     
/*  87 */     return this.b.get(MinecraftProfileTexture.Type.CAPE);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public vk i() {
/*  92 */     k();
/*     */     
/*  94 */     return this.b.get(MinecraftProfileTexture.Type.ELYTRA);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ddl j() {
/*  99 */     return (djz.C()).r.G().i(a().getName());
/*     */   }
/*     */   
/*     */   protected void k() {
/* 103 */     synchronized (this) {
/* 104 */       if (!this.e) {
/* 105 */         this.e = true;
/* 106 */         djz.C().Z().a(this.a, (☃, vk1, minecraftProfileTexture) -> { this.b.put(☃, vk1); if (☃ == MinecraftProfileTexture.Type.SKIN) { this.f = minecraftProfileTexture.getMetadata("model"); if (this.f == null) this.f = "default";  }  }true);
/*     */       } 
/*     */     } 
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(@Nullable nr ☃) {
/* 124 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public nr l() {
/* 129 */     return this.g;
/*     */   }
/*     */   
/*     */   public int m() {
/* 133 */     return this.h;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 137 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public int n() {
/* 141 */     return this.i;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 145 */     this.i = ☃;
/*     */   }
/*     */   
/*     */   public long o() {
/* 149 */     return this.j;
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/* 153 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   public long p() {
/* 157 */     return this.k;
/*     */   }
/*     */   
/*     */   public void b(long ☃) {
/* 161 */     this.k = ☃;
/*     */   }
/*     */   
/*     */   public long q() {
/* 165 */     return this.l;
/*     */   }
/*     */   
/*     */   public void c(long ☃) {
/* 169 */     this.l = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */