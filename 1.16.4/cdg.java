/*     */ import com.google.common.collect.Iterables;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import com.mojang.authlib.properties.Property;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cdg
/*     */   extends ccj
/*     */   implements cdm
/*     */ {
/*     */   @Nullable
/*     */   private static acq a;
/*     */   @Nullable
/*     */   private static MinecraftSessionService b;
/*     */   @Nullable
/*     */   private GameProfile c;
/*     */   private int g;
/*     */   private boolean h;
/*     */   
/*     */   public cdg() {
/*  33 */     super(cck.o);
/*     */   }
/*     */   
/*     */   public static void a(acq ☃) {
/*  37 */     a = ☃;
/*     */   }
/*     */   
/*     */   public static void a(MinecraftSessionService ☃) {
/*  41 */     b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  46 */     super.a(☃);
/*     */     
/*  48 */     if (this.c != null) {
/*  49 */       md md1 = new md();
/*  50 */       mp.a(md1, this.c);
/*  51 */       ☃.a("SkullOwner", md1);
/*     */     } 
/*     */     
/*  54 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  59 */     super.a(☃, md1);
/*     */     
/*  61 */     if (md1.c("SkullOwner", 10)) {
/*  62 */       a(mp.a(md1.p("SkullOwner")));
/*  63 */     } else if (md1.c("ExtraType", 8)) {
/*  64 */       String str = md1.l("ExtraType");
/*  65 */       if (!aft.b(str)) {
/*  66 */         a(new GameProfile(null, str));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/*  73 */     ceh ☃ = p();
/*  74 */     if (☃.a(bup.fm) || ☃.a(bup.fn)) {
/*  75 */       if (this.d.r(this.e)) {
/*  76 */         this.h = true;
/*  77 */         this.g++;
/*     */       } else {
/*  79 */         this.h = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/*  85 */     if (this.h) {
/*  86 */       return this.g + ☃;
/*     */     }
/*  88 */     return this.g;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public GameProfile d() {
/*  93 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/*  99 */     return new ow(this.e, 4, b());
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/* 104 */     return a(new md());
/*     */   }
/*     */   
/*     */   public void a(@Nullable GameProfile ☃) {
/* 108 */     this.c = ☃;
/* 109 */     f();
/*     */   }
/*     */   
/*     */   private void f() {
/* 113 */     this.c = b(this.c);
/* 114 */     X_();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static GameProfile b(@Nullable GameProfile ☃) {
/* 119 */     if (☃ == null || aft.b(☃.getName()))
/* 120 */       return ☃; 
/* 121 */     if (☃.isComplete() && ☃.getProperties().containsKey("textures")) {
/* 122 */       return ☃;
/*     */     }
/*     */     
/* 125 */     if (a == null || b == null) {
/* 126 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/* 130 */     GameProfile gameProfile = a.a(☃.getName());
/* 131 */     if (gameProfile == null) {
/* 132 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/* 136 */     Property property = (Property)Iterables.getFirst(gameProfile.getProperties().get("textures"), null);
/* 137 */     if (property == null) {
/* 138 */       gameProfile = b.fillProfileProperties(gameProfile, true);
/*     */     }
/* 140 */     return gameProfile;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cdg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */